USE [master]
GO
/****** Object:  Database [N5_PolyShoes]    Script Date: 14-Nov-23 11:12:14 PM ******/
CREATE DATABASE [N5_PolyShoes]
GO
USE [N5_PolyShoes]
GO
/****** Object:  Table [dbo].[Co_Giay]    Script Date: 14-Nov-23 11:12:14 PM ******/
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
/****** Object:  Table [dbo].[Chat_Lieu]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Chuc_Vu]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Danh_Muc]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[De_Giay]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Hinh_Anh]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Hinh_Thuc_TT]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Hoa_Don]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
 CONSTRAINT [PK_Hoa_Don] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hoa_Don_Chi_Tiet]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Khach_Hang]    Script Date: 14-Nov-23 11:12:15 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khach_Hang](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [varchar](10) NULL,
	[HoTen] [nvarchar](50) NULL,
	[SDT] [varchar](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
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
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khuyen_Mai]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Khuyen_Mai_Chi_Tiet]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Lich_Su_Hoa_Don]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Mau_Sac]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Nha_San_Xuat]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Nhan_Vien]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[San_Pham]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[San_Pham_Chi_Tiet]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Size]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Thanh_Toan]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Thuong_Hieu]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
/****** Object:  Table [dbo].[Xuat_Xu]    Script Date: 14-Nov-23 11:12:15 PM ******/
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
USE [master]
GO
ALTER DATABASE [N5_PolyShoes] SET  READ_WRITE 
GO
