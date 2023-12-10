USE N5_PolyShoes
GO

IF OBJECT_ID('Tao_Hoa_Don') IS NOT NULL
	DROP PROC Tao_Hoa_Don
GO
CREATE PROCEDURE Tao_Hoa_Don
	@IDNV INT,
	@IDKH INT,
	@MaHD VARCHAR(10)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = 'INSERT INTO Hoa_Don (IDNhanVien, IDKhachHang, MaHD, NgayThanhToan, TongTien, TrangThai)
				VALUES(@IDNV, @IDKH, @MaHD, GETDATE(), 0, 1);' --Trạng thái 0: Đã thanh toán, 1: chờ thanh toán
    EXEC sp_executesql @sql, N'@IDNV INT, @IDKH INT, @MaHD VARCHAR(10)', @IDNV, @IDKH, @MaHD
END
GO

--UPDATE Hoa_Don SET Deleted = 1 WHERE MaHD = ?

IF OBJECT_ID('Get_HD_By_MaHD') IS NOT NULL
	DROP PROC Get_HD_By_MaHD
GO
CREATE PROCEDURE Get_HD_By_MaHD
	@MaHD VARCHAR(10),
	@TrangThai BIT
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = '
		SELECT  Hoa_Don.ID, Hoa_Don.MaHD, Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Nhan_Vien.MaNV, SUM(Hoa_Don_Chi_Tiet.SoLuong) AS TongSP,
				Khach_Hang.HoTen, Hoa_Don.TongTien, Hoa_Don.TrangThai, Khuyen_Mai_Chi_Tiet.SoTienGiam, Thanh_Toan.HinhThuc
		FROM    Hoa_Don LEFT JOIN
				Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID LEFT JOIN
				Khach_Hang ON Hoa_Don.IDKhachHang = Khach_Hang.ID LEFT JOIN
				Khuyen_Mai_Chi_Tiet ON Hoa_Don.ID = Khuyen_Mai_Chi_Tiet.ID LEFT JOIN
				Thanh_Toan ON Hoa_Don.ID = Thanh_Toan.ID LEFT JOIN
				Hoa_Don_Chi_Tiet ON Hoa_Don.ID = Hoa_Don_Chi_Tiet.IDHoaDon WHERE MAHD LIKE @MaHD AND Hoa_Don.TrangThai = @TrangThai AND Hoa_Don.Deleted = 0
				GROUP BY Hoa_Don.ID, Hoa_Don.MaHD, Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Nhan_Vien.MaNV,
				Khach_Hang.HoTen, Hoa_Don.TongTien, Hoa_Don.TrangThai, Khuyen_Mai_Chi_Tiet.SoTienGiam, Thanh_Toan.HinhThuc
				ORDER BY Hoa_Don.ID DESC'
    EXEC sp_executesql @sql, N'@MaHD VARCHAR(10), @TrangThai BIT', @MaHD, @TrangThai
END
GO
exec Get_HD_By_MaHD '%', 1
select * from Hoa_Don_Chi_Tiet


IF OBJECT_ID('Them_HDCT') IS NOT NULL
    DROP PROC Them_HDCT
GO
CREATE PROCEDURE Them_HDCT
    @MaSanPham NVARCHAR(10),
    @SoLuongBan INT,
    @IDHD INT
AS
BEGIN
    BEGIN TRANSACTION;
    BEGIN TRY

        DECLARE @IDSanPhamCT INT;

        -- Kiểm tra xem mã sản phẩm chi tiết đã tồn tại trong bảng Hoa_Don_Chi_Tiet hay chưa
        SELECT @IDSanPhamCT = ID
		FROM Hoa_Don_Chi_Tiet
        WHERE IDSanPhamCT = (SELECT ID FROM San_Pham_Chi_Tiet WHERE Ma = @MaSanPham) AND IDHoaDon = @IDHD;

        IF @IDSanPhamCT IS NOT NULL
        BEGIN
            -- Nếu tồn tại, cập nhật số lượng
            UPDATE Hoa_Don_Chi_Tiet
            SET SoLuong = SoLuong + @SoLuongBan,
                ThanhTien = Gia * (SoLuong + @SoLuongBan)
            WHERE ID = @IDSanPhamCT;
        END
        ELSE
        BEGIN
            -- Nếu chưa tồn tại, thêm mới vào bảng Hoa_Don_Chi_Tiet
            DECLARE @Gia MONEY;

            -- Lấy giá từ bảng San_Pham_Chi_Tiet
            SELECT @Gia = Gia
            FROM San_Pham_Chi_Tiet
            WHERE Ma = @MaSanPham;

            INSERT INTO Hoa_Don_Chi_Tiet (IDSanPhamCT, IDHoaDon, Gia, SoLuong, ThanhTien, Deleted)
            VALUES ((SELECT ID FROM San_Pham_Chi_Tiet WHERE Ma = @MaSanPham), @IDHD, @Gia, @SoLuongBan, @Gia * @SoLuongBan, 0);
        END

        -- Cập nhật số lượng tồn kho
        UPDATE San_Pham_Chi_Tiet
        SET SoLuongTon = SoLuongTon - @SoLuongBan
        WHERE Ma = @MaSanPham;

        -- Tính tổng tiền và cập nhật vào hóa đơn
        UPDATE Hoa_Don
        SET TongTien = (
                SELECT SUM(ThanhTien) AS TongTien
                FROM Hoa_Don_Chi_Tiet
                WHERE IDHoaDon = @IDHD
            )
        WHERE ID = @IDHD;

        COMMIT;
    END TRY
    BEGIN CATCH
        ROLLBACK;
        -- Xử lý nếu có lỗi
        SELECT ERROR_MESSAGE() AS ErrorMessage;
    END CATCH;
