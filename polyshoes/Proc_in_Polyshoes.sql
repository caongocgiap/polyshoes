USE [N5_PolyShoes]
GO

IF OBJECT_ID('getThuocTinh') IS NOT NULL
    DROP PROC getThuocTinh
GO
CREATE PROC getThuocTinh @tenBang NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = CASE
		WHEN @tenBang = 'Size' THEN
			'SELECT ID, Ma, Size FROM Size WHERE Deleted = 0 ORDER BY ID DESC'
		ELSE
			'SELECT ID, Ma, Ten FROM ' + QUOTENAME(@tenBang) + 'WHERE Deleted = 0 ORDER BY ID DESC'
		END
    EXEC sp_executesql @sql
END
GO
exec getThuocTinh 'danh_muc'
select id, ma, ten from San_Pham

IF OBJECT_ID('themThuocTinh') IS NOT NULL
    DROP PROC themThuocTinh
GO
CREATE PROC themThuocTinh 
	@tenBang VARCHAR(50),
	@ma VARCHAR(10),
	@ten NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
	SET @sql = CASE
		WHEN @tenBang = 'Size' THEN
            'INSERT ' + QUOTENAME(@tenBang) + '(Ma, Size) VALUES (@ma, @ten)'
        ELSE
            'INSERT ' + QUOTENAME(@tenBang) + '(Ma, Ten) VALUES (@ma, @ten)'
	END
    EXEC sp_executesql @sql,
         N'@ma VARCHAR(10), @ten NVARCHAR(50)', @ma, @ten
END
GO
--exec themThuocTinh 'Xuat_Xu', '###', N'Đài Loan'
select * from Xuat_Xu

IF OBJECT_ID('updateThuocTinh') IS NOT NULL
	DROP PROC updateThuocTinh
GO
CREATE PROC updateThuocTinh
	@tenBang NVARCHAR(50),
	@id INT,
	@ten NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = CASE
        WHEN @tenBang = 'Danh_Muc' THEN
            'UPDATE Danh_Muc SET Ten = @ten WHERE ID = @id'
        WHEN @tenBang = 'Thuong_Hieu' THEN
            'UPDATE Thuong_Hieu SET Ten = @ten WHERE ID = @id'
        WHEN @tenBang = 'Xuat_Xu' THEN
            'UPDATE Xuat_Xu SET Ten = @ten WHERE ID = @id'
        WHEN @tenBang = 'Nha_San_Xuat' THEN
            'UPDATE Nha_San_Xuat SET Ten = @ten WHERE ID = @id'
		WHEN @tenBang = 'Chat_Lieu' THEN
            'UPDATE Chat_Lieu SET Ten = @ten WHERE ID = @id'
		WHEN @tenBang = 'De_Giay' THEN
            'UPDATE De_Giay SET Ten = @ten WHERE ID = @id'
		WHEN @tenBang = 'Co_Giay' THEN
            'UPDATE Co_Giay SET Ten = @ten WHERE ID = @id'
		WHEN @tenBang = 'Size' THEN
            'UPDATE Size SET Size = @ten WHERE ID = @id'
        ELSE
            'SELECT 0'
	END
    EXEC sp_executesql @sql, 
		N'@id INT, @ten NVARCHAR(50)', @id, @ten
END
GO
select * from Danh_Muc
exec updateThuocTinh 'Danh_Muc', 11, N'Giày đi mưa'

IF OBJECT_ID('xoaThuocTinh') IS NOT NULL
	DROP PROC xoaThuocTinh
GO
CREATE PROCEDURE xoaThuocTinh 
	@tenBang NVARCHAR(50),
	@id INT,
	@deleted BIT
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = CASE
		WHEN @tenBang = 'Danh_Muc' THEN
            'UPDATE Danh_Muc SET Deleted = @deleted WHERE ID = @id'
        WHEN @tenBang = 'Thuong_Hieu' THEN
            'UPDATE Thuong_Hieu SET Deleted = @deleted WHERE ID = @id'
        WHEN @tenBang = 'Xuat_Xu' THEN
            'UPDATE Xuat_Xu SET Deleted = @deleted WHERE ID = @id'
        WHEN @tenBang = 'Nha_San_Xuat' THEN
            'UPDATE Nha_San_Xuat SET Deleted = @deleted WHERE ID = @id'
		WHEN @tenBang = 'Chat_Lieu' THEN
            'UPDATE Chat_Lieu SET Deleted = @deleted WHERE ID = @id'
		WHEN @tenBang = 'De_Giay' THEN
            'UPDATE De_Giay SET Deleted = @deleted WHERE ID = @id'
		WHEN @tenBang = 'Co_Giay' THEN
            'UPDATE Co_Giay SET Deleted = @deleted WHERE ID = @id'
		WHEN @tenBang = 'Size' THEN
            'UPDATE Size SET Deleted = @deleted WHERE ID = @id'
        ELSE
            'SELECT 0'
