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
		SELECT  Hoa_Don.ID, Hoa_Don.MaHD, Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Nhan_Vien.MaNV, Khach_Hang.HoTen, Hoa_Don.TongTien, Khuyen_Mai_Chi_Tiet.SoTienGiam, Thanh_Toan.HinhThuc
		FROM    Hoa_Don LEFT JOIN
				Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID LEFT JOIN
				Khach_Hang ON Hoa_Don.IDKhachHang = Khach_Hang.ID LEFT JOIN
				Khuyen_Mai_Chi_Tiet ON Hoa_Don.ID = Khuyen_Mai_Chi_Tiet.ID LEFT JOIN
				Thanh_Toan ON Hoa_Don.ID = Thanh_Toan.ID WHERE MAHD LIKE @MaHD AND Hoa_Don.TrangThai = @TrangThai
				ORDER BY Hoa_Don.ID DESC'
    EXEC sp_executesql @sql, N'@MaHD VARCHAR(10), @TrangThai BIT', @MaHD, @TrangThai
END
GO
exec Get_HD_By_MaHD '%', 1
select * from hoa_Don



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

		-- Cập nhật số lượng tồn kho
        UPDATE San_Pham_Chi_Tiet 
        SET SoLuongTon = SoLuongTon - @SoLuongBan 
        WHERE Ma = @MaSanPham;

		DECLARE @Gia MONEY;
		--Lấy giá từ bảng San_Pham_Chi_Tiet
		SELECT @Gia = Gia
		FROM San_Pham_Chi_Tiet
		WHERE Ma = @MaSanPham;

        -- Đưa sản phẩm lên giỏ hàng - hóa đơn chi tiết
		INSERT INTO Hoa_Don_Chi_Tiet (IDSanPhamCT, IDHoaDon, Gia, SoLuong, ThanhTien, Deleted)
        VALUES ((SELECT ID FROM San_Pham_Chi_Tiet WHERE Ma = @MaSanPham), @IDHD, @Gia,@SoLuongBan,@Gia * @SoLuongBan, 0);
		
		-- Tính tổng tiền và cập nhật vào hóa đơn
		
        UPDATE Hoa_Don
        SET TongTien = (
            SELECT SUM(ThanhTien) AS TongTien
			FROM Hoa_Don_Chi_Tiet join Hoa_Don on Hoa_Don.ID = Hoa_Don_Chi_Tiet.IDHoaDon
			WHERE IDHoaDon =  @IDHD
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



delete from hoa_Don_chi_tiet
select * from hoa_Don
select * from hoa_Don_Chi_Tiet
select * from san_Pham_Chi_Tiet

/*
SELECT ROW_NUMBER() OVER (ORDER BY HOA_DON.Id DESC) AS [STT], 
	MaHD, CONVERT(VARCHAR(20), NgayTao, 103), 
from hoa_Don*/

select * from hoa_Don_Chi_Tiet



SELECT  Hoa_Don.ID, Hoa_Don.MaHD, Hoa_Don.NgayTao, Hoa_Don.NgayThanhToan, Nhan_Vien.MaNV, Khach_Hang.HoTen, Hoa_Don.TongTien, Khuyen_Mai_Chi_Tiet.SoTienGiam, Thanh_Toan.HinhThuc
		FROM    Hoa_Don LEFT JOIN
				Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID LEFT JOIN
				Khach_Hang ON Hoa_Don.IDKhachHang = Khach_Hang.ID LEFT JOIN
				Khuyen_Mai_Chi_Tiet ON Hoa_Don.ID = Khuyen_Mai_Chi_Tiet.ID LEFT JOIN
				Thanh_Toan ON Hoa_Don.ID = Thanh_Toan.ID WHERE MAHD LIKE '%' AND Hoa_Don.TrangThai = 1
				ORDER BY Hoa_Don.ID DESC

UPDATE Hoa_Don SET TrangThai = 0 WHERE MaHD = 'HD-1VWVG'