END;
GO
select * from Hoa_Don_Chi_Tiet



IF OBJECT_ID('Giam_SL_GioHang') IS NOT NULL
    DROP PROC Giam_SL_GioHang
GO
CREATE PROCEDURE Giam_SL_GioHang
    @soLuong INT,
	@IDSPCT INT,
	@MaSPCT VARCHAR(10)
AS
BEGIN
    BEGIN TRANSACTION;
    BEGIN TRY
		-- giảm số lượng sản phẩm chi tiết trong giỏ hàng
		UPDATE Hoa_Don_Chi_Tiet SET SoLuong = SoLuong - @soLuong WHERE IDSanPhamCT = @IDSPCT

		-- tính lại thành tiên
		UPDATE Hoa_Don_Chi_Tiet SET ThanhTien = SoLuong * Gia WHERE IDSanPhamCT = @IDSPCT

		-- tăng số lượng sản phẩm chi tiết trong bảng San_Pham_Chi_Tiet
		UPDATE San_Pham_Chi_Tiet SET SoLuongTon = SoLuongTon + @soLuong WHERE Ma = @MaSPCT
        COMMIT;
    END TRY
    BEGIN CATCH
        ROLLBACK;
    END CATCH;
END;
GO

SELECT name
FROM sys.procedures
WHERE type = 'P';

sp_helptext 'ThanhToanHD';

CREATE PROC Loc_SPCT   
 @Ma VARCHAR(10) = '%',  
 @DanhMuc NVARCHAR(50) = '%',  
 @XuatXu NVARCHAR(50) = '%',  
 @NhaSanXuat NVARCHAR(50) = '%',  
 @Gia BIT = 0  
AS  
BEGIN  
    DECLARE @sql NVARCHAR(MAX)  
    SET @sql = N'  
    SELECT  
    ROW_NUMBER() OVER (ORDER BY San_Pham.ID DESC) AS [STT],  
    San_Pham.Ma, San_Pham.Ten, Danh_Muc.Ten, Thuong_Hieu.Ten, Xuat_Xu.Ten, Nha_San_Xuat.Ten, Chat_Lieu.Ten, De_Giay.Ten, Co_Giay.Ten,  
    Mau_Sac.Ten AS Expr8, Size.Size, San_Pham_Chi_Tiet.Gia, San_Pham_Chi_Tiet.SoLuongTon, San_Pham_Chi_Tiet.KhoiLuong, San_Pham_Chi_Tiet.TrangThai  
    FROM San_Pham_Chi_Tiet JOIN  
    San_Pham ON San_Pham_Chi_Tiet.IDSanPham = San_Pham.ID JOIN  
    Size ON San_Pham_Chi_Tiet.IDSize = Size.ID JOIN  
    Thuong_Hieu ON San_Pham_Chi_Tiet.IDThuongHieu = Thuong_Hieu.ID JOIN  
    Xuat_Xu ON San_Pham_Chi_Tiet.IDXuatXu = Xuat_Xu.ID JOIN  
    Mau_Sac ON San_Pham_Chi_Tiet.IDMauSac = Mau_Sac.ID JOIN  
    Nha_San_Xuat ON San_Pham_Chi_Tiet.IDNSX = Nha_San_Xuat.ID JOIN  
    De_Giay ON San_Pham_Chi_Tiet.IDDeGiay = De_Giay.ID JOIN  
    Danh_Muc ON San_Pham_Chi_Tiet.IDDanhMuc = Danh_Muc.ID JOIN  
    Co_Giay ON San_Pham_Chi_Tiet.IDCoGiay = Co_Giay.ID JOIN  
    Chat_Lieu ON San_Pham_Chi_Tiet.IDChatLieu = Chat_Lieu.ID   
    WHERE San_Pham.Ma LIKE @Ma  
     AND Nha_San_Xuat.ten LIKE @NhaSanXuat  
     AND Xuat_Xu.ten LIKE @XuatXu  
     AND Danh_Muc.ten LIKE @DanhMuc  
    ORDER BY   
                    CASE WHEN @Gia = 0 THEN San_Pham_Chi_Tiet.Gia END ASC,  
                    CASE WHEN @Gia = 1 THEN San_Pham_Chi_Tiet.Gia END DESC'  
    EXEC sp_executesql @sql, N'@Ma VARCHAR(10), @DanhMuc NVARCHAR(50), @XuatXu NVARCHAR(50), @NhaSanXuat NVARCHAR(50), @Gia BIT', @Ma, @DanhMuc, @XuatXu, @NhaSanXuat, @Gia  