END
EXEC sp_executesql @sql,
	N'@id INT, @deleted BIT', @id, @deleted
END
GO

IF OBJECT_ID('getIDByTen') IS NOT NULL
	DROP PROC getIDByTen
GO
CREATE PROC getIDByTen 
	@tenBang NVARCHAR(50),
	@Ten NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
	SET @sql = CASE
		WHEN @tenBang = 'Size' THEN
			N'SELECT ID, Ma, size FROM Size WHERE size = @Ten'
		ELSE
			N'SELECT ID, Ma, Ten FROM ' + QUOTENAME(@tenBang) + ' WHERE Ten = @Ten'
		END
    EXEC sp_executesql @sql, N'@Ten NVARCHAR(50)', @Ten
END
GO


IF OBJECT_ID('getIDByMa') IS NOT NULL
	DROP PROC getIDByMa
GO
CREATE PROC getIDByMa 
	@tenBang NVARCHAR(50),
	@ma NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = N'SELECT ID, Ma, Ten FROM ' + QUOTENAME(@tenBang) + ' WHERE ma = @ma'
    EXEC sp_executesql @sql, N'@ma NVARCHAR(50)', @ma
END
GO

/*
	Sản phẩm chi tiết
*/
IF OBJECT_ID('get_ALL_SPCT') IS NOT NULL
    DROP PROC get_ALL_SPCT
GO
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
		ORDER BY San_Pham_Chi_Tiet.ID DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY'
    EXEC sp_executesql @sql, N'@page INT, @limit INT', @page, @limit
END
GO
exec get_ALL_SPCT 0, 5

IF OBJECT_ID('pagging_SPCT_By_Ma') IS NOT NULL
    DROP PROC pagging_SPCT_By_Ma
GO
CREATE PROC pagging_SPCT_By_Ma 
	@ma varchar(10),
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
        Chat_Lieu ON San_Pham_Chi_Tiet.IDChatLieu = Chat_Lieu.ID WHERE San_Pham.Ma LIKE @Ma
		ORDER BY San_Pham_Chi_Tiet.ID DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY'
    EXEC sp_executesql @sql, N'@Ma VARCHAR(10), @page INT, @limit INT', @Ma, @page, @limit
END
GO
exec pagging_SPCT_By_Ma 'sp01', 2, 5

IF OBJECT_ID('get_1SPCT_ByMa') IS NOT NULL
    DROP PROC get_1SPCT_ByMa
GO
CREATE PROC get_1SPCT_ByMa 
	@ma varchar(10)
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
        Chat_Lieu ON San_Pham_Chi_Tiet.IDChatLieu = Chat_Lieu.ID WHERE San_Pham_Chi_Tiet.Ma LIKE @Ma'
    EXEC sp_executesql @sql, N'@Ma VARCHAR(10)', @Ma
END
GO
exec get_1SPCT_ByMa 'SPCT4F2R9X'

IF OBJECT_ID('get_SPCT_Deleted') IS NOT NULL
    DROP PROC get_SPCT_Deleted
GO
CREATE PROC get_SPCT_Deleted 
	@maSP VARCHAR(10),
	@Deleted BIT,
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
        Chat_Lieu ON San_Pham_Chi_Tiet.IDChatLieu = Chat_Lieu.ID WHERE San_Pham.Ma LIKE @maSP AND San_Pham_Chi_Tiet.Deleted = @Deleted
		ORDER BY San_Pham_Chi_Tiet.ID DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY'
    EXEC sp_executesql @sql, N'@MaSP VARCHAR(10), @Deleted BIT, @page INT, @limit INT', @maSP, @Deleted, @page, @limit
