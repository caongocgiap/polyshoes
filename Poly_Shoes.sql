USE [master]
GO
/****** Object:  Database [N5_PolyShoes]    Script Date: 26-Nov-23 6:29:45 PM ******/
CREATE DATABASE [N5_PolyShoes]
GO
USE [N5_PolyShoes]
GO
/****** Object:  Table [dbo].[Co_Giay]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Chat_Lieu]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Chuc_Vu]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Danh_Muc]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[De_Giay]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[DiaChi]    Script Date: 26-Nov-23 6:29:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DiaChi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDKhachHang] [int] NULL,
	[Tinh] [nvarchar](100) NULL,
	[Quan] [nvarchar](100) NULL,
	[Xa] [nvarchar](100) NULL,
	[Deleted] [bit] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Hinh_Anh]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Hinh_Thuc_TT]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Hoa_Don]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Hoa_Don_Chi_Tiet]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Khach_Hang]    Script Date: 26-Nov-23 6:29:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khach_Hang](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [varchar](10) NULL,
	[HoTen] [nvarchar](50) NULL,
	[SDT] [varchar](10) NULL,
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
/****** Object:  Table [dbo].[Khuyen_Mai]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Khuyen_Mai_Chi_Tiet]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Lich_Su_Hoa_Don]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Mau_Sac]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Nha_San_Xuat]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Nhan_Vien]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[San_Pham]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[San_Pham_Chi_Tiet]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Size]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Thanh_Toan]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Thuong_Hieu]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  Table [dbo].[Xuat_Xu]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
ALTER TABLE [dbo].[DiaChi] ADD  CONSTRAINT [DF_DiaChi_Deleted]  DEFAULT ((0)) FOR [Deleted]
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
ALTER TABLE [dbo].[DiaChi]  WITH CHECK ADD  CONSTRAINT [FK_DiaChi_Khach_Hang] FOREIGN KEY([IDKhachHang])
REFERENCES [dbo].[Khach_Hang] ([ID])
GO
ALTER TABLE [dbo].[DiaChi] CHECK CONSTRAINT [FK_DiaChi_Khach_Hang]
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
/****** Object:  StoredProcedure [dbo].[get_1SPCT_ByMa]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[get_All_SP]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[get_ALL_SPCT]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
		ORDER BY San_Pham_Chi_Tiet.ID DESC OFFSET @page ROWS FETCH NEXT @limit ROWS ONLY'
    EXEC sp_executesql @sql, N'@page INT, @limit INT', @page, @limit
END
GO
/****** Object:  StoredProcedure [dbo].[get_SP_Deleted]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[get_SPCT_Deleted]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[getIDByMa]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[getIDByTen]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[getIDSP_ByMa]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[getIDSP_ByTen]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[getIDSPCT_ById]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[getSPCT_ByTen]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[getThuocTinh]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[pagging_SPCT_By_Ma]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[Paging_SP]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[them_SPCT]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[themThuocTinh]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[update_SPCT]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[updateThuocTinh]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
/****** Object:  StoredProcedure [dbo].[xoaThuocTinh]    Script Date: 26-Nov-23 6:29:45 PM ******/
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