END  

drop proc get_ALL_SPCT
CREATE PROC get_ALL_SPCT  
 @page INT,  
 @limit INT  
AS  
BEGIN  
    DECLARE @sql NVARCHAR(MAX)  
    SET @sql = 'SELECT ROW_NUMBER() OVER (ORDER BY San_Pham_Chi_tiet.Id DESC) AS [STT],  
	  San_Pham_Chi_Tiet.Ma, San_Pham.Ten, Danh_Muc.Ten, Thuong_Hieu.Ten, Xuat_Xu.Ten, Nha_San_Xuat.Ten, Chat_Lieu.Ten, De_Giay.Ten, Co_Giay.Ten,  
	  Mau_Sac.Ten AS Expr8, Size.Size, San_Pham_Chi_Tiet.Gia, San_Pham_Chi_Tiet.SoLuongTon, San_Pham_Chi_Tiet.KhoiLuong, San_Pham_Chi_Tiet.TrangThai  
	  FROM San_Pham_Chi_Tiet INNER JOIN  
	  San_Pham ON San_Pham_Chi_Tiet.IDSanPham = San_Pham.ID INNER JOIN  
	  Size ON San_Pham_Chi_Tiet.IDSize = Size.ID INNER JOIN  
	  Thuong_Hieu ON San_Pham_Chi_Tiet.IDThuongHieu = Thuong_Hieu.ID INNER JOIN  
			Xuat_Xu ON San_Pham_Chi_Tiet.IDXuatXu = Xuat_Xu.ID INNER JOIN  
			Mau_Sac ON San_Pham_Chi_Tiet.IDMauSac = Mau_Sac.ID INNER JOIN  
			Nha_San_Xuat ON San_Pham_Chi_Tiet.IDNSX = Nha_San_Xuat.ID INNER JOIN  
	  De_Giay ON San_Pham_Chi_Tiet.IDDeGiay = De_Giay.ID INNER JOIN  
			Danh_Muc ON San_Pham_Chi_Tiet.IDDanhMuc = Danh_Muc.ID INNER JOIN  
	  Co_Giay ON San_Pham_Chi_Tiet.IDCoGiay = Co_Giay.ID INNER JOIN  
			Chat_Lieu ON San_Pham_Chi_Tiet.IDChatLieu = Chat_Lieu.ID 
			WHERE San_Pham_Chi_Tiet.TrangThai = 0
	  ORDER BY San_Pham_Chi_Tiet.ID DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY'  
    EXEC sp_executesql @sql, N'@page INT, @limit INT', @page, @limit  
END  

	   select * from Hoa_Don

SELECT    San_Pham_Chi_Tiet.Ma, San_Pham.Ten, Mau_Sac.Ten, Co_Giay.Ten, Size.size, Hoa_Don_Chi_Tiet.Gia, Hoa_Don_Chi_Tiet.SoLuong, Hoa_Don_Chi_Tiet.ThanhTien
                         FROM         Hoa_Don_Chi_Tiet LEFT JOIN
                                               Thanh_Toan ON Hoa_Don_Chi_Tiet.ID = Thanh_Toan.ID LEFT JOIN
                                               San_Pham_Chi_Tiet ON Hoa_Don_Chi_Tiet.IDSanPhamCT = San_Pham_Chi_Tiet.ID LEFT JOIN
											   Mau_Sac ON San_Pham_Chi_Tiet.IDMauSac = Mau_Sac.ID LEFT JOIN
											   Co_Giay ON San_Pham_Chi_Tiet.IDCoGiay = Co_Giay.ID LEFT JOIN
											   Size ON San_Pham_Chi_Tiet.IDSize = Size.ID LEFT JOIN
                                               San_Pham ON San_Pham_Chi_Tiet.IDSanPham = San_Pham.ID LEFT JOIN
                                               Hoa_Don ON Hoa_Don_Chi_Tiet.IDHoaDon = Hoa_Don.ID WHERE Hoa_Don.MaHD = ?





CREATE PROC ThanhToanHD @MaHD VARCHAR(10)  
AS  
BEGIN  
    UPDATE Hoa_Don SET TrangThai = 0 WHERE MaHD = @MaHD  
  
 INSERT INTO [dbo].[Lich_Su_Hoa_Don] ([IDHoaDon],[ThoiGian],[HanhDong],[TrangThai],[NguoiTao],[NgayTao],[NguoiCapNhat],[NgayCapNhat],[Deleted])  SELECT   [ID],   GETDATE() AS [ThoiGian], -- Giả sử ThoiGian là dấu thời gian cho hành động   1 AS [HanhDong],
 -- Giả sử 1 đại diện cho hành động bạn muốn ghi log   [TrangThai],   [NguoiTao],   [NgayTao],   [NguoiCapNhat],   GETDATE() AS  [NgayCapNhat],   [Deleted]  FROM   [dbo].[hoa_don]  WHERE   [MaHD] = @MaHD  
END  