END
GO
select * from San_Pham_Chi_Tiet
exec get_SPCT_Deleted '%', 0, 0, 5

IF OBJECT_ID('them_SPCT') IS NOT NULL
    DROP PROC them_SPCT
GO
CREATE PROC them_SPCT
    @idDanhMuc INT,
    @idXuatXu INT,
    @idNSX INT,
    @idMauSac INT,
    @idSize INT,
    @idSanPham INT,
    @idThuongHieu INT,
    @idChatLieu INT,
    @idDeGiay INT,
    @idCoGiay INT,
	@ma VARCHAR(10),
    @gia MONEY,
    @soLuong INT
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = 
        'INSERT INTO San_Pham_Chi_Tiet
         (IDDanhMuc, IDXuatXu, IDNSX, IDMauSac, IDSize, IDSanPham, IDThuongHieu, IDChatLieu, IDDeGiay, IDCoGiay, Ma, Gia, SoLuongTon, TrangThai)
         VALUES
         (@idDanhMuc, @idXuatXu, @idNSX, @idMauSac, @idSize, @idSanPham, @idThuongHieu, @idChatLieu, @idDeGiay, @idCoGiay, @ma, @gia, @soLuong, 0)'

    EXEC sp_executesql @sql, 
        N'@idDanhMuc INT, @idXuatXu INT, @idNSX INT, @idMauSac INT, @idSize INT,
           @idSanPham INT, @idThuongHieu INT, @idChatLieu INT, @idDeGiay INT, @idCoGiay INT, @ma VARCHAR(10),
           @gia MONEY, @soLuong INT',
        @idDanhMuc, @idXuatXu, @idNSX, @idMauSac, @idSize, @idSanPham, 
        @idThuongHieu, @idChatLieu, @idDeGiay, @idCoGiay, @ma, @gia, @soLuong
END
GO

IF OBJECT_ID('update_SPCT') IS NOT NULL
    DROP PROC update_SPCT
GO
CREATE PROC update_SPCT
    @idDanhMuc INT,
    @idXuatXu INT,
    @idNSX INT,
    @idMauSac INT,
    @idSize INT,
    @idSanPham INT,
    @idThuongHieu INT,
    @idChatLieu INT,
    @idDeGiay INT,
    @idCoGiay INT,
    @gia MONEY,
    @soLuong INT,
	@ma varchar(10)
AS 
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = 
        'UPDATE San_Pham_Chi_Tiet
		SET IDDanhMuc =@idDanhMuc, IDXuatXu = @idXuatXu, IDNSX = @idNSX, IDMauSac = @idMauSac, IDSize = @idSize, IDSanPham = @idSanPham, 
			IDThuongHieu = @idThuongHieu, IDChatLieu = @idChatLieu, IDDeGiay = @idDeGiay, IDCoGiay = @idCoGiay, Gia = @gia, SoLuongTon =  @soLuong
		WHERE San_Pham_Chi_Tiet.ma = @ma'

    EXEC sp_executesql @sql, 
        N'@idDanhMuc INT, @idXuatXu INT, @idNSX INT, @idMauSac INT, @idSize INT,
           @idSanPham INT, @idThuongHieu INT, @idChatLieu INT, @idDeGiay INT, @idCoGiay INT,
           @gia MONEY, @soLuong INT, @ma varchar(10)',
        @idDanhMuc, @idXuatXu, @idNSX, @idMauSac, @idSize, @idSanPham, 
        @idThuongHieu, @idChatLieu, @idDeGiay, @idCoGiay, @gia, @soLuong, @ma
END
GO

IF OBJECT_ID('getIDSPCT_ById') IS NOT NULL
	DROP PROC getIDSPCT_ById
