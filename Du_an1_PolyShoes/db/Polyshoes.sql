USE [master]
GO
/****** Object:  Database [N5_PolyShoes]    Script Date: 23-Jan-2024 5:30:38 PM ******/
CREATE DATABASE [N5_PolyShoes]
GO
USE [N5_PolyShoes]
GO
/****** Object:  Table [dbo].[Co_Giay]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Co_Giay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Co_Giay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Chat_Lieu]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Chat_Lieu](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Chat_Lieu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Chuc_Vu]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Chuc_Vu](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NgayTao] [datetime] NULL,
	[NguoiTao] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Chuc_Vu] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Danh_Muc]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Danh_Muc](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Danh_Muc] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[De_Giay]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[De_Giay](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_De_Giay] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hinh_Anh]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hinh_Anh](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDSanPhamCT] [int] NULL,
	[URL] [varchar](max) NULL,
	[Cover] [bit] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Hinh_Anh] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hinh_Thuc_TT]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hinh_Thuc_TT](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDHoaDon] [int] NULL,
	[IDThanhToan] [int] NULL,
	[MaThanhToan] [varchar](50) NULL,
	[GiaTriThanhToan] [money] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_HinhThucTT] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hoa_Don]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hoa_Don](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDNhanVien] [int] NULL,
	[IDKhachHang] [int] NULL,
	[MaHD] [varchar](10) NULL,
	[TenNguoiNhan] [nvarchar](50) NULL,
	[SDT] [varchar](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[NgayThanhToan] [datetime] NULL,
	[PhiShip] [money] NULL,
	[TongTien] [money] NULL,
	[NgayShip] [datetime] NULL,
	[NgayNhan] [datetime] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
	[IDVoucher] [int] NULL,
 CONSTRAINT [PK_Hoa_Don] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hoa_Don_Chi_Tiet]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Hoa_Don_Chi_Tiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDSanPhamCT] [int] NULL,
	[IDHoaDon] [int] NULL,
	[Gia] [money] NULL,
	[SoLuong] [int] NULL,
	[ThanhTien] [money] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Hoa_Don_Chi_Tiet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khach_Hang]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khach_Hang](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [varchar](10) NULL,
	[HoTen] [nvarchar](50) NULL,
	[SDT] [varchar](10) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[GioiTinh] [bit] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Khach_Hang] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khuyen_Mai]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khuyen_Mai](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[MoTa] [varchar](max) NULL,
	[NgayBatDau] [datetime] NULL,
	[NgayKetThuc] [datetime] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Khuyen_Mai] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khuyen_Mai_Chi_Tiet]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khuyen_Mai_Chi_Tiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDSanPhamCT] [int] NULL,
	[IDKhuyenMai] [int] NULL,
	[SoTienGiam] [money] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Khuyen_Mai_Chi_Tiet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Lich_Su_Hoa_Don]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Lich_Su_Hoa_Don](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDHoaDon] [int] NULL,
	[ThoiGian] [datetime] NULL,
	[HanhDong] [int] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Lich_Su_Hoa_Don] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Mau_Sac]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Mau_Sac](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Mau_Sac] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Nha_San_Xuat]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Nha_San_Xuat](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Nha_San_Xuat] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Nhan_Vien]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Nhan_Vien](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDChucVu] [int] NULL,
	[MaNV] [varchar](10) NULL,
	[Email] [varchar](50) NULL,
	[MatKhau] [varchar](50) NULL,
	[CCCD] [varchar](12) NULL,
	[TenNV] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[SDT] [varchar](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[GioiTinh] [bit] NULL,
	[TrangThai] [bit] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiTao] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Nhan_Vien] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[San_Pham]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[San_Pham](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[MoTa] [nvarchar](max) NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_San_Pham_1] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[San_Pham_Chi_Tiet]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[San_Pham_Chi_Tiet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDDanhMuc] [int] NULL,
	[IDXuatXu] [int] NULL,
	[IDNSX] [int] NULL,
	[IDMauSac] [int] NULL,
	[IDSize] [int] NULL,
	[IDSanPham] [int] NULL,
	[IDThuongHieu] [int] NULL,
	[IDChatLieu] [int] NULL,
	[IDDeGiay] [int] NULL,
	[IDCoGiay] [int] NULL,
	[Ma] [varchar](10) NULL,
	[KhoiLuong] [float] NULL,
	[Gia] [money] NULL,
	[SoLuongTon] [int] NULL,
	[TrangThai] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_San_Pham] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Size]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Size](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Size] [int] NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Size] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Thanh_Toan]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thanh_Toan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[HinhThuc] [bit] NULL,
	[MoTa] [nvarchar](max) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Thanh_Toan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Thuong_Hieu]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thuong_Hieu](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Thuong_Hieu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Voucher]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Voucher](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](max) NULL,
	[NgayBD] [datetime] NULL,
	[NgayKT] [datetime] NULL,
	[SoLuong] [int] NULL,
	[PhanTramGiam] [int] NULL,
	[GTToiThieu] [money] NULL,
	[GiamToiDa] [money] NULL,
	[TrangThai] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiTao] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Voucher] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Xuat_Xu]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Xuat_Xu](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Ma] [varchar](10) NULL,
	[Ten] [nvarchar](50) NULL,
	[NguoiTao] [int] NULL,
	[NgayTao] [datetime] NULL,
	[NguoiCapNhat] [int] NULL,
	[NgayCapNhat] [datetime] NULL,
	[Deleted] [bit] NULL,
 CONSTRAINT [PK_Xuat_Xu] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Co_Giay] ON 

INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-RMT7SZ6', N'Cổ cao', NULL, CAST(N'2023-12-06T09:28:01.737' AS DateTime), NULL, CAST(N'2023-12-06T09:28:01.737' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-7SGB3L6', N'Cổ thấp', NULL, CAST(N'2023-12-06T09:28:08.493' AS DateTime), NULL, CAST(N'2023-12-06T09:28:08.493' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-23ALWJ3', N'Cổ lỡ', NULL, CAST(N'2023-12-06T09:28:15.660' AS DateTime), NULL, CAST(N'2023-12-06T09:28:15.660' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-7XFR48C', N'Cổ nhồi bông', NULL, CAST(N'2023-12-06T10:30:20.080' AS DateTime), NULL, CAST(N'2023-12-06T10:30:20.080' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-NOSHI6F', N'Cổ lỡ', NULL, CAST(N'2024-01-22T20:23:13.410' AS DateTime), NULL, CAST(N'2024-01-22T20:23:13.410' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Co_Giay] OFF
SET IDENTITY_INSERT [dbo].[Chat_Lieu] ON 

INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-42Z58RU', N'Da bò', NULL, CAST(N'2023-12-06T09:20:45.097' AS DateTime), NULL, CAST(N'2023-12-06T09:20:45.097' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-A2AMUYF', N'Da trâu', NULL, CAST(N'2023-12-06T09:20:50.157' AS DateTime), NULL, CAST(N'2023-12-06T09:20:50.157' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-3RB3KF3', N'Vải thô', NULL, CAST(N'2023-12-06T09:21:01.713' AS DateTime), NULL, CAST(N'2023-12-06T09:21:01.713' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-2QK8ZKP', N'Vải đanh', NULL, CAST(N'2023-12-06T09:23:17.743' AS DateTime), NULL, CAST(N'2023-12-06T09:23:17.743' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-LI4KNOE', N'Nhung', NULL, CAST(N'2023-12-06T10:31:45.510' AS DateTime), NULL, CAST(N'2023-12-06T10:31:45.510' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'TT-O011CF6', N'Tổng hợp', NULL, CAST(N'2023-12-07T08:20:12.180' AS DateTime), NULL, CAST(N'2023-12-07T08:20:12.180' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'TT-2490ZAN', N'Da cá sấu', NULL, CAST(N'2023-12-07T08:53:25.730' AS DateTime), NULL, CAST(N'2023-12-07T08:53:25.730' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'TT-JAV3VWQ', N'vải bò', NULL, CAST(N'2023-12-08T18:23:22.773' AS DateTime), NULL, CAST(N'2023-12-08T18:23:22.773' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'TT-JP1TM7L', N'vải ngựa', NULL, CAST(N'2023-12-11T18:57:47.133' AS DateTime), NULL, CAST(N'2023-12-11T18:57:47.133' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Chat_Lieu] OFF
SET IDENTITY_INSERT [dbo].[Chuc_Vu] ON 

INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (1, N'CV-001', N'Quản lý', CAST(N'2023-12-06T09:13:06.120' AS DateTime), NULL, CAST(N'2023-12-06T09:13:06.120' AS DateTime), NULL, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (2, N'CV-002', N'Nhân viên', CAST(N'2023-12-11T09:39:33.910' AS DateTime), NULL, CAST(N'2023-12-11T09:39:33.910' AS DateTime), NULL, 0)
SET IDENTITY_INSERT [dbo].[Chuc_Vu] OFF
SET IDENTITY_INSERT [dbo].[Danh_Muc] ON 

INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-CBPUPE9', N'Sneaker', NULL, CAST(N'2023-12-06T09:19:31.830' AS DateTime), NULL, CAST(N'2023-12-06T09:19:31.830' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-TGA166R', N'Thể thao', NULL, CAST(N'2023-12-06T09:19:44.040' AS DateTime), NULL, CAST(N'2023-12-06T09:19:44.040' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-KYFGJDT', N'Phong cách Tây', NULL, CAST(N'2023-12-06T09:20:06.760' AS DateTime), NULL, CAST(N'2023-12-06T09:20:06.760' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-69ZUZWI', N'Phong cách Hàn Quốc', NULL, CAST(N'2023-12-06T10:31:03.947' AS DateTime), NULL, CAST(N'2023-12-06T10:31:03.947' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-D8DE2DK', N'Giày đinh', NULL, CAST(N'2023-12-12T08:47:48.063' AS DateTime), NULL, CAST(N'2023-12-12T08:47:48.063' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'TT-PIJOO4H', N'Giày Quảng Châu', NULL, CAST(N'2024-01-10T13:31:21.557' AS DateTime), NULL, CAST(N'2024-01-10T13:31:21.557' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Danh_Muc] OFF
SET IDENTITY_INSERT [dbo].[De_Giay] ON 

INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-SLX1DA1', N'Đế cứng', NULL, CAST(N'2023-12-06T09:26:28.873' AS DateTime), NULL, CAST(N'2023-12-06T09:26:28.873' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-8JE0QDU', N'Đế mềm', NULL, CAST(N'2023-12-06T09:26:34.260' AS DateTime), NULL, CAST(N'2023-12-06T09:26:34.260' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-HB3UJ3X', N'Đế cao su', NULL, CAST(N'2023-12-06T09:26:41.350' AS DateTime), NULL, CAST(N'2023-12-06T09:26:41.350' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-SOZSNYE', N'Đế nhựa cứng', NULL, CAST(N'2023-12-06T09:26:54.143' AS DateTime), NULL, CAST(N'2023-12-06T09:26:54.143' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-9PKDSFJ', N'Đế nhựa mềm', NULL, CAST(N'2023-12-06T10:30:00.607' AS DateTime), NULL, CAST(N'2023-12-06T10:30:00.607' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'TT-DER3XJ4', N'đế lớp', NULL, CAST(N'2023-12-12T08:43:55.470' AS DateTime), NULL, CAST(N'2023-12-12T08:43:55.470' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[De_Giay] OFF
SET IDENTITY_INSERT [dbo].[Hoa_Don] ON 

INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (2, 1, 1, N'HD-ZXVWC', NULL, NULL, NULL, CAST(N'2023-12-06T11:04:51.437' AS DateTime), NULL, 3020000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T11:04:51.437' AS DateTime), NULL, CAST(N'2023-12-06T11:04:51.437' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (3, 1, 1, N'HD-0K1AN', NULL, NULL, NULL, CAST(N'2023-12-06T11:15:02.420' AS DateTime), NULL, 790000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T11:15:02.420' AS DateTime), NULL, CAST(N'2023-12-06T11:15:02.420' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (4, 1, 1, N'HD-RM8CN', NULL, NULL, NULL, CAST(N'2023-12-06T12:47:48.950' AS DateTime), NULL, 120000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T12:47:48.950' AS DateTime), NULL, CAST(N'2023-12-06T12:47:48.950' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (5, 1, 1, N'HD-T5R6E', NULL, NULL, NULL, CAST(N'2023-12-06T12:49:43.740' AS DateTime), NULL, 1780000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T12:49:43.740' AS DateTime), NULL, CAST(N'2023-12-06T12:49:43.740' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (6, 1, 1, N'HD-7QZSH', NULL, NULL, NULL, CAST(N'2023-12-06T12:50:17.850' AS DateTime), NULL, 120000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T12:50:17.850' AS DateTime), NULL, CAST(N'2023-12-06T12:50:17.850' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (7, 1, 1, N'HD-HFVUJ', NULL, NULL, NULL, CAST(N'2023-12-06T13:02:56.280' AS DateTime), NULL, 120000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T13:02:56.280' AS DateTime), NULL, CAST(N'2023-12-06T13:02:56.280' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (8, 1, 1, N'HD-ZVY5U', NULL, NULL, NULL, CAST(N'2023-12-06T13:07:36.863' AS DateTime), NULL, 120000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T13:07:36.863' AS DateTime), NULL, CAST(N'2023-12-06T13:07:36.863' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (9, 1, 1, N'HD-RIA6T', NULL, NULL, NULL, CAST(N'2023-12-06T13:12:44.500' AS DateTime), NULL, 830000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T13:12:44.500' AS DateTime), NULL, CAST(N'2023-12-06T13:12:44.500' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (10, 1, 1, N'HD-Y683D', NULL, NULL, NULL, CAST(N'2023-12-06T13:13:59.760' AS DateTime), NULL, 120000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T13:13:59.760' AS DateTime), NULL, CAST(N'2023-12-06T13:13:59.760' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (11, 1, 1, N'HD-7Z8CA', NULL, NULL, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, 120000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (12, 1, 1, N'HD-MPXNK', NULL, NULL, NULL, CAST(N'2023-12-06T13:42:35.710' AS DateTime), NULL, 120000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T13:42:35.710' AS DateTime), NULL, CAST(N'2023-12-06T13:42:35.710' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (13, 1, 1, N'HD-SKV9D', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:35.227' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:35.227' AS DateTime), NULL, CAST(N'2023-12-06T18:38:35.227' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (14, 1, 1, N'HD-G49H9', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:38.377' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:38.377' AS DateTime), NULL, CAST(N'2023-12-06T18:38:38.377' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (15, 1, 1, N'HD-2WG9E', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:40.020' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:40.020' AS DateTime), NULL, CAST(N'2023-12-06T18:38:40.020' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (16, 1, 1, N'HD-DV3N8', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:41.843' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:41.843' AS DateTime), NULL, CAST(N'2023-12-06T18:38:41.843' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (17, 1, 1, N'HD-98A6B', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:45.183' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:45.183' AS DateTime), NULL, CAST(N'2023-12-06T18:38:45.183' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (18, 1, 1, N'HD-YKOGM', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:47.210' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:47.210' AS DateTime), NULL, CAST(N'2023-12-06T18:38:47.210' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (19, 1, 1, N'HD-1081P', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:48.843' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:48.843' AS DateTime), NULL, CAST(N'2023-12-06T18:38:48.843' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (20, 1, 1, N'HD-GT03S', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:50.203' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:50.203' AS DateTime), NULL, CAST(N'2023-12-06T18:38:50.203' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (21, 1, 1, N'HD-ZBI88', NULL, NULL, NULL, CAST(N'2023-12-06T18:38:52.057' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:38:52.057' AS DateTime), NULL, CAST(N'2023-12-06T18:38:52.057' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (22, 1, 1, N'HD-5H3ZU', NULL, NULL, NULL, CAST(N'2023-12-06T18:57:15.993' AS DateTime), NULL, 910000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-06T18:57:15.993' AS DateTime), NULL, CAST(N'2023-12-06T18:57:15.993' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (23, 1, 1, N'HD-2H55P', NULL, NULL, NULL, CAST(N'2023-12-06T18:57:17.753' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-06T18:57:17.753' AS DateTime), NULL, CAST(N'2023-12-06T18:57:17.753' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (24, 1, 1, N'HD-A7KG0', NULL, NULL, NULL, CAST(N'2023-12-07T08:18:09.217' AS DateTime), NULL, 240000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-07T08:18:09.217' AS DateTime), NULL, CAST(N'2023-12-07T08:18:09.217' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (25, 1, 1, N'HD-8K10G', NULL, NULL, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, 1150000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (26, 1, 1, N'HD-Q48WU', NULL, NULL, NULL, CAST(N'2023-12-07T09:56:09.323' AS DateTime), NULL, 920000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-07T09:56:09.323' AS DateTime), NULL, CAST(N'2023-12-07T09:56:09.323' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (27, 1, 1, N'HD-IE167', NULL, NULL, NULL, CAST(N'2023-12-07T09:56:22.027' AS DateTime), NULL, 2830000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-07T09:56:22.027' AS DateTime), NULL, CAST(N'2023-12-07T09:56:22.027' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (28, 1, 1, N'HD-OOIUE', NULL, NULL, NULL, CAST(N'2023-12-07T09:56:23.667' AS DateTime), NULL, 1820000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-07T09:56:23.667' AS DateTime), NULL, CAST(N'2023-12-07T09:56:23.667' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (29, 1, 1, N'HD-GIORX', NULL, NULL, NULL, CAST(N'2023-12-07T22:06:27.420' AS DateTime), NULL, 480000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-07T22:06:27.420' AS DateTime), NULL, CAST(N'2023-12-07T22:06:27.420' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (30, 1, 1, N'HD-5YRSL', NULL, NULL, NULL, CAST(N'2023-12-08T15:33:01.683' AS DateTime), NULL, 1130000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-08T15:33:01.683' AS DateTime), NULL, CAST(N'2023-12-08T15:33:01.683' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (31, 1, 1, N'HD-WPNOG', NULL, NULL, NULL, CAST(N'2023-12-08T15:36:50.007' AS DateTime), NULL, 360000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-08T15:36:50.007' AS DateTime), NULL, CAST(N'2023-12-08T15:36:50.007' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (32, 1, 1, N'HD-BSJ2K', NULL, NULL, NULL, CAST(N'2023-12-08T15:42:38.357' AS DateTime), NULL, 150000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-08T15:42:38.357' AS DateTime), NULL, CAST(N'2023-12-08T15:42:38.357' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (33, 1, 1, N'HD-7TIAP', NULL, NULL, NULL, CAST(N'2023-12-08T18:36:20.367' AS DateTime), NULL, 1860000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-08T18:36:20.367' AS DateTime), NULL, CAST(N'2023-12-08T18:36:20.367' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (34, 1, 1, N'HD-ZAMKR', NULL, NULL, NULL, CAST(N'2023-12-08T20:57:46.153' AS DateTime), NULL, 240000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-08T20:57:46.153' AS DateTime), NULL, CAST(N'2023-12-08T20:57:46.153' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (35, 1, 1, N'HD-135SB', NULL, NULL, NULL, CAST(N'2023-12-09T08:23:32.293' AS DateTime), NULL, 1800000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-09T08:23:32.293' AS DateTime), NULL, CAST(N'2023-12-09T08:23:32.293' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (36, 1, 1, N'HD-08FMK', NULL, NULL, NULL, CAST(N'2023-12-09T11:54:00.290' AS DateTime), NULL, NULL, NULL, NULL, 2, NULL, CAST(N'2023-12-09T11:54:00.290' AS DateTime), NULL, CAST(N'2023-12-09T11:54:00.290' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (37, 1, 1, N'HD-FWJHV', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:36.693' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-09T15:06:36.693' AS DateTime), NULL, CAST(N'2023-12-09T15:06:36.693' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (38, 1, 1, N'HD-DOS51', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:38.327' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-09T15:06:38.327' AS DateTime), NULL, CAST(N'2023-12-09T15:06:38.327' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (39, 1, 1, N'HD-K2OYU', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:40.373' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-09T15:06:40.373' AS DateTime), NULL, CAST(N'2023-12-09T15:06:40.373' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (40, 1, 1, N'HD-YOAC4', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:42.427' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-09T15:06:42.427' AS DateTime), NULL, CAST(N'2023-12-09T15:06:42.427' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (41, 1, 1, N'HD-1YGX2', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:44.023' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-09T15:06:44.023' AS DateTime), NULL, CAST(N'2023-12-09T15:06:44.023' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (42, 1, 1, N'HD-NOY9W', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:45.653' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-09T15:06:45.653' AS DateTime), NULL, CAST(N'2023-12-09T15:06:45.653' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (43, 1, 1, N'HD-4V8BW', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:47.200' AS DateTime), NULL, 7500000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-09T15:06:47.200' AS DateTime), NULL, CAST(N'2023-12-09T15:06:47.200' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (44, 1, 1, N'HD-9YT10', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:48.960' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-09T15:06:48.960' AS DateTime), NULL, CAST(N'2023-12-09T15:06:48.960' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (45, 1, 1, N'HD-SRA7C', NULL, NULL, NULL, CAST(N'2023-12-09T15:06:50.703' AS DateTime), NULL, 650000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-09T15:06:50.703' AS DateTime), NULL, CAST(N'2023-12-09T15:06:50.703' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (46, 1, 1, N'HD-C6N1F', NULL, NULL, NULL, CAST(N'2023-12-10T00:02:01.113' AS DateTime), NULL, 1500000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-10T00:02:01.113' AS DateTime), NULL, CAST(N'2023-12-10T00:02:01.113' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (47, 1, 1, N'HD-ZUYTD', NULL, NULL, NULL, CAST(N'2023-12-10T00:02:03.500' AS DateTime), NULL, 1200000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-10T00:02:03.500' AS DateTime), NULL, CAST(N'2023-12-10T00:02:03.500' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (48, 1, 1, N'HD-AWWKW', NULL, NULL, NULL, CAST(N'2023-12-10T09:57:20.497' AS DateTime), NULL, 900000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-10T09:57:20.497' AS DateTime), NULL, CAST(N'2023-12-10T09:57:20.497' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (49, 1, 1, N'HD-FBVYL', NULL, NULL, NULL, CAST(N'2023-12-10T10:17:50.690' AS DateTime), NULL, 3900000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-10T10:17:50.690' AS DateTime), NULL, CAST(N'2023-12-10T10:17:50.690' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (50, 1, 1, N'HD-UM9FN', NULL, NULL, NULL, CAST(N'2023-12-11T15:25:45.403' AS DateTime), NULL, 2340000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T15:25:45.403' AS DateTime), NULL, CAST(N'2023-12-11T15:25:45.403' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (51, 1, 1, N'HD-AQLIZ', NULL, NULL, NULL, CAST(N'2023-12-11T15:28:05.523' AS DateTime), NULL, 900000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T15:28:05.523' AS DateTime), NULL, CAST(N'2023-12-11T15:28:05.523' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (52, 1, 1, N'HD-LJJ31', NULL, NULL, NULL, CAST(N'2023-12-11T15:31:21.583' AS DateTime), NULL, 900000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T15:31:21.583' AS DateTime), NULL, CAST(N'2023-12-11T15:31:21.583' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (53, 1, 1, N'HD-UWY5A', NULL, NULL, NULL, CAST(N'2023-12-11T15:33:09.363' AS DateTime), NULL, 890000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T15:33:09.363' AS DateTime), NULL, CAST(N'2023-12-11T15:33:09.363' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (54, 1, 1, N'HD-8OCAC', NULL, NULL, NULL, CAST(N'2023-12-11T15:35:46.363' AS DateTime), NULL, 900000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T15:35:46.363' AS DateTime), NULL, CAST(N'2023-12-11T15:35:46.363' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (55, 1, 1, N'HD-1ILNB', NULL, NULL, NULL, CAST(N'2023-12-11T15:36:18.777' AS DateTime), NULL, 900000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T15:36:18.777' AS DateTime), NULL, CAST(N'2023-12-11T15:36:18.777' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (56, 1, 1, N'HD-XC6UA', NULL, NULL, NULL, CAST(N'2023-12-11T15:37:06.880' AS DateTime), NULL, 850000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T15:37:06.880' AS DateTime), NULL, CAST(N'2023-12-11T15:37:06.880' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (57, 1, 1, N'HD-YZGX2', NULL, NULL, NULL, CAST(N'2023-12-11T15:40:46.500' AS DateTime), NULL, 300000.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T15:40:46.500' AS DateTime), NULL, CAST(N'2023-12-11T15:40:46.500' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (58, 1, 1, N'HD-HLO6F', NULL, NULL, NULL, CAST(N'2023-12-11T15:43:35.963' AS DateTime), NULL, 1019934.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T15:43:35.963' AS DateTime), NULL, CAST(N'2023-12-11T15:43:35.963' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (59, 1, 1, N'HD-9HTKR', NULL, NULL, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, 899945.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (60, 1, 1, N'HD-V5R80', NULL, NULL, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, 2199900.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (61, 1, 1, N'HD-KNSFT', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:31.360' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T18:07:31.360' AS DateTime), NULL, CAST(N'2023-12-11T18:07:31.360' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (62, 1, 1, N'HD-G98AE', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:32.910' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T18:07:32.910' AS DateTime), NULL, CAST(N'2023-12-11T18:07:32.910' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (63, 1, 1, N'HD-WGBIJ', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:34.497' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T18:07:34.497' AS DateTime), NULL, CAST(N'2023-12-11T18:07:34.497' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (64, 1, 1, N'HD-FOPZ4', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:35.990' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T18:07:35.990' AS DateTime), NULL, CAST(N'2023-12-11T18:07:35.990' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (65, 1, 1, N'HD-13234', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:37.353' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T18:07:37.353' AS DateTime), NULL, CAST(N'2023-12-11T18:07:37.353' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (66, 1, 1, N'HD-Z4E39', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:38.800' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T18:07:38.800' AS DateTime), NULL, CAST(N'2023-12-11T18:07:38.800' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (67, 1, 1, N'HD-K6PE2', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:40.137' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-11T18:07:40.137' AS DateTime), NULL, CAST(N'2023-12-11T18:07:40.137' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (68, 1, 1, N'HD-27Q5Y', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:41.470' AS DateTime), NULL, 1020000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T18:07:41.470' AS DateTime), NULL, CAST(N'2023-12-11T18:07:41.470' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (69, 1, 1, N'HD-V1NFT', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:42.800' AS DateTime), NULL, 3040000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T18:07:42.800' AS DateTime), NULL, CAST(N'2023-12-11T18:07:42.800' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (70, 1, 1, N'HD-2DMW7', NULL, NULL, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, 3550000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (71, 1, 1, N'HD-H3YRV', NULL, NULL, NULL, CAST(N'2023-12-12T06:03:46.063' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-12T06:03:46.063' AS DateTime), NULL, CAST(N'2023-12-12T06:03:46.063' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (72, 1, 1, N'HD-G57DZ', NULL, NULL, NULL, CAST(N'2023-12-12T07:25:53.243' AS DateTime), NULL, 2840000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T07:25:53.243' AS DateTime), NULL, CAST(N'2023-12-12T07:25:53.243' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (73, 1, 1, N'HD-7D4GZ', NULL, NULL, NULL, CAST(N'2023-12-12T07:46:13.220' AS DateTime), NULL, 3060000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T07:46:13.220' AS DateTime), NULL, CAST(N'2023-12-12T07:46:13.220' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (74, 1, 1, N'HD-YRZS0', NULL, NULL, NULL, CAST(N'2023-12-12T07:46:14.827' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-12T07:46:14.827' AS DateTime), NULL, CAST(N'2023-12-12T07:46:14.827' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (75, 1, 1, N'HD-92N4K', NULL, NULL, NULL, CAST(N'2023-12-12T07:46:16.323' AS DateTime), NULL, 0.0000, NULL, NULL, 2, NULL, CAST(N'2023-12-12T07:46:16.323' AS DateTime), NULL, CAST(N'2023-12-12T07:46:16.323' AS DateTime), 1, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (76, 1, 1, N'HD-YH7Z4', NULL, NULL, NULL, CAST(N'2024-01-22T23:22:08.273' AS DateTime), NULL, 458951.2000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T07:46:17.803' AS DateTime), NULL, CAST(N'2023-12-12T07:46:17.803' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (77, 1, 1, N'HD-2CL59', NULL, NULL, NULL, CAST(N'2024-01-22T23:16:25.470' AS DateTime), NULL, 123000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T07:46:19.893' AS DateTime), NULL, CAST(N'2023-12-12T07:46:19.893' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (78, 1, 1, N'HD-40KCH', NULL, NULL, NULL, CAST(N'2023-12-12T07:46:21.813' AS DateTime), NULL, 521102.4000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T07:46:21.813' AS DateTime), NULL, CAST(N'2023-12-12T07:46:21.813' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (79, 1, 1, N'HD-0KFLY', NULL, NULL, NULL, CAST(N'2023-12-12T07:46:23.763' AS DateTime), NULL, 480551.2000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T07:46:23.763' AS DateTime), NULL, CAST(N'2023-12-12T07:46:23.763' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (80, 1, 1, N'HD-12IM9', NULL, NULL, NULL, CAST(N'2023-12-12T07:46:26.480' AS DateTime), NULL, 0.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T07:46:26.480' AS DateTime), NULL, CAST(N'2023-12-12T07:46:26.480' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (81, 1, 1, N'HD-DUD1X', NULL, NULL, NULL, CAST(N'2023-12-12T08:06:50.493' AS DateTime), NULL, 1180000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T08:06:50.493' AS DateTime), NULL, CAST(N'2023-12-12T08:06:50.493' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (82, 1, 1, N'HD-7SWX7', NULL, NULL, NULL, CAST(N'2023-12-12T08:08:06.593' AS DateTime), NULL, 360000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T08:08:06.593' AS DateTime), NULL, CAST(N'2023-12-12T08:08:06.593' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (83, 1, 1, N'HD-M9VOT', NULL, NULL, NULL, CAST(N'2023-12-12T08:10:51.573' AS DateTime), NULL, 360000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T08:10:51.573' AS DateTime), NULL, CAST(N'2023-12-12T08:10:51.573' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (84, 1, 1, N'HD-JUFZ6', NULL, NULL, NULL, CAST(N'2023-12-12T08:24:00.457' AS DateTime), NULL, 1160000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T08:24:00.457' AS DateTime), NULL, CAST(N'2023-12-12T08:24:00.457' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (85, 1, 1, N'HD-QHMSL', NULL, NULL, NULL, CAST(N'2023-12-12T08:36:00.187' AS DateTime), NULL, 2890000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T08:36:00.187' AS DateTime), NULL, CAST(N'2023-12-12T08:36:00.187' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (86, 1, 1, N'HD-4AZF6', NULL, NULL, NULL, CAST(N'2023-12-12T08:52:57.703' AS DateTime), NULL, 950000.0000, NULL, NULL, 0, NULL, CAST(N'2023-12-12T08:52:57.703' AS DateTime), NULL, CAST(N'2023-12-12T08:52:57.703' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (87, 1, 1, N'HD-4HVI2', NULL, NULL, NULL, CAST(N'2024-01-23T16:12:11.070' AS DateTime), NULL, 1600000.0000, NULL, NULL, 0, NULL, CAST(N'2024-01-23T15:40:11.890' AS DateTime), NULL, CAST(N'2024-01-23T15:40:11.890' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (88, 1, 3, N'HD-HYJPH', NULL, NULL, NULL, CAST(N'2024-01-23T15:46:23.610' AS DateTime), NULL, 1600000.0000, NULL, NULL, 0, NULL, CAST(N'2024-01-23T15:40:15.477' AS DateTime), NULL, CAST(N'2024-01-23T15:40:15.477' AS DateTime), 0, NULL)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted], [IDVoucher]) VALUES (89, 1, 2, N'HD-O3610', NULL, NULL, NULL, CAST(N'2024-01-23T16:26:54.777' AS DateTime), NULL, 258300.0000, NULL, NULL, 0, NULL, CAST(N'2024-01-23T16:16:15.610' AS DateTime), NULL, CAST(N'2024-01-23T16:16:15.610' AS DateTime), 0, NULL)
SET IDENTITY_INSERT [dbo].[Hoa_Don] OFF
SET IDENTITY_INSERT [dbo].[Hoa_Don_Chi_Tiet] ON 

INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, 7, 2, 120000.0000, -4, -480000.0000, NULL, NULL, CAST(N'2023-12-06T11:04:57.217' AS DateTime), NULL, CAST(N'2023-12-06T11:04:57.217' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, 6, 2, 670000.0000, 0, 0.0000, NULL, NULL, CAST(N'2023-12-06T11:04:59.483' AS DateTime), NULL, CAST(N'2023-12-06T11:04:59.483' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, 2, 2, 150000.0000, -2, -300000.0000, NULL, NULL, CAST(N'2023-12-06T11:05:04.620' AS DateTime), NULL, CAST(N'2023-12-06T11:05:04.620' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, 7, 3, 120000.0000, -2, -240000.0000, NULL, NULL, CAST(N'2023-12-06T11:15:07.970' AS DateTime), NULL, CAST(N'2023-12-06T11:15:07.970' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, 6, 3, 670000.0000, 0, 0.0000, NULL, NULL, CAST(N'2023-12-06T11:15:11.663' AS DateTime), NULL, CAST(N'2023-12-06T11:15:11.663' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 7, 4, 120000.0000, -1, -120000.0000, NULL, NULL, CAST(N'2023-12-06T12:47:53.820' AS DateTime), NULL, CAST(N'2023-12-06T12:47:53.820' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 7, 6, 120000.0000, -1, -120000.0000, NULL, NULL, CAST(N'2023-12-06T13:02:07.477' AS DateTime), NULL, CAST(N'2023-12-06T13:02:07.477' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, 7, 7, 120000.0000, -1, -120000.0000, NULL, NULL, CAST(N'2023-12-06T13:03:40.210' AS DateTime), NULL, CAST(N'2023-12-06T13:03:40.210' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, 7, 8, 120000.0000, -1, -120000.0000, NULL, NULL, CAST(N'2023-12-06T13:07:43.693' AS DateTime), NULL, CAST(N'2023-12-06T13:07:43.693' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, 3, 9, 680000.0000, 1, 680000.0000, NULL, NULL, CAST(N'2023-12-06T13:12:55.563' AS DateTime), NULL, CAST(N'2023-12-06T13:12:55.563' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, 2, 9, 150000.0000, -1, -150000.0000, NULL, NULL, CAST(N'2023-12-06T13:13:13.330' AS DateTime), NULL, CAST(N'2023-12-06T13:13:13.330' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, 7, 10, 120000.0000, -1, -120000.0000, NULL, NULL, CAST(N'2023-12-06T13:14:09.400' AS DateTime), NULL, CAST(N'2023-12-06T13:14:09.400' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, 7, 11, 120000.0000, -1, -120000.0000, NULL, NULL, CAST(N'2023-12-06T13:15:39.217' AS DateTime), NULL, CAST(N'2023-12-06T13:15:39.217' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, 7, 12, 120000.0000, -1, -120000.0000, NULL, NULL, CAST(N'2023-12-06T13:42:39.830' AS DateTime), NULL, CAST(N'2023-12-06T13:42:39.830' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (17, 7, 22, 120000.0000, 1, 120000.0000, NULL, NULL, CAST(N'2023-12-07T08:17:50.833' AS DateTime), NULL, CAST(N'2023-12-07T08:17:50.833' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (18, 6, 22, 670000.0000, 1, 670000.0000, NULL, NULL, CAST(N'2023-12-07T08:17:53.537' AS DateTime), NULL, CAST(N'2023-12-07T08:17:53.537' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (19, 7, 24, 120000.0000, 2, 240000.0000, NULL, NULL, CAST(N'2023-12-07T08:19:01.250' AS DateTime), NULL, CAST(N'2023-12-07T08:19:01.250' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (21, 6, 25, 670000.0000, 1, 670000.0000, NULL, NULL, CAST(N'2023-12-07T08:57:01.700' AS DateTime), NULL, CAST(N'2023-12-07T08:57:01.700' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (23, 6, 28, 670000.0000, 2, 1340000.0000, NULL, NULL, CAST(N'2023-12-07T09:56:52.197' AS DateTime), NULL, CAST(N'2023-12-07T09:56:52.197' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (25, 7, 27, 120000.0000, 2, 240000.0000, NULL, NULL, CAST(N'2023-12-07T16:52:20.633' AS DateTime), NULL, CAST(N'2023-12-07T16:52:20.633' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (27, 6, 27, 670000.0000, 2, 1340000.0000, NULL, NULL, CAST(N'2023-12-07T16:52:31.107' AS DateTime), NULL, CAST(N'2023-12-07T16:52:31.107' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (29, 7, 29, 120000.0000, 2, 240000.0000, NULL, NULL, CAST(N'2023-12-07T22:07:19.410' AS DateTime), NULL, CAST(N'2023-12-07T22:07:19.410' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (31, 3, 26, 680000.0000, 1, 680000.0000, NULL, NULL, CAST(N'2023-12-08T15:29:33.840' AS DateTime), NULL, CAST(N'2023-12-08T15:29:33.840' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (32, 1, 30, 450000.0000, 1, 450000.0000, NULL, NULL, CAST(N'2023-12-08T15:33:07.247' AS DateTime), NULL, CAST(N'2023-12-08T15:33:07.247' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (33, 3, 30, 680000.0000, 1, 680000.0000, NULL, NULL, CAST(N'2023-12-08T15:33:09.803' AS DateTime), NULL, CAST(N'2023-12-08T15:33:09.803' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (34, 7, 31, 120000.0000, 3, 360000.0000, NULL, NULL, CAST(N'2023-12-08T15:36:56.000' AS DateTime), NULL, CAST(N'2023-12-08T15:36:56.000' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (35, 2, 32, 150000.0000, 1, 150000.0000, NULL, NULL, CAST(N'2023-12-08T16:02:23.940' AS DateTime), NULL, CAST(N'2023-12-08T16:02:23.940' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (48, 9, 43, 300000.0000, 25, 7500000.0000, NULL, NULL, CAST(N'2023-12-09T15:07:25.227' AS DateTime), NULL, CAST(N'2023-12-09T15:07:25.227' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (49, 10, 45, 650000.0000, 1, 650000.0000, NULL, NULL, CAST(N'2023-12-09T15:22:57.767' AS DateTime), NULL, CAST(N'2023-12-09T15:22:57.767' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (51, 9, 47, 300000.0000, 1, 300000.0000, NULL, NULL, CAST(N'2023-12-10T09:41:17.107' AS DateTime), NULL, CAST(N'2023-12-10T09:41:17.107' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (55, 9, 49, 300000.0000, 1, 300000.0000, NULL, NULL, CAST(N'2023-12-10T11:14:18.870' AS DateTime), NULL, CAST(N'2023-12-10T11:14:18.870' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (56, 2, 46, 150000.0000, 1, 150000.0000, NULL, NULL, CAST(N'2023-12-10T19:36:31.523' AS DateTime), NULL, CAST(N'2023-12-10T19:36:31.523' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (57, 1, 46, 450000.0000, 1, 450000.0000, NULL, NULL, CAST(N'2023-12-10T19:57:23.857' AS DateTime), NULL, CAST(N'2023-12-10T19:57:23.857' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (60, 8, 50, 120000.0000, 2, 240000.0000, NULL, NULL, CAST(N'2023-12-11T15:25:57.010' AS DateTime), NULL, CAST(N'2023-12-11T15:25:57.010' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (61, 9, 50, 300000.0000, 1, 300000.0000, NULL, NULL, CAST(N'2023-12-11T15:26:21.950' AS DateTime), NULL, CAST(N'2023-12-11T15:26:21.950' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (64, 5, 53, 890000.0000, 1, 890000.0000, NULL, NULL, CAST(N'2023-12-11T15:33:20.443' AS DateTime), NULL, CAST(N'2023-12-11T15:33:20.443' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (69, 9, 57, 300000.0000, 1, 300000.0000, NULL, NULL, CAST(N'2023-12-11T15:40:57.310' AS DateTime), NULL, CAST(N'2023-12-11T15:40:57.310' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (70, 8, 58, 120000.0000, 1, 120000.0000, NULL, NULL, CAST(N'2023-12-11T15:43:47.070' AS DateTime), NULL, CAST(N'2023-12-11T15:43:47.070' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (74, 10, 60, 650000.0000, 2, 1300000.0000, NULL, NULL, CAST(N'2023-12-11T17:17:46.840' AS DateTime), NULL, CAST(N'2023-12-11T17:17:46.840' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (76, 10, 70, 650000.0000, 3, 1950000.0000, NULL, NULL, CAST(N'2023-12-11T18:08:18.050' AS DateTime), NULL, CAST(N'2023-12-11T18:08:18.050' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (78, 7, 69, 120000.0000, 1, 120000.0000, NULL, NULL, CAST(N'2023-12-11T18:14:28.313' AS DateTime), NULL, CAST(N'2023-12-11T18:14:28.313' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (79, 12, 69, 300000.0000, 1, 300000.0000, NULL, NULL, CAST(N'2023-12-11T19:49:47.173' AS DateTime), NULL, CAST(N'2023-12-11T19:49:47.173' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (80, 10, 69, 650000.0000, 4, 2600000.0000, NULL, NULL, CAST(N'2023-12-11T19:49:49.933' AS DateTime), NULL, CAST(N'2023-12-11T19:49:49.933' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (81, 8, 69, 120000.0000, 1, 120000.0000, NULL, NULL, CAST(N'2023-12-11T19:49:55.307' AS DateTime), NULL, CAST(N'2023-12-11T19:49:55.307' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (82, 2, 68, 150000.0000, 1, 150000.0000, NULL, NULL, CAST(N'2023-12-11T19:55:41.097' AS DateTime), NULL, CAST(N'2023-12-11T19:55:41.097' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (83, 8, 68, 120000.0000, 2, 240000.0000, NULL, NULL, CAST(N'2023-12-11T19:55:46.000' AS DateTime), NULL, CAST(N'2023-12-11T19:55:46.000' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (84, 10, 68, 650000.0000, 1, 650000.0000, NULL, NULL, CAST(N'2023-12-11T19:55:48.693' AS DateTime), NULL, CAST(N'2023-12-11T19:55:48.693' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (85, 13, 72, 380000.0000, 3, 1140000.0000, NULL, NULL, CAST(N'2023-12-12T07:26:12.997' AS DateTime), NULL, CAST(N'2023-12-12T07:26:12.997' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (86, 12, 72, 300000.0000, 2, 600000.0000, NULL, NULL, CAST(N'2023-12-12T07:26:33.490' AS DateTime), NULL, CAST(N'2023-12-12T07:26:33.490' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (87, 10, 72, 650000.0000, 2, 1300000.0000, NULL, NULL, CAST(N'2023-12-12T07:26:52.137' AS DateTime), NULL, CAST(N'2023-12-12T07:26:52.137' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (88, 13, 73, 380000.0000, 1, 380000.0000, NULL, NULL, CAST(N'2023-12-12T08:08:27.483' AS DateTime), NULL, CAST(N'2023-12-12T08:08:27.483' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (89, 11, 73, 900000.0000, 3, 2700000.0000, NULL, NULL, CAST(N'2023-12-12T08:08:33.233' AS DateTime), NULL, CAST(N'2023-12-12T08:08:33.233' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (90, 13, 83, 380000.0000, 1, 380000.0000, NULL, NULL, CAST(N'2023-12-12T08:10:58.127' AS DateTime), NULL, CAST(N'2023-12-12T08:10:58.127' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (91, 13, 82, 380000.0000, 1, 380000.0000, NULL, NULL, CAST(N'2023-12-12T08:18:28.337' AS DateTime), NULL, CAST(N'2023-12-12T08:18:28.337' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (92, 13, 84, 380000.0000, 2, 760000.0000, NULL, NULL, CAST(N'2023-12-12T08:24:05.633' AS DateTime), NULL, CAST(N'2023-12-12T08:24:05.633' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (93, 12, 84, 300000.0000, 2, 600000.0000, NULL, NULL, CAST(N'2023-12-12T08:24:08.620' AS DateTime), NULL, CAST(N'2023-12-12T08:24:08.620' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (94, 13, 85, 380000.0000, 3, 1140000.0000, NULL, NULL, CAST(N'2023-12-12T08:36:30.090' AS DateTime), NULL, CAST(N'2023-12-12T08:36:30.090' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (95, 10, 85, 650000.0000, 3, 1950000.0000, NULL, NULL, CAST(N'2023-12-12T08:36:44.520' AS DateTime), NULL, CAST(N'2023-12-12T08:36:44.520' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (97, 14, 86, 300000.0000, 2, 600000.0000, NULL, NULL, CAST(N'2024-01-10T13:33:22.163' AS DateTime), NULL, CAST(N'2024-01-10T13:33:22.163' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (99, 13, 81, 380000.0000, 1, 380000.0000, NULL, NULL, CAST(N'2024-01-17T16:47:41.417' AS DateTime), NULL, CAST(N'2024-01-17T16:47:41.417' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (104, 16, 80, 123000.0000, 2, 246000.0000, NULL, NULL, CAST(N'2024-01-22T20:31:10.223' AS DateTime), NULL, CAST(N'2024-01-22T20:31:10.223' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (106, 14, 79, 300000.0000, 2, 600000.0000, NULL, NULL, CAST(N'2024-01-22T20:56:28.107' AS DateTime), NULL, CAST(N'2024-01-22T20:56:28.107' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (108, 10, 78, 650000.0000, 1, 650000.0000, NULL, NULL, CAST(N'2024-01-22T22:30:05.433' AS DateTime), NULL, CAST(N'2024-01-22T22:30:05.433' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (109, 16, 77, 123000.0000, 1, 123000.0000, NULL, NULL, CAST(N'2024-01-22T23:16:06.853' AS DateTime), NULL, CAST(N'2024-01-22T23:16:06.853' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (111, 16, 76, 123000.0000, 1, 123000.0000, NULL, NULL, CAST(N'2024-01-22T23:21:43.303' AS DateTime), NULL, CAST(N'2024-01-22T23:21:43.303' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (112, 15, 76, 450000.0000, 1, 450000.0000, NULL, NULL, CAST(N'2024-01-22T23:21:53.067' AS DateTime), NULL, CAST(N'2024-01-22T23:21:53.067' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (113, 15, 88, 450000.0000, 4, 1800000.0000, NULL, NULL, CAST(N'2024-01-23T15:40:27.440' AS DateTime), NULL, CAST(N'2024-01-23T15:40:27.440' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (114, 15, 87, 450000.0000, 4, 1800000.0000, NULL, NULL, CAST(N'2024-01-23T16:08:03.920' AS DateTime), NULL, CAST(N'2024-01-23T16:08:03.920' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (115, 16, 89, 123000.0000, 3, 369000.0000, NULL, NULL, CAST(N'2024-01-23T16:16:20.713' AS DateTime), NULL, CAST(N'2024-01-23T16:16:20.713' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Hoa_Don_Chi_Tiet] OFF
SET IDENTITY_INSERT [dbo].[Khach_Hang] ON 

INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'KH01', N'Lò Thị Bưởi', N'0353869573', N'Hà Nội', 1, NULL, NULL, CAST(N'2023-12-06T10:20:13.197' AS DateTime), NULL, CAST(N'2023-12-06T10:20:13.197' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'lCepyVu9', N'Cao Ngọc Giáp', N'0359430944', N'Hà Nội', 1, NULL, NULL, CAST(N'2023-12-07T02:02:45.363' AS DateTime), NULL, CAST(N'2023-12-07T02:02:45.363' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'2wyGJfuY', N'Tạ Thành Tấn', N'0934847523', N'Lào Cai', 1, NULL, NULL, CAST(N'2023-12-07T23:47:42.510' AS DateTime), NULL, CAST(N'2023-12-07T23:47:42.510' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'KH-7KYT7', N'Doraemon', N'0354758237', N'Hà Nội', 1, NULL, NULL, CAST(N'2023-12-07T23:55:08.873' AS DateTime), NULL, CAST(N'2023-12-07T23:55:08.873' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'KH-ID5DL', N'Nohara Sinosuke', N'0989545823', N'Gia Lai', 1, NULL, NULL, CAST(N'2023-12-07T23:57:34.377' AS DateTime), NULL, CAST(N'2023-12-07T23:57:34.377' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'KH-4TOBI', N'Minamoto Shizuka', N'0326456667', N'Mai Châu', 0, NULL, NULL, CAST(N'2023-12-08T00:03:28.170' AS DateTime), NULL, CAST(N'2023-12-08T00:03:28.170' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'KH-9GAZ8', N'Nguyễn Thị Hà Duyên', N'0984572379', N'Hòa Bình', 0, NULL, NULL, CAST(N'2023-12-08T00:05:06.603' AS DateTime), NULL, CAST(N'2023-12-08T00:05:06.603' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'ANTxPOp1', N'Hoàng Thị Thắm', N'0986818764', NULL, 0, NULL, NULL, CAST(N'2023-12-10T09:55:11.780' AS DateTime), NULL, CAST(N'2023-12-10T09:55:11.780' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'qk9gBaOC', N'Hoàng Thị Thắm', N'0989414864', NULL, 0, NULL, NULL, CAST(N'2023-12-10T09:56:17.230' AS DateTime), NULL, CAST(N'2023-12-10T09:56:17.230' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'HoBez5XV', N'Lệ Rơi', N'0989414183', N'Gia Lai', 0, NULL, NULL, CAST(N'2023-12-10T10:12:26.770' AS DateTime), NULL, CAST(N'2023-12-10T10:12:26.770' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Khach_Hang] OFF
SET IDENTITY_INSERT [dbo].[Khuyen_Mai] ON 

INSERT [dbo].[Khuyen_Mai] ([ID], [Ma], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'', N'', NULL, CAST(N'2023-12-14T00:00:00.000' AS DateTime), 0, NULL, CAST(N'2023-12-11T11:39:25.633' AS DateTime), NULL, CAST(N'2023-12-11T11:39:25.633' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Khuyen_Mai] OFF
SET IDENTITY_INSERT [dbo].[Lich_Su_Hoa_Don] ON 

INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, 11, CAST(N'2023-12-07T02:12:45.717' AS DateTime), 7, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-07T02:12:45.717' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, 11, CAST(N'2023-12-07T07:41:41.170' AS DateTime), 5, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-07T07:41:41.170' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, 11, CAST(N'2023-12-07T08:22:48.417' AS DateTime), 5, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-07T08:22:48.417' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, 11, CAST(N'2023-12-07T08:39:17.223' AS DateTime), 6, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-07T08:39:17.223' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, 11, CAST(N'2023-12-07T09:00:34.133' AS DateTime), 7, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-07T09:00:34.133' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, 11, CAST(N'2023-12-07T09:01:13.567' AS DateTime), 8, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-07T09:01:13.567' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 11, CAST(N'2023-12-07T10:00:55.267' AS DateTime), 6, 0, NULL, CAST(N'2023-12-06T13:15:32.550' AS DateTime), NULL, CAST(N'2023-12-07T10:00:55.267' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, 25, CAST(N'2023-12-07T10:01:31.823' AS DateTime), 5, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T10:01:31.823' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 25, CAST(N'2023-12-07T10:02:20.457' AS DateTime), 5, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T10:02:20.457' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, 25, CAST(N'2023-12-07T10:02:41.833' AS DateTime), 6, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T10:02:41.833' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, 25, CAST(N'2023-12-07T10:05:54.803' AS DateTime), 8, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T10:05:54.803' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, 25, CAST(N'2023-12-07T10:06:11.780' AS DateTime), 7, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T10:06:11.780' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, 25, CAST(N'2023-12-07T22:09:52.967' AS DateTime), 7, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T22:09:52.967' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, 25, CAST(N'2023-12-07T22:10:06.783' AS DateTime), 8, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-07T22:10:06.783' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, 29, CAST(N'2023-12-07T22:16:20.660' AS DateTime), 7, 0, NULL, CAST(N'2023-12-07T22:06:27.420' AS DateTime), NULL, CAST(N'2023-12-07T22:16:20.660' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, 29, CAST(N'2023-12-07T22:24:15.770' AS DateTime), 7, 0, NULL, CAST(N'2023-12-07T22:06:27.420' AS DateTime), NULL, CAST(N'2023-12-07T22:24:15.770' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (17, 29, CAST(N'2023-12-07T22:25:44.240' AS DateTime), 7, 0, NULL, CAST(N'2023-12-07T22:06:27.420' AS DateTime), NULL, CAST(N'2023-12-07T22:25:44.240' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (18, 25, CAST(N'2023-12-08T18:43:34.633' AS DateTime), 6, 0, NULL, CAST(N'2023-12-07T08:56:02.030' AS DateTime), NULL, CAST(N'2023-12-08T18:43:34.633' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (19, 33, CAST(N'2023-12-08T18:44:41.427' AS DateTime), 7, 0, NULL, CAST(N'2023-12-08T18:36:20.367' AS DateTime), NULL, CAST(N'2023-12-08T18:44:41.427' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (20, 33, CAST(N'2023-12-08T18:46:38.907' AS DateTime), 8, 0, NULL, CAST(N'2023-12-08T18:36:20.367' AS DateTime), NULL, CAST(N'2023-12-08T18:46:38.907' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (21, 2, CAST(N'2023-12-08T23:08:51.927' AS DateTime), 1, 2, NULL, CAST(N'2023-12-06T11:04:51.437' AS DateTime), NULL, CAST(N'2023-12-08T23:08:51.927' AS DateTime), 1)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (22, 32, CAST(N'2023-12-08T23:15:32.110' AS DateTime), 1, 0, NULL, CAST(N'2023-12-08T15:42:38.357' AS DateTime), NULL, CAST(N'2023-12-08T23:15:32.110' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (23, 34, CAST(N'2023-12-08T23:16:55.550' AS DateTime), 1, 0, NULL, CAST(N'2023-12-08T20:57:46.153' AS DateTime), NULL, CAST(N'2023-12-08T23:16:55.550' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (24, 45, CAST(N'2023-12-09T15:58:11.990' AS DateTime), 1, 0, NULL, CAST(N'2023-12-09T15:06:50.703' AS DateTime), NULL, CAST(N'2023-12-09T15:58:11.990' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (25, 47, CAST(N'2023-12-10T09:56:56.277' AS DateTime), 1, 0, NULL, CAST(N'2023-12-10T00:02:03.500' AS DateTime), NULL, CAST(N'2023-12-10T09:56:56.277' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (26, 48, CAST(N'2023-12-10T10:17:38.770' AS DateTime), 1, 0, NULL, CAST(N'2023-12-10T09:57:20.497' AS DateTime), NULL, CAST(N'2023-12-10T10:17:38.770' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (27, 49, CAST(N'2023-12-10T19:35:51.660' AS DateTime), 1, 0, NULL, CAST(N'2023-12-10T10:17:50.690' AS DateTime), NULL, CAST(N'2023-12-10T19:35:51.660' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (28, 49, CAST(N'2023-12-11T15:10:06.350' AS DateTime), 7, 0, NULL, CAST(N'2023-12-10T10:17:50.690' AS DateTime), NULL, CAST(N'2023-12-11T15:10:06.350' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (29, 51, CAST(N'2023-12-11T15:29:37.467' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T15:28:05.523' AS DateTime), NULL, CAST(N'2023-12-11T15:29:37.467' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (30, 52, CAST(N'2023-12-11T15:32:08.453' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T15:31:21.583' AS DateTime), NULL, CAST(N'2023-12-11T15:32:08.453' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (31, 56, CAST(N'2023-12-11T15:37:36.187' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T15:37:06.880' AS DateTime), NULL, CAST(N'2023-12-11T15:37:36.187' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (32, 58, CAST(N'2023-12-11T16:43:17.227' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T15:43:35.963' AS DateTime), NULL, CAST(N'2023-12-11T16:43:17.227' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (33, 59, CAST(N'2023-12-11T17:02:08.590' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:02:08.590' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (34, 59, CAST(N'2023-12-11T17:10:17.383' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:10:17.383' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (35, 59, CAST(N'2023-12-11T17:12:07.447' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:12:07.447' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (36, 59, CAST(N'2023-12-11T17:12:22.743' AS DateTime), 8, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:12:22.743' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (37, 59, CAST(N'2023-12-11T17:14:15.677' AS DateTime), 8, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:14:15.677' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (38, 60, CAST(N'2023-12-11T17:18:06.400' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:18:06.400' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (39, 59, CAST(N'2023-12-11T17:22:04.797' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:22:04.797' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (40, 59, CAST(N'2023-12-11T17:23:53.430' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:23:53.430' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (41, 59, CAST(N'2023-12-11T17:24:47.597' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:24:47.597' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (42, 59, CAST(N'2023-12-11T17:25:36.647' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T17:25:36.647' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (43, 60, CAST(N'2023-12-11T17:26:40.993' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:26:40.993' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (44, 60, CAST(N'2023-12-11T17:30:22.773' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:30:22.773' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (45, 60, CAST(N'2023-12-11T17:31:48.297' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:31:48.297' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (46, 60, CAST(N'2023-12-11T17:33:19.713' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:33:19.713' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (47, 60, CAST(N'2023-12-11T17:35:19.910' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:35:19.910' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (48, 60, CAST(N'2023-12-11T17:36:54.493' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T17:16:41.657' AS DateTime), NULL, CAST(N'2023-12-11T17:36:54.493' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (49, 70, CAST(N'2023-12-11T18:09:19.770' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T18:09:19.770' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (50, 59, CAST(N'2023-12-11T18:09:46.803' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T16:50:33.467' AS DateTime), NULL, CAST(N'2023-12-11T18:09:46.803' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (51, 70, CAST(N'2023-12-11T18:10:30.773' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T18:10:30.773' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (52, 70, CAST(N'2023-12-11T18:45:46.467' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T18:45:46.467' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (53, 70, CAST(N'2023-12-11T18:48:36.620' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T18:48:36.620' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (54, 70, CAST(N'2023-12-11T19:06:40.717' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T19:06:40.717' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (55, 70, CAST(N'2023-12-11T19:06:55.693' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T19:06:55.693' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (56, 70, CAST(N'2023-12-11T19:07:33.890' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T19:07:33.890' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (57, 70, CAST(N'2023-12-11T19:07:59.560' AS DateTime), 8, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-11T19:07:59.560' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (58, 69, CAST(N'2023-12-11T19:50:09.017' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T18:07:42.800' AS DateTime), NULL, CAST(N'2023-12-11T19:50:09.017' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (59, 69, CAST(N'2023-12-11T19:50:31.407' AS DateTime), 5, 0, NULL, CAST(N'2023-12-11T18:07:42.800' AS DateTime), NULL, CAST(N'2023-12-11T19:50:31.407' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (60, 69, CAST(N'2023-12-11T19:50:41.020' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:42.800' AS DateTime), NULL, CAST(N'2023-12-11T19:50:41.020' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (61, 69, CAST(N'2023-12-11T19:51:42.077' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T18:07:42.800' AS DateTime), NULL, CAST(N'2023-12-11T19:51:42.077' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (62, 68, CAST(N'2023-12-12T05:55:36.320' AS DateTime), 1, 0, NULL, CAST(N'2023-12-11T18:07:41.470' AS DateTime), NULL, CAST(N'2023-12-12T05:55:36.320' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (63, 70, CAST(N'2023-12-12T07:10:03.433' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T07:10:03.433' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (64, 70, CAST(N'2023-12-12T07:10:10.680' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T07:10:10.680' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (65, 70, CAST(N'2023-12-12T07:21:17.850' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T07:21:17.850' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (66, 70, CAST(N'2023-12-12T07:22:43.450' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T07:22:43.450' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (67, 70, CAST(N'2023-12-12T07:24:17.687' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T07:24:17.687' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (68, 72, CAST(N'2023-12-12T07:28:19.183' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T07:25:53.243' AS DateTime), NULL, CAST(N'2023-12-12T07:28:19.183' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (69, 72, CAST(N'2023-12-12T07:28:26.940' AS DateTime), 7, 0, NULL, CAST(N'2023-12-12T07:25:53.243' AS DateTime), NULL, CAST(N'2023-12-12T07:28:26.940' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (70, 72, CAST(N'2023-12-12T07:29:00.720' AS DateTime), 8, 0, NULL, CAST(N'2023-12-12T07:25:53.243' AS DateTime), NULL, CAST(N'2023-12-12T07:29:00.720' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (71, 70, CAST(N'2023-12-12T07:29:34.827' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T07:29:34.827' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (72, 73, CAST(N'2023-12-12T08:09:17.607' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T07:46:13.220' AS DateTime), NULL, CAST(N'2023-12-12T08:09:17.607' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (73, 83, CAST(N'2023-12-12T08:12:18.533' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T08:10:51.573' AS DateTime), NULL, CAST(N'2023-12-12T08:12:18.533' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (74, 82, CAST(N'2023-12-12T08:18:37.713' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T08:08:06.593' AS DateTime), NULL, CAST(N'2023-12-12T08:18:37.713' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (75, 84, CAST(N'2023-12-12T08:24:25.860' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T08:24:00.457' AS DateTime), NULL, CAST(N'2023-12-12T08:24:25.860' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (76, 85, CAST(N'2023-12-12T08:38:06.030' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T08:36:00.187' AS DateTime), NULL, CAST(N'2023-12-12T08:38:06.030' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (77, 70, CAST(N'2023-12-12T08:38:43.180' AS DateTime), 6, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T08:38:43.180' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (78, 70, CAST(N'2023-12-12T08:39:03.877' AS DateTime), 7, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T08:39:03.877' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (79, 70, CAST(N'2023-12-12T08:39:28.760' AS DateTime), 8, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T08:39:28.760' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (80, 70, CAST(N'2023-12-12T08:39:43.020' AS DateTime), 8, 0, NULL, CAST(N'2023-12-11T18:07:44.183' AS DateTime), NULL, CAST(N'2023-12-12T08:39:43.020' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (81, 86, CAST(N'2024-01-10T13:35:06.127' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T08:52:57.703' AS DateTime), NULL, CAST(N'2024-01-10T13:35:06.127' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (82, 81, CAST(N'2024-01-17T16:47:57.493' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T08:06:50.493' AS DateTime), NULL, CAST(N'2024-01-17T16:47:57.493' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (83, 86, CAST(N'2024-01-17T16:48:14.527' AS DateTime), 7, 0, NULL, CAST(N'2023-12-12T08:52:57.703' AS DateTime), NULL, CAST(N'2024-01-17T16:48:14.527' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (84, 80, CAST(N'2024-01-22T20:44:59.243' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T07:46:26.480' AS DateTime), NULL, CAST(N'2024-01-22T20:44:59.243' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (85, 79, CAST(N'2024-01-22T22:15:07.943' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T07:46:23.763' AS DateTime), NULL, CAST(N'2024-01-22T22:15:07.943' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (86, 79, CAST(N'2024-01-22T22:15:24.323' AS DateTime), 5, 0, NULL, CAST(N'2023-12-12T07:46:23.763' AS DateTime), NULL, CAST(N'2024-01-22T22:15:24.323' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (87, 78, CAST(N'2024-01-22T22:41:00.637' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T07:46:21.813' AS DateTime), NULL, CAST(N'2024-01-22T22:41:00.637' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (88, 77, CAST(N'2024-01-22T23:16:25.470' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T07:46:19.893' AS DateTime), NULL, CAST(N'2024-01-22T23:16:25.470' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (89, 76, CAST(N'2024-01-22T23:22:08.277' AS DateTime), 1, 0, NULL, CAST(N'2023-12-12T07:46:17.803' AS DateTime), NULL, CAST(N'2024-01-22T23:22:08.277' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (90, 88, CAST(N'2024-01-23T15:46:23.610' AS DateTime), 1, 0, NULL, CAST(N'2024-01-23T15:40:15.477' AS DateTime), NULL, CAST(N'2024-01-23T15:46:23.610' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (91, 87, CAST(N'2024-01-23T16:12:11.070' AS DateTime), 1, 0, NULL, CAST(N'2024-01-23T15:40:11.890' AS DateTime), NULL, CAST(N'2024-01-23T16:12:11.070' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (92, 89, CAST(N'2024-01-23T16:26:54.777' AS DateTime), 1, 0, NULL, CAST(N'2024-01-23T16:16:15.610' AS DateTime), NULL, CAST(N'2024-01-23T16:26:54.777' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Lich_Su_Hoa_Don] OFF
SET IDENTITY_INSERT [dbo].[Mau_Sac] ON 

INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-2ACGR8F', N'Vàng', NULL, CAST(N'2023-12-06T09:20:15.437' AS DateTime), NULL, CAST(N'2023-12-06T09:20:15.437' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-R53GBFU', N'Đỏ', NULL, CAST(N'2023-12-06T09:20:20.947' AS DateTime), NULL, CAST(N'2023-12-06T09:20:20.947' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-CHV5CD7', N'Trắng', NULL, CAST(N'2023-12-06T09:20:26.627' AS DateTime), NULL, CAST(N'2023-12-06T09:20:26.627' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-MBO321H', N'Xanh lam', NULL, CAST(N'2023-12-06T09:20:32.530' AS DateTime), NULL, CAST(N'2023-12-06T09:20:32.530' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-5HBHZ41', N'Dạ', NULL, CAST(N'2023-12-06T09:20:37.977' AS DateTime), NULL, CAST(N'2023-12-06T09:20:37.977' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'TT-G5HBG5Q', N'Tím', NULL, CAST(N'2023-12-06T10:29:47.173' AS DateTime), NULL, CAST(N'2023-12-06T10:29:47.173' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'TT-RO49VFW', N'đen', NULL, CAST(N'2023-12-08T18:20:04.580' AS DateTime), NULL, CAST(N'2023-12-08T18:20:04.580' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'TT-I6H6EJX', N'Nhám', NULL, CAST(N'2023-12-10T09:06:26.183' AS DateTime), NULL, CAST(N'2023-12-10T09:06:26.183' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Mau_Sac] OFF
SET IDENTITY_INSERT [dbo].[Nha_San_Xuat] ON 

INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-2LQMS2U', N'Polyshoes', NULL, CAST(N'2023-12-06T09:27:14.493' AS DateTime), NULL, CAST(N'2023-12-06T09:27:14.493' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-P9ZVE62', N'Vasashoes', NULL, CAST(N'2023-12-06T09:27:22.883' AS DateTime), NULL, CAST(N'2023-12-06T09:27:22.883' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-HUVG34G', N'Biti''s', NULL, CAST(N'2023-12-06T09:27:33.830' AS DateTime), NULL, CAST(N'2023-12-06T09:27:33.830' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-Q7RD6EG', N'Việt Tín', NULL, CAST(N'2023-12-06T10:30:49.313' AS DateTime), NULL, CAST(N'2023-12-06T10:30:49.313' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-M42V0WC', N'Liên Quân', NULL, CAST(N'2023-12-09T06:25:59.767' AS DateTime), NULL, CAST(N'2023-12-09T06:25:59.767' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'TT-647WK5L', N'Mobile', NULL, CAST(N'2023-12-10T09:06:13.687' AS DateTime), NULL, CAST(N'2023-12-10T09:06:13.687' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Nha_San_Xuat] OFF
SET IDENTITY_INSERT [dbo].[Nhan_Vien] ON 

INSERT [dbo].[Nhan_Vien] ([ID], [IDChucVu], [MaNV], [Email], [MatKhau], [CCCD], [TenNV], [NgaySinh], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (1, 1, N'NV01', N'caongocgiap732004@gmail.com', N'123', N'001204053647', N'Cao Ngọc Giáp', CAST(N'2004-03-07' AS Date), N'0359430944', N'Hà Nội', 1, 1, CAST(N'2023-12-06T09:14:49.647' AS DateTime), NULL, CAST(N'2023-12-06T09:14:49.647' AS DateTime), NULL, 0)
INSERT [dbo].[Nhan_Vien] ([ID], [IDChucVu], [MaNV], [Email], [MatKhau], [CCCD], [TenNV], [NgaySinh], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (2, 1, N'NV02', N'mike@yahoo.com', N'qhsFcAtW', N'638424959000', N'Lê Văn Trung', CAST(N'1993-11-16' AS Date), N'0861232478', N'Quảng Trị', 1, 0, CAST(N'2023-12-07T08:23:46.253' AS DateTime), NULL, CAST(N'2023-12-07T08:23:46.253' AS DateTime), NULL, 0)
INSERT [dbo].[Nhan_Vien] ([ID], [IDChucVu], [MaNV], [Email], [MatKhau], [CCCD], [TenNV], [NgaySinh], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (3, 1, N'NV03', N'quannvph37802@fpt.edu.vn', N'xEeFF2s3', N'786700343732', N'Hoàng Đức Cường', CAST(N'1928-05-16' AS Date), N'0961047618', N'Quảng Trị', 1, 1, CAST(N'2023-12-07T10:10:40.677' AS DateTime), NULL, CAST(N'2023-12-07T10:10:40.677' AS DateTime), NULL, 0)
INSERT [dbo].[Nhan_Vien] ([ID], [IDChucVu], [MaNV], [Email], [MatKhau], [CCCD], [TenNV], [NgaySinh], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (4, 2, N'NV04', N'hanhnmph45345@fpt.edu.vn', N'OKpr2rHz', N'001201015787', N'Nguyễn Mạnh Hạnh', CAST(N'2001-08-08' AS Date), N'0989676173', N'Dương Nội', 1, 1, CAST(N'2023-12-11T09:42:06.633' AS DateTime), NULL, CAST(N'2023-12-11T09:42:06.633' AS DateTime), NULL, 0)
INSERT [dbo].[Nhan_Vien] ([ID], [IDChucVu], [MaNV], [Email], [MatKhau], [CCCD], [TenNV], [NgaySinh], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (5, 1, N'NV05', N'caongocgiap732004@gmail.com', N'ufPexYZL', N'001204944233', N'Phạm Văn Tuấn', CAST(N'2000-12-26' AS Date), N'0538793518', N'Đồng Tháp', 1, 1, CAST(N'2023-12-14T00:07:38.550' AS DateTime), NULL, CAST(N'2023-12-14T00:07:38.550' AS DateTime), NULL, 0)
SET IDENTITY_INSERT [dbo].[Nhan_Vien] OFF
SET IDENTITY_INSERT [dbo].[San_Pham] ON 

INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'SP-PZH91FE', N'Giày kiên cường', N'Tăng kháng hiệu ứng
', 0, NULL, CAST(N'2023-12-06T09:18:52.000' AS DateTime), NULL, CAST(N'2023-12-06T09:18:52.000' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'SP-35AHCY4', N'Giày du mục', N'Tăng tốc đánh', 0, NULL, CAST(N'2023-12-06T09:29:31.023' AS DateTime), NULL, CAST(N'2023-12-06T09:29:31.023' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'SP-6LHXXU7', N'Giày thuật sĩ', N'Giảm hồi chiêu', 1, NULL, CAST(N'2023-12-06T09:30:00.680' AS DateTime), NULL, CAST(N'2023-12-06T09:30:00.680' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'SP-GIAYK0X', N'Giày Hermes', N'Tăng tốc chạy', 1, NULL, CAST(N'2023-12-06T09:30:29.040' AS DateTime), NULL, CAST(N'2023-12-06T09:30:29.040' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'SP-GVKJZ6H', N'Giày phù thủy', N'Xuyên giáp phép', 1, NULL, CAST(N'2023-12-06T09:30:46.690' AS DateTime), NULL, CAST(N'2023-12-06T09:30:46.690' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'SP-PMHJYP1', N'Giày hộ vệ ', N'Tăng giáp', 1, NULL, CAST(N'2023-12-06T09:31:04.703' AS DateTime), NULL, CAST(N'2023-12-06T09:31:04.703' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'SP-HXQB3FH', N'Giày thép', N'Giày mặc định', 1, NULL, CAST(N'2023-12-06T09:31:56.530' AS DateTime), NULL, CAST(N'2023-12-06T09:31:56.530' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'SP-QL5A15P', N'Giày Nike', N'Phong cách trẻ trung', 0, NULL, CAST(N'2023-12-06T10:59:36.270' AS DateTime), NULL, CAST(N'2023-12-06T10:59:36.270' AS DateTime), 1)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'SP-K0A3D7Z', N'Giày thép', N'Giày mặc định', 0, NULL, CAST(N'2023-12-08T18:20:33.173' AS DateTime), NULL, CAST(N'2023-12-08T18:20:33.173' AS DateTime), 1)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'SP-ALKQ70V', N'Giày bata', N'Giày chuyên dụng cho thể thao', 1, NULL, CAST(N'2023-12-11T18:53:31.537' AS DateTime), NULL, CAST(N'2023-12-11T18:53:31.537' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, N'SP-71AAUGQ', N'Giày đinh', N'Giày thể thao đá bóng ', 1, NULL, CAST(N'2023-12-12T08:45:59.270' AS DateTime), NULL, CAST(N'2023-12-12T08:45:59.270' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, N'SP-HN1Z0JC', N'Giày boy phố', N'Giày giới trẻ săn đón', 1, NULL, CAST(N'2024-01-10T13:30:40.380' AS DateTime), NULL, CAST(N'2024-01-10T13:30:40.380' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, N'SP-5N2XGHR', N'Giày lính cụ Hồ', N'Giày bộ đội đặc chủng QDND Việt Nam', 1, NULL, CAST(N'2024-01-22T20:21:38.007' AS DateTime), NULL, CAST(N'2024-01-22T20:21:38.007' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[San_Pham] OFF
SET IDENTITY_INSERT [dbo].[San_Pham_Chi_Tiet] ON 

INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, 3, 4, 3, 5, 5, 6, 3, 4, 4, 3, N'SPCT-PG5DG', NULL, 450000.0000, 378, 0, NULL, CAST(N'2023-12-06T09:33:15.240' AS DateTime), NULL, CAST(N'2023-12-06T09:33:15.240' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, 4, 5, 4, 6, 6, 6, 4, 5, 5, 4, N'SPCT-SIYRO', NULL, 150000.0000, 275, 0, NULL, CAST(N'2023-12-06T10:32:08.657' AS DateTime), NULL, CAST(N'2023-12-06T10:32:08.657' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, 2, 3, 2, 2, 2, 5, 2, 1, 2, 2, N'SPCT-IHNRE', NULL, 680000.0000, 129, 0, NULL, CAST(N'2023-12-06T10:37:01.090' AS DateTime), NULL, CAST(N'2023-12-06T10:37:01.090' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, 1, 3, 2, 4, 4, 4, 2, 2, 3, 3, N'SPCT-HUFA1', NULL, 690000.0000, 69, 0, NULL, CAST(N'2023-12-06T10:46:53.887' AS DateTime), NULL, CAST(N'2023-12-06T10:46:53.887' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, 2, 2, 1, 5, 6, 4, 3, 5, 1, 1, N'SPCT-J60DE', NULL, 890000.0000, 207, 0, NULL, CAST(N'2023-12-06T10:47:20.147' AS DateTime), NULL, CAST(N'2023-12-06T10:47:20.147' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, 1, 5, 4, 1, 6, 3, 2, 2, 2, 4, N'SPCT-R3K7C', NULL, 670000.0000, 445, 0, NULL, CAST(N'2023-12-06T10:47:54.420' AS DateTime), NULL, CAST(N'2023-12-06T10:47:54.420' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 1, 1, 2, 1, 4, 3, 3, 2, 5, 2, N'SPCT-0OTJ1', NULL, 120000.0000, 644, 0, NULL, CAST(N'2023-12-06T10:48:17.803' AS DateTime), NULL, CAST(N'2023-12-06T10:48:17.803' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, 3, 4, 3, 4, 4, 5, 2, 6, 2, 2, N'SPCT-GIUX5', NULL, 120000.0000, 205, 0, NULL, CAST(N'2023-12-07T08:20:16.160' AS DateTime), NULL, CAST(N'2023-12-07T08:20:16.160' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 4, 5, 4, 7, 6, 7, 4, 8, 5, 4, N'SPCT-G00YK', NULL, 300000.0000, 377, 0, NULL, CAST(N'2023-12-08T18:24:45.197' AS DateTime), NULL, CAST(N'2023-12-08T18:24:45.197' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, 4, 5, 3, 5, 4, 7, 3, 5, 2, 2, N'SPCT-4BAXO', NULL, 650000.0000, 324, 0, NULL, CAST(N'2023-12-08T22:33:00.213' AS DateTime), NULL, CAST(N'2023-12-08T22:33:00.213' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, 4, 5, 1, 5, 4, 6, 4, 6, 5, 4, N'SPCT-QYPUG', NULL, 900000.0000, 540, 0, NULL, CAST(N'2023-12-08T23:49:28.273' AS DateTime), NULL, CAST(N'2023-12-08T23:49:28.273' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, 4, 5, 6, 8, 7, 10, 4, 9, 5, 4, N'SPCT-EP2QQ', NULL, 300000.0000, 25, 0, NULL, CAST(N'2023-12-11T18:59:27.680' AS DateTime), NULL, CAST(N'2023-12-11T18:59:27.680' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, 1, 3, 5, 8, 7, 10, 3, 7, 3, 4, N'SPCT-JJF45', NULL, 380000.0000, 42, 0, NULL, CAST(N'2023-12-12T05:23:47.160' AS DateTime), NULL, CAST(N'2023-12-12T05:23:47.160' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, 2, 5, 6, 8, 7, 11, 4, 9, 6, 4, N'SPCT-N29H5', NULL, 300000.0000, 301, 0, NULL, CAST(N'2023-12-12T08:48:16.263' AS DateTime), NULL, CAST(N'2023-12-12T08:48:16.263' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, 6, 5, 4, 8, 7, 11, 4, 9, 6, 4, N'SPCT-AYAY8', NULL, 450000.0000, 531, 0, NULL, CAST(N'2024-01-10T13:31:30.987' AS DateTime), NULL, CAST(N'2024-01-10T13:31:30.987' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, 6, 5, 6, 6, 7, 12, 4, 7, 6, 4, N'SPCT-9B8KR', NULL, 123000.0000, 451, 0, NULL, CAST(N'2024-01-22T20:18:22.767' AS DateTime), NULL, CAST(N'2024-01-22T20:18:22.767' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (17, 6, 5, 6, 7, 7, 13, 4, 7, 4, 4, N'SPCT-8CTDX', NULL, 689000.0000, 340, 0, NULL, CAST(N'2024-01-22T20:23:47.223' AS DateTime), NULL, CAST(N'2024-01-22T20:23:47.223' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (18, 6, 3, 6, 8, 7, 13, 4, 9, 4, 4, N'SPCT-09TKS', NULL, 450000.0000, 45, 0, NULL, CAST(N'2024-01-23T17:03:36.137' AS DateTime), NULL, CAST(N'2024-01-23T17:03:36.137' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (19, 3, 3, 3, 5, 6, 13, 1, 4, 2, 4, N'SPCT-RHLRI', NULL, 799000.0000, 456, 0, NULL, CAST(N'2024-01-23T17:04:30.523' AS DateTime), NULL, CAST(N'2024-01-23T17:04:30.523' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (20, 6, 5, 4, 5, 7, 12, 3, 5, 4, 2, N'SPCT-BK7RP', NULL, 899000.0000, 679, 0, NULL, CAST(N'2024-01-23T17:04:59.063' AS DateTime), NULL, CAST(N'2024-01-23T17:04:59.063' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (21, 3, 5, 4, 5, 7, 12, 3, 5, 3, 2, N'SPCT-TJMSS', NULL, 999000.0000, 722, 0, NULL, CAST(N'2024-01-23T17:05:15.633' AS DateTime), NULL, CAST(N'2024-01-23T17:05:15.633' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (22, 6, 5, 6, 5, 7, 3, 1, 6, 6, 3, N'SPCT-FBSPE', NULL, 599000.0000, 670, 0, NULL, CAST(N'2024-01-23T17:06:04.140' AS DateTime), NULL, CAST(N'2024-01-23T17:06:04.140' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (23, 1, 2, 3, 8, 7, 4, 2, 7, 6, 4, N'SPCT-TLAEC', NULL, 599000.0000, 128, 0, NULL, CAST(N'2024-01-23T17:17:06.797' AS DateTime), NULL, CAST(N'2024-01-23T17:17:06.797' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (24, 4, 5, 3, 8, 2, 6, 2, 6, 6, 3, N'SPCT-GMY6W', NULL, 689000.0000, 321, 0, NULL, CAST(N'2024-01-23T17:17:31.473' AS DateTime), NULL, CAST(N'2024-01-23T17:17:31.473' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (25, 2, 2, 3, 8, 2, 6, 2, 6, 4, 2, N'SPCT-YQU4L', NULL, 766000.0000, 321, 0, NULL, CAST(N'2024-01-23T17:17:52.460' AS DateTime), NULL, CAST(N'2024-01-23T17:17:52.460' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [Ma], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (26, 5, 5, 3, 5, 7, 6, 2, 6, 3, 3, N'SPCT-Z7CL2', NULL, 199000.0000, 134, 0, NULL, CAST(N'2024-01-23T17:18:52.483' AS DateTime), NULL, CAST(N'2024-01-23T17:18:52.483' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[San_Pham_Chi_Tiet] OFF
SET IDENTITY_INSERT [dbo].[Size] ON 

INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-02J84TL', 36, NULL, CAST(N'2023-12-06T09:26:03.130' AS DateTime), NULL, CAST(N'2023-12-06T09:26:03.130' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-U1VM9RM', 37, NULL, CAST(N'2023-12-06T09:26:07.577' AS DateTime), NULL, CAST(N'2023-12-06T09:26:07.577' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-YU4085E', 38, NULL, CAST(N'2023-12-06T09:26:11.340' AS DateTime), NULL, CAST(N'2023-12-06T09:26:11.340' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-8ENNVSC', 39, NULL, CAST(N'2023-12-06T09:26:15.853' AS DateTime), NULL, CAST(N'2023-12-06T09:26:15.853' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-J4WEKSE', 40, NULL, CAST(N'2023-12-06T09:26:21.503' AS DateTime), NULL, CAST(N'2023-12-06T09:26:21.503' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'TT-EYM70V1', 41, NULL, CAST(N'2023-12-06T10:29:33.243' AS DateTime), NULL, CAST(N'2023-12-06T10:29:33.243' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'TT-GDMLVCN', 42, NULL, CAST(N'2023-12-11T18:52:20.237' AS DateTime), NULL, CAST(N'2023-12-11T18:52:20.237' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Size] OFF
SET IDENTITY_INSERT [dbo].[Thuong_Hieu] ON 

INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-L1H2QDN', N'Van', NULL, CAST(N'2023-12-06T09:27:42.990' AS DateTime), NULL, CAST(N'2023-12-06T09:27:42.990' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-FYVB1KR', N'Jordan', NULL, CAST(N'2023-12-06T09:27:47.867' AS DateTime), NULL, CAST(N'2023-12-06T09:27:47.867' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-LOL892H', N'Nike', NULL, CAST(N'2023-12-06T09:27:54.997' AS DateTime), NULL, CAST(N'2023-12-06T09:27:54.997' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-51YTUP7', N'Gucci', NULL, CAST(N'2023-12-06T10:31:24.977' AS DateTime), NULL, CAST(N'2023-12-06T10:31:24.977' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Thuong_Hieu] OFF
SET IDENTITY_INSERT [dbo].[Voucher] ON 

INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (16, N'VC-S1HQ1', N'Khuyến mại đầu lòng', CAST(N'2023-12-11T00:00:00.000' AS DateTime), CAST(N'2023-12-13T00:00:00.000' AS DateTime), 29, 20, 300000.0000, 200000.0000, 2, CAST(N'2023-12-11T17:43:09.493' AS DateTime), 1, CAST(N'2023-12-11T17:43:09.493' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (17, N'VC-Q5D1E', N'Black Friday', CAST(N'2023-12-11T00:00:00.000' AS DateTime), CAST(N'2023-12-14T00:00:00.000' AS DateTime), 10, 30, 100000.0000, 50000.0000, 2, CAST(N'2023-12-11T17:45:45.697' AS DateTime), 1, CAST(N'2023-12-11T17:45:45.697' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (18, N'VC-GGCZO', N'Black Saturday ', CAST(N'2023-12-11T00:00:00.000' AS DateTime), CAST(N'2023-12-13T00:00:00.000' AS DateTime), 30, 20, 100000.0000, 100000.0000, 2, CAST(N'2023-12-11T19:11:31.723' AS DateTime), 1, CAST(N'2023-12-11T19:11:31.723' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (19, N'VC-QD3XA', N'Khuyến mại đầu tháng', CAST(N'2023-12-11T00:00:00.000' AS DateTime), CAST(N'2023-12-11T00:00:00.000' AS DateTime), 10, 20, 500000.0000, 150000.0000, 2, CAST(N'2023-12-11T23:44:10.540' AS DateTime), 1, CAST(N'2023-12-11T23:44:10.540' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (20, N'VC-Z525T', N'Nhân ngày khai trương', CAST(N'2023-12-12T00:00:00.000' AS DateTime), CAST(N'2023-12-14T00:00:00.000' AS DateTime), 8, 40, 300000.0000, 200000.0000, 2, CAST(N'2023-12-11T23:46:10.933' AS DateTime), 1, CAST(N'2023-12-11T23:46:10.933' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (21, N'VC-V0OWI', N'Khuyến khích khách hàng', CAST(N'2023-12-12T00:00:00.000' AS DateTime), CAST(N'2023-12-13T00:00:00.000' AS DateTime), 10, 30, 100000.0000, 20000.0000, 2, CAST(N'2023-12-11T23:51:06.367' AS DateTime), 1, CAST(N'2023-12-11T23:51:06.367' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (22, N'VC-UJLZ0', N'Giảm giá học lại', CAST(N'2023-12-12T00:00:00.000' AS DateTime), CAST(N'2023-12-13T00:00:00.000' AS DateTime), 10, 20, 100000.0000, 1.0000, 2, CAST(N'2023-12-12T08:43:19.233' AS DateTime), 1, CAST(N'2023-12-12T08:43:19.233' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (23, N'VC-7KL8H', N'Khuyến mại kiểm thử', CAST(N'2024-01-10T00:00:00.000' AS DateTime), CAST(N'2024-01-18T00:00:00.000' AS DateTime), 32, 20, 100000.0000, 100000.0000, 2, CAST(N'2024-01-10T13:34:38.963' AS DateTime), 1, CAST(N'2024-01-10T13:34:38.963' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (24, N'VC-8IBXV', N'Khuyến mại kiểm thử', CAST(N'2024-01-22T00:00:00.000' AS DateTime), CAST(N'2024-01-31T00:00:00.000' AS DateTime), 42, 20, 300000.0000, 150000.0000, 1, CAST(N'2024-01-22T22:14:00.290' AS DateTime), 1, CAST(N'2024-01-22T22:14:00.290' AS DateTime), NULL, 0)
INSERT [dbo].[Voucher] ([ID], [Ma], [Ten], [NgayBD], [NgayKT], [SoLuong], [PhanTramGiam], [GTToiThieu], [GiamToiDa], [TrangThai], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (25, N'VC-F7TF3', N'Khuyến mãi học lại 2', CAST(N'2024-01-23T00:00:00.000' AS DateTime), CAST(N'2024-01-31T00:00:00.000' AS DateTime), 342, 30, 300000.0000, 200000.0000, 1, CAST(N'2024-01-23T15:37:46.977' AS DateTime), 1, CAST(N'2024-01-23T15:37:46.977' AS DateTime), NULL, 0)
SET IDENTITY_INSERT [dbo].[Voucher] OFF
SET IDENTITY_INSERT [dbo].[Xuat_Xu] ON 

INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TT-45C5VV8', N'Việt Nam', NULL, CAST(N'2023-12-06T09:25:35.103' AS DateTime), NULL, CAST(N'2023-12-06T09:25:35.103' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TT-E73OBAT', N'Nhật Bản', NULL, CAST(N'2023-12-06T09:25:45.560' AS DateTime), NULL, CAST(N'2023-12-06T09:25:45.560' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TT-9EKV5R9', N'Trung Quốc', NULL, CAST(N'2023-12-06T09:25:52.043' AS DateTime), NULL, CAST(N'2023-12-06T09:25:52.043' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TT-1JEWHJY', N'Hàn Quốc', NULL, CAST(N'2023-12-06T09:25:57.267' AS DateTime), NULL, CAST(N'2023-12-06T09:25:57.267' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TT-HW9T9YT', N'Lào', NULL, CAST(N'2023-12-06T10:30:30.060' AS DateTime), NULL, CAST(N'2023-12-06T10:30:30.060' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Xuat_Xu] OFF
ALTER TABLE [dbo].[Co_Giay] ADD  CONSTRAINT [DF_Co_Giay_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Co_Giay] ADD  CONSTRAINT [DF_Co_Giay_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Co_Giay] ADD  CONSTRAINT [DF_Co_Giay_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Chat_Lieu] ADD  CONSTRAINT [DF_Chat_Lieu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Chat_Lieu] ADD  CONSTRAINT [DF_Chat_Lieu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Chat_Lieu] ADD  CONSTRAINT [DF_Chat_Lieu_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Chuc_Vu] ADD  CONSTRAINT [DF_Chuc_Vu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Chuc_Vu] ADD  CONSTRAINT [DF_Chuc_Vu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Chuc_Vu] ADD  CONSTRAINT [DF_Chuc_Vu_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Danh_Muc] ADD  CONSTRAINT [DF_Danh_Muc_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Danh_Muc] ADD  CONSTRAINT [DF_Danh_Muc_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Danh_Muc] ADD  CONSTRAINT [DF_Danh_Muc_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[De_Giay] ADD  CONSTRAINT [DF_De_Giay_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[De_Giay] ADD  CONSTRAINT [DF_De_Giay_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[De_Giay] ADD  CONSTRAINT [DF_De_Giay_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Hinh_Anh] ADD  CONSTRAINT [DF_Hinh_Anh_Cover]  DEFAULT ((0)) FOR [Cover]
GO
ALTER TABLE [dbo].[Hinh_Anh] ADD  CONSTRAINT [DF_Hinh_Anh_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hinh_Anh] ADD  CONSTRAINT [DF_Hinh_Anh_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hinh_Anh] ADD  CONSTRAINT [DF_Hinh_Anh_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT] ADD  CONSTRAINT [DF_HinhThucTT_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT] ADD  CONSTRAINT [DF_HinhThucTT_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT] ADD  CONSTRAINT [DF_Hinh_Thuc_TT_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Hoa_Don] ADD  CONSTRAINT [DF_Hoa_Don_NgayThanhToan]  DEFAULT (getdate()) FOR [NgayThanhToan]
GO
ALTER TABLE [dbo].[Hoa_Don] ADD  CONSTRAINT [DF_Hoa_Don_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hoa_Don] ADD  CONSTRAINT [DF_Hoa_Don_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hoa_Don] ADD  CONSTRAINT [DF_Hoa_Don_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet] ADD  CONSTRAINT [DF_Hoa_Don_Chi_Tiet_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet] ADD  CONSTRAINT [DF_Hoa_Don_Chi_Tiet_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet] ADD  CONSTRAINT [DF_Hoa_Don_Chi_Tiet_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Khach_Hang] ADD  CONSTRAINT [DF_Khach_Hang_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Khach_Hang] ADD  CONSTRAINT [DF_Khach_Hang_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Khach_Hang] ADD  CONSTRAINT [DF_Khach_Hang_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Khuyen_Mai] ADD  CONSTRAINT [DF_Khuyen_Mai_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Khuyen_Mai] ADD  CONSTRAINT [DF_Khuyen_Mai_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Khuyen_Mai] ADD  CONSTRAINT [DF_Khuyen_Mai_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet] ADD  CONSTRAINT [DF_Khuyen_Mai_Chi_Tiet_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet] ADD  CONSTRAINT [DF_Khuyen_Mai_Chi_Tiet_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet] ADD  CONSTRAINT [DF_Khuyen_Mai_Chi_Tiet_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Lich_Su_Hoa_Don] ADD  CONSTRAINT [DF_Lich_Su_Hoa_Don_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Lich_Su_Hoa_Don] ADD  CONSTRAINT [DF_Lich_Su_Hoa_Don_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Lich_Su_Hoa_Don] ADD  CONSTRAINT [DF_Lich_Su_Hoa_Don_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Mau_Sac] ADD  CONSTRAINT [DF_Mau_Sac_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Mau_Sac] ADD  CONSTRAINT [DF_Mau_Sac_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Mau_Sac] ADD  CONSTRAINT [DF_Mau_Sac_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Nha_San_Xuat] ADD  CONSTRAINT [DF_Nha_San_Xuat_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Nha_San_Xuat] ADD  CONSTRAINT [DF_Nha_San_Xuat_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Nha_San_Xuat] ADD  CONSTRAINT [DF_Nha_San_Xuat_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Nhan_Vien] ADD  CONSTRAINT [DF_Nhan_Vien_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Nhan_Vien] ADD  CONSTRAINT [DF_Nhan_Vien_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Nhan_Vien] ADD  CONSTRAINT [DF_Nhan_Vien_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[San_Pham] ADD  CONSTRAINT [DF_San_Pham_NgayTao_1]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[San_Pham] ADD  CONSTRAINT [DF_San_Pham_NgayCapNhat_1]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[San_Pham] ADD  CONSTRAINT [DF_San_Pham_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] ADD  CONSTRAINT [DF_San_Pham_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] ADD  CONSTRAINT [DF_San_Pham_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] ADD  CONSTRAINT [DF_San_Pham_Chi_Tiet_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Size] ADD  CONSTRAINT [DF_Size_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Size] ADD  CONSTRAINT [DF_Size_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Size] ADD  CONSTRAINT [DF_Size_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Thanh_Toan] ADD  CONSTRAINT [DF_Thanh_Toan_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Thanh_Toan] ADD  CONSTRAINT [DF_Thanh_Toan_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Thanh_Toan] ADD  CONSTRAINT [DF_Thanh_Toan_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Thuong_Hieu] ADD  CONSTRAINT [DF_Thuong_Hieu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Thuong_Hieu] ADD  CONSTRAINT [DF_Thuong_Hieu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Thuong_Hieu] ADD  CONSTRAINT [DF_Thuong_Hieu_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Voucher] ADD  CONSTRAINT [DF_Voucher_NgayBD]  DEFAULT (getdate()) FOR [NgayBD]
GO
ALTER TABLE [dbo].[Voucher] ADD  CONSTRAINT [DF_Voucher_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Voucher] ADD  CONSTRAINT [DF_Voucher_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Voucher] ADD  CONSTRAINT [DF_Voucher_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Xuat_Xu] ADD  CONSTRAINT [DF_Xuat_Xu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Xuat_Xu] ADD  CONSTRAINT [DF_Xuat_Xu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Xuat_Xu] ADD  CONSTRAINT [DF_Xuat_Xu_Deleted]  DEFAULT ((0)) FOR [Deleted]
GO
ALTER TABLE [dbo].[Hinh_Anh]  WITH CHECK ADD  CONSTRAINT [FK_Hinh_Anh_San_Pham_Chi_Tiet] FOREIGN KEY([IDSanPhamCT])
REFERENCES [dbo].[San_Pham_Chi_Tiet] ([ID])
GO
ALTER TABLE [dbo].[Hinh_Anh] CHECK CONSTRAINT [FK_Hinh_Anh_San_Pham_Chi_Tiet]
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT]  WITH CHECK ADD  CONSTRAINT [FK_Hinh_Thuc_TT_Hoa_Don] FOREIGN KEY([IDHoaDon])
REFERENCES [dbo].[Hoa_Don] ([ID])
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT] CHECK CONSTRAINT [FK_Hinh_Thuc_TT_Hoa_Don]
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT]  WITH CHECK ADD  CONSTRAINT [FK_Hinh_Thuc_TT_Thanh_Toan] FOREIGN KEY([IDThanhToan])
REFERENCES [dbo].[Thanh_Toan] ([ID])
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT] CHECK CONSTRAINT [FK_Hinh_Thuc_TT_Thanh_Toan]
GO
ALTER TABLE [dbo].[Hoa_Don]  WITH CHECK ADD  CONSTRAINT [FK_Hoa_Don_Khach_Hang] FOREIGN KEY([IDKhachHang])
REFERENCES [dbo].[Khach_Hang] ([ID])
GO
ALTER TABLE [dbo].[Hoa_Don] CHECK CONSTRAINT [FK_Hoa_Don_Khach_Hang]
GO
ALTER TABLE [dbo].[Hoa_Don]  WITH CHECK ADD  CONSTRAINT [FK_Hoa_Don_Nhan_Vien] FOREIGN KEY([IDNhanVien])
REFERENCES [dbo].[Nhan_Vien] ([ID])
GO
ALTER TABLE [dbo].[Hoa_Don] CHECK CONSTRAINT [FK_Hoa_Don_Nhan_Vien]
GO
ALTER TABLE [dbo].[Hoa_Don]  WITH CHECK ADD  CONSTRAINT [FK_Hoa_Don_Voucher] FOREIGN KEY([IDVoucher])
REFERENCES [dbo].[Voucher] ([ID])
GO
ALTER TABLE [dbo].[Hoa_Don] CHECK CONSTRAINT [FK_Hoa_Don_Voucher]
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_Hoa_Don_Chi_Tiet_Hoa_Don] FOREIGN KEY([IDHoaDon])
REFERENCES [dbo].[Hoa_Don] ([ID])
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet] CHECK CONSTRAINT [FK_Hoa_Don_Chi_Tiet_Hoa_Don]
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_Hoa_Don_Chi_Tiet_San_Pham_Chi_Tiet] FOREIGN KEY([IDSanPhamCT])
REFERENCES [dbo].[San_Pham_Chi_Tiet] ([ID])
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet] CHECK CONSTRAINT [FK_Hoa_Don_Chi_Tiet_San_Pham_Chi_Tiet]
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_Khuyen_Mai_Chi_Tiet_Khuyen_Mai] FOREIGN KEY([IDKhuyenMai])
REFERENCES [dbo].[Khuyen_Mai] ([ID])
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet] CHECK CONSTRAINT [FK_Khuyen_Mai_Chi_Tiet_Khuyen_Mai]
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_Khuyen_Mai_Chi_Tiet_San_Pham_Chi_Tiet] FOREIGN KEY([IDSanPhamCT])
REFERENCES [dbo].[San_Pham_Chi_Tiet] ([ID])
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet] CHECK CONSTRAINT [FK_Khuyen_Mai_Chi_Tiet_San_Pham_Chi_Tiet]
GO
ALTER TABLE [dbo].[Lich_Su_Hoa_Don]  WITH CHECK ADD  CONSTRAINT [FK_Lich_Su_Hoa_Don_Hoa_Don] FOREIGN KEY([IDHoaDon])
REFERENCES [dbo].[Hoa_Don] ([ID])
GO
ALTER TABLE [dbo].[Lich_Su_Hoa_Don] CHECK CONSTRAINT [FK_Lich_Su_Hoa_Don_Hoa_Don]
GO
ALTER TABLE [dbo].[Nhan_Vien]  WITH CHECK ADD  CONSTRAINT [FK_Nhan_Vien_Chuc_Vu] FOREIGN KEY([IDChucVu])
REFERENCES [dbo].[Chuc_Vu] ([id])
GO
ALTER TABLE [dbo].[Nhan_Vien] CHECK CONSTRAINT [FK_Nhan_Vien_Chuc_Vu]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Co_Giay] FOREIGN KEY([IDCoGiay])
REFERENCES [dbo].[Co_Giay] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Co_Giay]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Chat_Lieu] FOREIGN KEY([IDChatLieu])
REFERENCES [dbo].[Chat_Lieu] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Chat_Lieu]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Danh_Muc] FOREIGN KEY([IDDanhMuc])
REFERENCES [dbo].[Danh_Muc] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Danh_Muc]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_De_Giay] FOREIGN KEY([IDDeGiay])
REFERENCES [dbo].[De_Giay] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_De_Giay]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Mau_Sac] FOREIGN KEY([IDMauSac])
REFERENCES [dbo].[Mau_Sac] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Mau_Sac]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Nha_San_Xuat] FOREIGN KEY([IDNSX])
REFERENCES [dbo].[Nha_San_Xuat] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Nha_San_Xuat]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_San_Pham] FOREIGN KEY([IDSanPham])
REFERENCES [dbo].[San_Pham] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_San_Pham]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Size] FOREIGN KEY([IDSize])
REFERENCES [dbo].[Size] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Size]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Thuong_Hieu] FOREIGN KEY([IDThuongHieu])
REFERENCES [dbo].[Thuong_Hieu] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Thuong_Hieu]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Xuat_Xu] FOREIGN KEY([IDXuatXu])
REFERENCES [dbo].[Xuat_Xu] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Xuat_Xu]
GO
/****** Object:  StoredProcedure [dbo].[get_1SPCT_ByMa]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[get_1SPCT_ByMa] 
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
/****** Object:  StoredProcedure [dbo].[get_All_SP]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[get_All_SP]
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
/****** Object:  StoredProcedure [dbo].[get_ALL_SPCT]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[get_ALL_SPCT]  
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
GO
/****** Object:  StoredProcedure [dbo].[Get_HD_By_MaHD]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Get_HD_By_MaHD]
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
/****** Object:  StoredProcedure [dbo].[get_SP_Deleted]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[get_SP_Deleted] 
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
/****** Object:  StoredProcedure [dbo].[get_SPCT_ByTen]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[get_SPCT_ByTen]     
 @Ten NVARCHAR(MAX)    
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
       WHERE San_Pham.Ten LIKE @Ten'    
    EXEC sp_executesql @sql, N'@Ten NVARCHAR(MAX)', @Ten    
END 
GO
/****** Object:  StoredProcedure [dbo].[get_SPCT_Deleted]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[get_SPCT_Deleted] 
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
/****** Object:  StoredProcedure [dbo].[getID_kh_by_ma]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[getID_kh_by_ma]   
 @MaKH VARCHAR(10)  
AS  
BEGIN  
    DECLARE @sql NVARCHAR(MAX)  
    SET @sql = 'select id from khach_hang where maKH = @maKH'
    EXEC sp_executesql @sql, N'@MaKH VARCHAR(10)', @maKH  
END  
GO
/****** Object:  StoredProcedure [dbo].[getIDByMa]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getIDByMa] 
	@tenBang NVARCHAR(50),
	@ma NVARCHAR(50)
AS
BEGIN
    DECLARE @sql NVARCHAR(MAX)
    SET @sql = N'SELECT ID, Ma, Ten FROM ' + QUOTENAME(@tenBang) + ' WHERE ma = @ma'
    EXEC sp_executesql @sql, N'@ma NVARCHAR(50)', @ma
END
GO
/****** Object:  StoredProcedure [dbo].[getIDByTen]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getIDByTen] 
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
/****** Object:  StoredProcedure [dbo].[getIDSP_ByMa]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getIDSP_ByMa] 
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
/****** Object:  StoredProcedure [dbo].[getIDSP_ByTen]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getIDSP_ByTen] 
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
/****** Object:  StoredProcedure [dbo].[getIDSPCT_ById]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getIDSPCT_ById] 
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
/****** Object:  StoredProcedure [dbo].[getSPCT_ByTen]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getSPCT_ByTen] 
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
/****** Object:  StoredProcedure [dbo].[getThuocTinh]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[getThuocTinh] @tenBang NVARCHAR(50)
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
/****** Object:  StoredProcedure [dbo].[Giam_SL_GioHang]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Giam_SL_GioHang]
    @soLuong INT,
	@IDSPCT INT,
	@MaSPCT VARCHAR(10),
	@IDHD INT
AS
BEGIN
    BEGIN TRANSACTION;
    BEGIN TRY
		-- giảm số lượng sản phẩm chi tiết trong giỏ hàng
		UPDATE Hoa_Don_Chi_Tiet SET SoLuong = SoLuong - @soLuong WHERE IDSanPhamCT = @IDSPCT

		-- tính lại thành tiên
		UPDATE Hoa_Don_Chi_Tiet SET ThanhTien = SoLuong * Gia WHERE IDSanPhamCT = @IDSPCT

		-- Tính tổng tiền và cập nhật vào hóa đơn
        UPDATE Hoa_Don
        SET TongTien = (
                SELECT SUM(ThanhTien) AS TongTien
                FROM Hoa_Don_Chi_Tiet
                WHERE IDHoaDon = @IDHD
            )
        WHERE ID = @IDHD;

		-- tăng số lượng sản phẩm chi tiết trong bảng San_Pham_Chi_Tiet
		UPDATE San_Pham_Chi_Tiet SET SoLuongTon = SoLuongTon + @soLuong WHERE Ma = @MaSPCT
        COMMIT;
    END TRY
    BEGIN CATCH
        ROLLBACK;
    END CATCH;
END;
GO
/****** Object:  StoredProcedure [dbo].[Loc_SP_ByTen]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[Loc_SP_ByTen] 
	@Ten NVARCHAR(MAX),
	@page INT,
	@limit INT
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
				WHERE San_Pham.Ten LIKE @Ten
				GROUP BY
					San_Pham.id,
					San_Pham.Ma,
					San_Pham.Ten,
					San_Pham.MoTa
				ORDER BY id DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY

				UPDATE San_Pham
				SET TrangThai = IIF(COALESCE((SELECT SUM(SoLuongTon) FROM San_Pham_Chi_Tiet WHERE IDSanPham = San_Pham.id), 0) > 0, 1, 0)'
    EXEC sp_executesql @sql, N'@Ten NVARCHAR(MAX), @page INT, @limit INT', @Ten, @page, @limit
END
GO
/****** Object:  StoredProcedure [dbo].[Loc_SPCT]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[Loc_SPCT]     
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
    San_Pham_Chi_Tiet.Ma, San_Pham.Ten, Danh_Muc.Ten, Thuong_Hieu.Ten, Xuat_Xu.Ten, Nha_San_Xuat.Ten, Chat_Lieu.Ten, De_Giay.Ten, Co_Giay.Ten,    
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
GO
/****** Object:  StoredProcedure [dbo].[pagging_SPCT_By_Ma]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[pagging_SPCT_By_Ma] 
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
/****** Object:  StoredProcedure [dbo].[Paging_SP]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[Paging_SP] 
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
/****** Object:  StoredProcedure [dbo].[Tao_Hoa_Don]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Tao_Hoa_Don]
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
/****** Object:  StoredProcedure [dbo].[ThanhToanHD]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[ThanhToanHD] @MaHD VARCHAR(10)  
AS  
BEGIN  
    UPDATE Hoa_Don SET TrangThai = 0 WHERE MaHD = @MaHD  
	UPDATE Hoa_Don SET NgayThanhToan = getdate() WHERE MaHD = @MaHD  
  
 INSERT INTO [dbo].[Lich_Su_Hoa_Don] ([IDHoaDon],[ThoiGian],[HanhDong],[TrangThai],[NguoiTao],[NgayTao],[NguoiCapNhat],[NgayCapNhat],[Deleted])  SELECT   [ID],   GETDATE() AS [ThoiGian], 1 AS [HanhDong],
[TrangThai],   [NguoiTao],   [NgayTao],   [NguoiCapNhat],   GETDATE() AS  [NgayCapNhat],   [Deleted]  FROM   [dbo].[hoa_don]  WHERE   [MaHD] = @MaHD  
END  
GO
/****** Object:  StoredProcedure [dbo].[Them_HDCT]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Them_HDCT]
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
/****** Object:  StoredProcedure [dbo].[them_SPCT]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[them_SPCT]
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
/****** Object:  StoredProcedure [dbo].[Them_Voucher]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Them_Voucher]
    @ma VARCHAR(10),
    @ten NVARCHAR(MAX),
    @ngayBD DATETIME,
    @ngayKT DATETIME,
    @soLuong INT,
    @giaTriMin MONEY,
    @phanTramGiam INT,
    @giamToiDa MONEY,
    @nguoiTao INT
AS
BEGIN
    DECLARE @TrangThai INT
    SET @TrangThai = CASE 
        WHEN GETDATE() < @ngayBD THEN 0
        WHEN GETDATE() BETWEEN @ngayBD AND @ngayKT THEN 1
        WHEN GETDATE() > @ngayKT THEN 2
        ELSE 0
    END

    INSERT INTO Voucher (Ma, Ten, NgayBD, NgayKT, SoLuong, GTToiThieu, PhanTramGiam, GiamToiDa, NguoiTao, TrangThai)
    VALUES (@ma, @ten, @ngayBD, @ngayKT, @soLuong, @giaTriMin, @phanTramGiam, @giamToiDa, @nguoiTao, @TrangThai)
END
GO
/****** Object:  StoredProcedure [dbo].[themThuocTinh]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[themThuocTinh] 
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
/****** Object:  StoredProcedure [dbo].[update_SPCT]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[update_SPCT]
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
/****** Object:  StoredProcedure [dbo].[updateThuocTinh]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[updateThuocTinh]
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
/****** Object:  StoredProcedure [dbo].[Xoa_SPCT_Khoi_GioHang]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[Xoa_SPCT_Khoi_GioHang]
    @soLuong INT,
	@IDSPCT INT,
	@MaSPCT VARCHAR(10),
	@IDHD INT
AS
BEGIN
    BEGIN TRANSACTION;
    BEGIN TRY
		-- tính lại thành tiên
		UPDATE Hoa_Don_Chi_Tiet SET ThanhTien = 0 WHERE IDSanPhamCT = @IDSPCT

		-- xóa bỏ khỏi giỏ hàng
		DELETE FROM Hoa_Don_Chi_Tiet WHERE IDSanPhamCT = @IDSPCT

		-- tăng số lượng sản phẩm chi tiết trong bảng San_Pham_Chi_Tiet
		UPDATE San_Pham_Chi_Tiet SET SoLuongTon = SoLuongTon + @soLuong WHERE Ma = @MaSPCT

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
    END CATCH;
END;
GO
/****** Object:  StoredProcedure [dbo].[xoaThuocTinh]    Script Date: 23-Jan-2024 5:30:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[xoaThuocTinh] 
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
USE [master]
GO
ALTER DATABASE [N5_PolyShoes] SET  READ_WRITE 
GO