GO
CREATE PROC getIDSPCT_ById 
	@ID INT
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = N'SELECT San_Pham.Ma, San_Pham.Ten, Danh_Muc.Ten, Thuong_Hieu.Ten, Xuat_Xu.Ten, Nha_San_Xuat.Ten, Chat_Lieu.Ten, De_Giay.Ten, Co_Giay.Ten,
		Mau_Sac.Ten AS Expr8, Size.Size, San_Pham_Chi_Tiet.Gia, San_Pham_Chi_Tiet.SoLuongTon, San_Pham_Chi_Tiet.KhoiLuong, San_Pham_Chi_Tiet.TrangThai
		FROM San_Pham_Chi_Tiet INNER JOIN
		San_Pham ON San_Pham_Chi_Tiet.IDSanPham = San_Pham.ID JOIN
		Size ON San_Pham_Chi_Tiet.IDSize = Size.ID JOIN
		Thuong_Hieu ON San_Pham_Chi_Tiet.IDThuongHieu = Thuong_Hieu.ID JOIN
        Xuat_Xu ON San_Pham_Chi_Tiet.IDXuatXu = Xuat_Xu.ID JOIN
        Mau_Sac ON San_Pham_Chi_Tiet.IDMauSac = Mau_Sac.ID JOIN
        Nha_San_Xuat ON San_Pham_Chi_Tiet.IDNSX = Nha_San_Xuat.ID JOIN
		De_Giay ON San_Pham_Chi_Tiet.IDDeGiay = De_Giay.ID JOIN
        Danh_Muc ON San_Pham_Chi_Tiet.IDDanhMuc = Danh_Muc.ID JOIN
		Co_Giay ON San_Pham_Chi_Tiet.IDCoGiay = Co_Giay.ID JOIN
        Chat_Lieu ON San_Pham_Chi_Tiet.IDChatLieu = Chat_Lieu.ID WHERE San_Pham_Chi_Tiet.ID = @ID'
    EXEC sp_executesql @sql, N'@ID INT', @ID
END
GO
exec getidspct_byid 8

IF OBJECT_ID('getSPCT_ByTen') IS NOT NULL
	DROP PROC getSPCT_ByTen
GO
CREATE PROC getSPCT_ByTen 
	@Nha_San_Xuat VARCHAR(MAX),
	@Mau_Sac VARCHAR(MAX),
	@Chat_Lieu VARCHAR(MAX),
	@Co_Giay VARCHAR(MAX)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = N'SELECT San_Pham.Ma, San_Pham.Ten, Danh_Muc.Ten, Thuong_Hieu.Ten, Xuat_Xu.Ten, Nha_San_Xuat.Ten, Chat_Lieu.Ten, De_Giay.Ten, Co_Giay.Ten,
		Mau_Sac.Ten AS Expr8, Size.Size, San_Pham_Chi_Tiet.Gia, San_Pham_Chi_Tiet.SoLuongTon, San_Pham_Chi_Tiet.KhoiLuong, San_Pham_Chi_Tiet.TrangThai
		FROM San_Pham_Chi_Tiet INNER JOIN
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
		WHERE Nha_San_Xuat.ten = @Nha_San_Xuat and Mau_Sac.ten = @Mau_Sac and Chat_Lieu.ten = @Chat_Lieu and Co_Giay.ten = @Co_Giay'
    EXEC sp_executesql @sql, N'@Nha_San_Xuat VARCHAR(MAX), @Mau_Sac VARCHAR(MAX), @Chat_Lieu VARCHAR(MAX), @Co_Giay VARCHAR(MAX)', 
	@Nha_San_Xuat, @Mau_Sac, @Chat_Lieu, @Co_Giay
END
GO


/*
	Sản phẩm
*/
IF OBJECT_ID('get_All_SP') IS NOT NULL
    DROP PROC get_All_SP
GO
CREATE PROC get_All_SP
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = 'SELECT
					ROW_NUMBER() OVER (ORDER BY San_Pham.Id) AS [STT],
					San_Pham.id,
					San_Pham.Ma,
					San_Pham.Ten,
					San_Pham.MoTa,
					COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) AS TongSoLuongTon,
					CASE WHEN COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) > 0 THEN 1 ELSE 0 END AS TrangThai
				FROM
					San_Pham
				LEFT JOIN
					San_Pham_Chi_Tiet ON San_Pham.id = San_Pham_Chi_Tiet.IDSanPham
				GROUP BY
					San_Pham.id,
					San_Pham.Ma,
					San_Pham.Ten,
					San_Pham.MoTa;
				UPDATE San_Pham
				SET TrangThai = IIF(COALESCE((SELECT SUM(SoLuongTon) FROM San_Pham_Chi_Tiet WHERE IDSanPham = San_Pham.id), 0) > 0, 1, 0)'
    EXEC sp_executesql @sql
END
GO
exec get_All_SP

IF OBJECT_ID('get_SP_Deleted') IS NOT NULL
    DROP PROC get_SP_Deleted
GO
CREATE PROC get_SP_Deleted 
	@Deleted BIT,
	@page INT,
	@limit INT
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = 'SELECT ROW_NUMBER() OVER (ORDER BY San_Pham.ID DESC) AS [STT], San_Pham.id,San_Pham.Ma,Ten,MoTa,COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) AS TongSoLuongTon,
			CASE WHEN COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) > 0 THEN 1 ELSE 0 END AS TrangThai
			FROM San_Pham LEFT JOIN San_Pham_Chi_Tiet ON San_Pham.id = San_Pham_Chi_Tiet.IDSanPham WHERE San_Pham.Deleted = @Deleted
			GROUP BY San_Pham.id,San_Pham.Ma,Ten,MoTa ORDER BY id DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY'
    EXEC sp_executesql @sql, N'@Deleted BIT, @page INT, @limit INT', @Deleted, @page, @limit
END
GO
exec get_SP_Deleted 0, 0, 5

IF OBJECT_ID('Paging_SP') IS NOT NULL
    DROP PROC Paging_SP
GO
CREATE PROC Paging_SP 
	@page INT,
	@limit INT
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = 'SELECT ROW_NUMBER() OVER (ORDER BY San_Pham.ID DESC) AS [STT],
				San_Pham.id,San_Pham.Ma,Ten,MoTa, COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) AS TongSoLuongTon,
				CASE WHEN COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) > 0 THEN 1 ELSE 0 END AS TrangThai
				FROM San_Pham LEFT JOIN San_Pham_Chi_Tiet ON San_Pham.id = San_Pham_Chi_Tiet.IDSanPham
				GROUP BY San_Pham.id,San_Pham.Ma,Ten,MoTa ORDER BY id DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY'
    EXEC sp_executesql @sql, N'@page INT, @limit INT', @page, @limit
END
GO
exec Paging_SP 0, 5

IF OBJECT_ID('getIDSP_ByMa') IS NOT NULL
	DROP PROC getIDSP_ByMa
GO
CREATE PROC getIDSP_ByMa 
	@Ma NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = N'SELECT
			ROW_NUMBER() OVER (ORDER BY San_Pham.ID DESC) AS [STT],
                        San_Pham.id,
                        San_Pham.Ma,
                        San_Pham.Ten,
                        San_Pham.MoTa,
                        COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) AS TongSoLuongTon,
                        CASE WHEN COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) > 0 THEN 1 ELSE 0 END AS TrangThai
                    FROM
                        San_Pham
                    LEFT JOIN
                        San_Pham_Chi_Tiet ON San_Pham.id = San_Pham_Chi_Tiet.IDSanPham
					WHERE San_Pham.Ma = @Ma
                    GROUP BY
                        San_Pham.id,
                        San_Pham.Ma,
                        San_Pham.Ten,
                        San_Pham.MoTa'
    EXEC sp_executesql @sql, N'@Ma NVARCHAR(50)', @Ma
END
GO
exec getIDSP_ByMa 'SP01'

IF OBJECT_ID('getIDSP_ByTen') IS NOT NULL
	DROP PROC getIDSP_ByTen
GO
CREATE PROC getIDSP_ByTen 
	@Ten NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = N'SELECT
				ROW_NUMBER() OVER (ORDER BY San_Pham.ID DESC) AS [STT],
                        San_Pham.id,
                        San_Pham.Ma,
                        San_Pham.Ten,
                        San_Pham.MoTa,
                        COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) AS TongSoLuongTon,
                        CASE WHEN COALESCE(SUM(San_Pham_Chi_Tiet.SoLuongTon), 0) > 0 THEN 1 ELSE 0 END AS TrangThai
                    FROM
                        San_Pham
                    LEFT JOIN
                        San_Pham_Chi_Tiet ON San_Pham.id = San_Pham_Chi_Tiet.IDSanPham
					WHERE Ten LIKE @Ten
                    GROUP BY
                        San_Pham.id,
                        San_Pham.Ma,
                        San_Pham.Ten,
                        San_Pham.MoTa'
    EXEC sp_executesql @sql, N'@Ten NVARCHAR(50)', @Ten
END
GO
exec getIDSP_ByTen 'Giày thu đông'
select * from san_Pham
/*
	Bản chuẩn
*/







