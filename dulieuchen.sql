USE [N5_PolyShoes]
GO
/****** Object:  Table [dbo].[Chat_Lieu]    Script Date: 11/24/2023 10:30:43 PM ******/
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
/****** Object:  Table [dbo].[Chuc_Vu]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Co_Giay]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Danh_Muc]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[De_Giay]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Hinh_Anh]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Hinh_Thuc_TT]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Hoa_Don]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Hoa_Don_Chi_Tiet]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Khach_Hang]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Khuyen_Mai]    Script Date: 11/24/2023 10:30:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khuyen_Mai](
	[ID] [int] IDENTITY(1,1) NOT NULL,
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
/****** Object:  Table [dbo].[Khuyen_Mai_Chi_Tiet]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Lich_Su_Hoa_Don]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Mau_Sac]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Nha_San_Xuat]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Nhan_Vien]    Script Date: 11/24/2023 10:30:44 PM ******/
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
	[SDT] [varchar](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[GioiTinh] [bit] NULL,
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
/****** Object:  Table [dbo].[San_Pham]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[San_Pham_Chi_Tiet]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Size]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Thanh_Toan]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Thuong_Hieu]    Script Date: 11/24/2023 10:30:44 PM ******/
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
/****** Object:  Table [dbo].[Xuat_Xu]    Script Date: 11/24/2023 10:30:44 PM ******/
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
SET IDENTITY_INSERT [dbo].[Chat_Lieu] ON 

INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'CL001', N'Metal', 1, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 1, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'CL002', N'Plastic', 2, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 2, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'CL003', N'Wood', 3, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 3, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'CL004', N'Glass', 4, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 4, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'CL005', N'Paper', 5, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 5, CAST(N'2023-11-16T16:59:16.003' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'CL001', N'Metal', 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'CL002', N'Plastic', 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'CL003', N'Wood', 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'CL004', N'Glass', 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Chat_Lieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'CL005', N'Paper', 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Chat_Lieu] OFF
GO
SET IDENTITY_INSERT [dbo].[Chuc_Vu] ON 

INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (1, N'CV001', N'Manager', CAST(N'2023-11-16T16:59:56.960' AS DateTime), 1, CAST(N'2023-11-16T16:59:56.960' AS DateTime), 1, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (2, N'CV002', N'Supervisor', CAST(N'2023-11-16T16:59:56.960' AS DateTime), 2, CAST(N'2023-11-16T16:59:56.960' AS DateTime), 2, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (3, N'CV003', N'Engineer', CAST(N'2023-11-16T16:59:56.960' AS DateTime), 3, CAST(N'2023-11-16T16:59:56.960' AS DateTime), 3, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (4, N'CV004', N'Technician', CAST(N'2023-11-16T16:59:56.960' AS DateTime), 4, CAST(N'2023-11-16T16:59:56.960' AS DateTime), 4, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (5, N'CV005', N'Analyst', CAST(N'2023-11-16T16:59:56.960' AS DateTime), 5, CAST(N'2023-11-16T16:59:56.960' AS DateTime), 5, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (6, N'CV001', N'Manager', CAST(N'2023-11-16T17:23:19.173' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 1, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (7, N'CV002', N'Supervisor', CAST(N'2023-11-16T17:23:19.173' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 2, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (8, N'CV003', N'Engineer', CAST(N'2023-11-16T17:23:19.173' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 3, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (9, N'CV004', N'Technician', CAST(N'2023-11-16T17:23:19.173' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 4, 0)
INSERT [dbo].[Chuc_Vu] ([id], [Ma], [Ten], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (10, N'CV005', N'Analyst', CAST(N'2023-11-16T17:23:19.173' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 5, 0)
SET IDENTITY_INSERT [dbo].[Chuc_Vu] OFF
GO
SET IDENTITY_INSERT [dbo].[Co_Giay] ON 

INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'ABC123', N'Giay A', 1, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 1, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'DEF456', N'Giay B', 2, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 2, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'GHI789', N'Giay C', 3, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 3, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'JKL012', N'Giay D', 4, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 4, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'MNO345', N'Giay E', 5, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 5, CAST(N'2023-11-16T16:58:25.847' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'ABC123', N'Giay A', 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'DEF456', N'Giay B', 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'GHI789', N'Giay C', 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'JKL012', N'Giay D', 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Co_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'MNO345', N'Giay E', 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Co_Giay] OFF
GO
SET IDENTITY_INSERT [dbo].[Danh_Muc] ON 

INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'DM001', N'Category A', 1, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 1, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'DM002', N'Category B', 2, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 2, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'DM003', N'Category C', 3, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 3, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'DM004', N'Category D', 4, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 4, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'DM005', N'Category E', 5, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 5, CAST(N'2023-11-16T17:00:54.967' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'DM001', N'Category A', 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'DM002', N'Category B', 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'DM003', N'Category C', 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'DM004', N'Category D', 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[Danh_Muc] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'DM005', N'Category E', 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Danh_Muc] OFF
GO
SET IDENTITY_INSERT [dbo].[De_Giay] ON 

INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'DG001', N'Paper Size A', 1, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 1, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'DG002', N'Paper Size B', 2, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 2, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'DG003', N'Paper Size C', 3, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 3, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'DG004', N'Paper Size D', 4, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 4, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'DG005', N'Paper Size E', 5, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 5, CAST(N'2023-11-16T17:01:39.983' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'DG001', N'Paper Size A', 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'DG002', N'Paper Size B', 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'DG003', N'Paper Size C', 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'DG004', N'Paper Size D', 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
INSERT [dbo].[De_Giay] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'DG005', N'Paper Size E', 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.173' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[De_Giay] OFF
GO
SET IDENTITY_INSERT [dbo].[Hinh_Anh] ON 

INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, 1, N'https://example.com/image1.jpg', 1, 1, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 1, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, 1, N'https://example.com/image2.jpg', 0, 2, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 2, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, 2, N'https://example.com/image3.jpg', 1, 3, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 3, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, 2, N'https://example.com/image4.jpg', 0, 4, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 4, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, 3, N'https://example.com/image5.jpg', 1, 5, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 5, CAST(N'2023-11-16T17:02:21.630' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, 1, N'https://example.com/image1.jpg', 1, 1, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 1, N'https://example.com/image2.jpg', 0, 2, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, 2, N'https://example.com/image3.jpg', 1, 3, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 2, N'https://example.com/image4.jpg', 0, 4, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Hinh_Anh] ([ID], [IDSanPhamCT], [URL], [Cover], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, 3, N'https://example.com/image5.jpg', 1, 5, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Hinh_Anh] OFF
GO
SET IDENTITY_INSERT [dbo].[Hinh_Thuc_TT] ON 

INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, 2, 2, N'TT01', NULL, NULL, NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, 3, 2, N'TT02', NULL, NULL, NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, 4, 3, N'TT03', NULL, NULL, NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (17, 5, 2, N'TT04', NULL, NULL, NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (18, 6, 3, N'TT05', NULL, NULL, NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (19, 7, 2, N'TT06', NULL, NULL, NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (20, 8, 3, N'TT07', NULL, NULL, NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL, CAST(N'2023-11-13T09:10:51.110' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (25, 13, 2, N'TT08', NULL, NULL, NULL, CAST(N'2023-11-18T22:33:13.350' AS DateTime), NULL, CAST(N'2023-11-18T22:33:13.350' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (26, 14, 3, N'TT09', NULL, NULL, NULL, CAST(N'2023-11-18T22:33:13.350' AS DateTime), NULL, CAST(N'2023-11-18T22:33:13.350' AS DateTime), NULL)
INSERT [dbo].[Hinh_Thuc_TT] ([ID], [IDHoaDon], [IDThanhToan], [MaThanhToan], [GiaTriThanhToan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (27, 15, 2, N'TT10', NULL, NULL, NULL, CAST(N'2023-11-18T22:33:13.350' AS DateTime), NULL, CAST(N'2023-11-18T22:33:13.350' AS DateTime), NULL)
SET IDENTITY_INSERT [dbo].[Hinh_Thuc_TT] OFF
GO
SET IDENTITY_INSERT [dbo].[Hoa_Don] ON 

INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, 4, NULL, N'HD01', N'Kiều Trọng Trí', N'0848972981', N'Hà Nội', CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, 10000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 0)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, 5, NULL, N'HD02', N'Kiều Trọng Trí', N'0847417562', N'Hà Nội', CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, 20000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 0)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, 4, NULL, N'HD03', N'Đỗ Khánh Hoàn', N'0840187413', N'Hà Nội', CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, 40000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 0)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, 5, NULL, N'HD04', N'Mục Duy An', N'0843575330', N'Hà Nội', CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, 60000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 0)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, 4, NULL, N'HD05', N'Hạ Thành Danh', N'0841579349', N'Hà Nội', CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, 50000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-11T17:38:33.623' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 1)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 5, NULL, N'HD06', N'Nguyễn Văn Quân', N'0841066367', N'Hà Nội', CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, 10000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 1)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, 4, NULL, N'HD07', N'Hi Ngọc Ðoàn', N'0842381567', N'Hà Nội', CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, 20000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 1)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 5, NULL, N'HD08', N'Duy Hữu Minh', N'0843335922', N'Hà Nội', CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, 40000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 0)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, 4, NULL, N'HD09', N'Đèo Anh Việt', N'0847836787', N'Hà Nội', CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, 60000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 1)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, 5, NULL, N'HD010', N'Bành Ðức Toản', N'0843557010', N'Hà Nội', CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, 50000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-13T05:00:49.330' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 0)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, 4, NULL, N'HD011', N'Nguyễn Thị Hồng ', N'0842476264', N'Hà Nội', CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, 10000.0000, NULL, NULL, 2, NULL, CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 1)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, 5, NULL, N'HD012', N'Trần Văn Anh', N'0843815184', N'Hà Nội', CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, 20000.0000, NULL, NULL, 0, NULL, CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 0)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, 4, NULL, N'HD013', N'Lê Thị Mai', N'0842479729', N'Hà Nội', CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, 40000.0000, NULL, NULL, 2, NULL, CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 1)
INSERT [dbo].[Hoa_Don] ([ID], [IDNhanVien], [IDKhachHang], [MaHD], [TenNguoiNhan], [SDT], [DiaChi], [NgayThanhToan], [PhiShip], [TongTien], [NgayShip], [NgayNhan], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, 5, NULL, N'HD014', N'Phạm văn Đức', N'0844357512', N'Hà Nội', CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, 60000.0000, NULL, NULL, 2, NULL, CAST(N'2023-11-13T05:02:21.797' AS DateTime), NULL, CAST(N'2023-11-21T02:27:23.930' AS DateTime), 1)
SET IDENTITY_INSERT [dbo].[Hoa_Don] OFF
GO
SET IDENTITY_INSERT [dbo].[Hoa_Don_Chi_Tiet] ON 

INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, 3, 7, 10000.0000, 3, 30000.0000, 1, NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, 1, 5, 40000.0000, 1, 40000.0000, 1, NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, 2, 6, 50000.0000, 4, 200000.0000, 1, NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, 2, 5, 70000.0000, 2, 140000.0000, 1, NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), NULL, CAST(N'2023-11-13T09:18:04.103' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 4, 8, 20000.0000, 2, 40000.0000, 1, NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, 7, 9, 30000.0000, 1, 30000.0000, 1, NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 8, 10, 40000.0000, 5, 200000.0000, 1, NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, 9, 11, 60000.0000, 4, 180000.0000, 1, NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, 10, 12, 80000.0000, 6, 360000.0000, 1, NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), NULL, CAST(N'2023-11-18T07:23:42.820' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, 11, 15, 80000.0000, 6, 480000.0000, 1, NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, 12, 13, 100000.0000, 6, 600000.0000, 1, NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, 14, 14, 70000.0000, 6, 420000.0000, 1, NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, 14, 12, 80000.0000, 9, 720000.0000, 1, NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, 15, 8, 80000.0000, 6, 360000.0000, 1, NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), NULL, CAST(N'2023-11-18T07:28:14.340' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (17, 15, 2, 83100.0000, 5, 415500.0000, 1, NULL, CAST(N'2023-11-18T08:57:14.413' AS DateTime), NULL, CAST(N'2023-11-18T08:57:14.413' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (18, 13, 3, 23100.0000, 7, 161700.0000, 1, NULL, CAST(N'2023-11-18T08:57:14.413' AS DateTime), NULL, CAST(N'2023-11-18T08:57:14.413' AS DateTime), 0)
INSERT [dbo].[Hoa_Don_Chi_Tiet] ([ID], [IDSanPhamCT], [IDHoaDon], [Gia], [SoLuong], [ThanhTien], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (19, 2, 4, 63100.0000, 5, 315500.0000, 1, NULL, CAST(N'2023-11-18T08:57:14.413' AS DateTime), NULL, CAST(N'2023-11-18T08:57:14.413' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Hoa_Don_Chi_Tiet] OFF
GO
SET IDENTITY_INSERT [dbo].[Khach_Hang] ON 

INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, NULL, N'Nguyen van B', NULL, NULL, NULL, NULL, NULL, CAST(N'2023-11-11T16:41:29.333' AS DateTime), NULL, CAST(N'2023-11-11T16:41:29.333' AS DateTime), NULL)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'KH001', N'Ten1', N'1234567890', N'DiaChi1', 1, 1, 1, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 1, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'KH002', N'Ten2', N'0987654321', N'DiaChi2', 0, 1, 2, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 2, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'KH003', N'Ten3', N'1357924680', N'DiaChi3', 1, 1, 3, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 3, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'KH004', N'Ten4', N'2468013579', N'DiaChi4', 0, 1, 4, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 4, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'KH005', N'Ten5', N'9876543210', N'DiaChi5', 1, 1, 5, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 5, CAST(N'2023-11-16T17:09:40.010' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'KH001', N'Ten1', N'1234567890', N'DiaChi1', 1, 1, 1, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'KH002', N'Ten2', N'0987654321', N'DiaChi2', 0, 1, 2, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'KH003', N'Ten3', N'1357924680', N'DiaChi3', 1, 1, 3, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'KH004', N'Ten4', N'2468013579', N'DiaChi4', 0, 1, 4, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khach_Hang] ([ID], [MaKH], [HoTen], [SDT], [DiaChi], [GioiTinh], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, N'KH005', N'Ten5', N'9876543210', N'DiaChi5', 1, 1, 5, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Khach_Hang] OFF
GO
SET IDENTITY_INSERT [dbo].[Khuyen_Mai] ON 

INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'Khuyen Mai 1', CAST(N'2023-01-01T00:00:00.000' AS DateTime), CAST(N'2023-01-15T00:00:00.000' AS DateTime), 1, 1, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 1, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'Khuyen Mai 2', CAST(N'2023-02-01T00:00:00.000' AS DateTime), CAST(N'2023-02-28T00:00:00.000' AS DateTime), 1, 2, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 2, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'Khuyen Mai 3', CAST(N'2023-03-01T00:00:00.000' AS DateTime), CAST(N'2023-03-15T00:00:00.000' AS DateTime), 1, 3, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 3, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'Khuyen Mai 4', CAST(N'2023-04-01T00:00:00.000' AS DateTime), CAST(N'2023-04-30T00:00:00.000' AS DateTime), 1, 4, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 4, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'Khuyen Mai 5', CAST(N'2023-05-01T00:00:00.000' AS DateTime), CAST(N'2023-05-15T00:00:00.000' AS DateTime), 1, 5, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 5, CAST(N'2023-11-16T17:11:20.937' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'Khuyen Mai 1', CAST(N'2023-01-01T00:00:00.000' AS DateTime), CAST(N'2023-01-15T00:00:00.000' AS DateTime), 1, 1, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'Khuyen Mai 2', CAST(N'2023-02-01T00:00:00.000' AS DateTime), CAST(N'2023-02-28T00:00:00.000' AS DateTime), 1, 2, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'Khuyen Mai 3', CAST(N'2023-03-01T00:00:00.000' AS DateTime), CAST(N'2023-03-15T00:00:00.000' AS DateTime), 1, 3, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'Khuyen Mai 4', CAST(N'2023-04-01T00:00:00.000' AS DateTime), CAST(N'2023-04-30T00:00:00.000' AS DateTime), 1, 4, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
INSERT [dbo].[Khuyen_Mai] ([ID], [MoTa], [NgayBatDau], [NgayKetThuc], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'Khuyen Mai 5', CAST(N'2023-05-01T00:00:00.000' AS DateTime), CAST(N'2023-05-15T00:00:00.000' AS DateTime), 1, 5, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.177' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Khuyen_Mai] OFF
GO
SET IDENTITY_INSERT [dbo].[Lich_Su_Hoa_Don] ON 

INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 3, CAST(N'1900-01-01T06:52:49.000' AS DateTime), 1, 1, NULL, CAST(N'2023-11-13T06:52:49.617' AS DateTime), NULL, CAST(N'2023-11-13T06:52:49.617' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, 5, CAST(N'1900-01-01T06:52:49.000' AS DateTime), 2, 1, NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), 1)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 8, CAST(N'1900-01-01T06:52:49.000' AS DateTime), 6, 1, NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, 8, CAST(N'1900-01-01T06:52:49.000' AS DateTime), 8, 1, NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, 11, CAST(N'1900-01-01T06:52:49.000' AS DateTime), 9, 1, NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), NULL, CAST(N'2023-11-13T06:52:49.620' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, 13, CAST(N'1900-01-01T06:54:08.000' AS DateTime), 1, 1, NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, 6, CAST(N'1900-01-01T06:54:08.000' AS DateTime), 2, 1, NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), 1)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, 9, CAST(N'1900-01-01T06:54:08.000' AS DateTime), 6, 1, NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, 4, CAST(N'1900-01-01T06:54:08.000' AS DateTime), 8, 1, NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), 0)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (17, 7, CAST(N'1900-01-01T06:54:08.000' AS DateTime), 9, 1, NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), 1)
INSERT [dbo].[Lich_Su_Hoa_Don] ([ID], [IDHoaDon], [ThoiGian], [HanhDong], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (18, 2, CAST(N'1900-01-01T06:54:08.000' AS DateTime), 10, 1, NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), NULL, CAST(N'2023-11-13T06:54:08.123' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Lich_Su_Hoa_Don] OFF
GO
SET IDENTITY_INSERT [dbo].[Mau_Sac] ON 

INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'M001', N'Metallic', 1, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 1, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'M002', N'Iridescent', 2, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 2, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'M003', N'Neon/Bright', 3, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 3, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'M004', N'Pastel ', 4, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 4, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'M005', N'Camouflage', 5, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 5, CAST(N'2023-11-16T17:13:35.143' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'M001', N'Màu 1', 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'M002', N'Màu 2', 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'M003', N'Màu 3', 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'M004', N'Màu 4', 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Mau_Sac] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'M005', N'Màu 5', 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Mau_Sac] OFF
GO
SET IDENTITY_INSERT [dbo].[Nha_San_Xuat] ON 

INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'NSX001', N'Nike', 1, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 1, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'NSX002', N'Adidas', 2, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 2, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'NSX003', N'Puma', 3, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 3, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'NSX004', N'Jordan Brand', 4, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 4, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'NSX005', N'Converse', 5, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 5, CAST(N'2023-11-16T17:14:21.963' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'NSX001', N'Nhà Sản Xuất 1', 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'NSX002', N'Nhà Sản Xuất 2', 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'NSX003', N'Nhà Sản Xuất 3', 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'NSX004', N'Nhà Sản Xuất 4', 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Nha_San_Xuat] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'NSX005', N'Nhà Sản Xuất 5', 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Nha_San_Xuat] OFF
GO
SET IDENTITY_INSERT [dbo].[Nhan_Vien] ON 

INSERT [dbo].[Nhan_Vien] ([ID], [IDChucVu], [MaNV], [Email], [MatKhau], [CCCD], [TenNV], [SDT], [DiaChi], [GioiTinh], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (4, NULL, N'NV01', NULL, NULL, NULL, N'Hoàng Văn Tuấn', NULL, NULL, 0, CAST(N'2023-11-13T05:21:32.007' AS DateTime), NULL, CAST(N'2023-11-13T05:21:32.007' AS DateTime), NULL, NULL)
INSERT [dbo].[Nhan_Vien] ([ID], [IDChucVu], [MaNV], [Email], [MatKhau], [CCCD], [TenNV], [SDT], [DiaChi], [GioiTinh], [NgayTao], [NguoiTao], [NgayCapNhat], [NguoiCapNhat], [Deleted]) VALUES (5, NULL, N'NV02', NULL, NULL, NULL, N'Lê Văn Nam', NULL, NULL, 1, CAST(N'2023-11-13T05:21:32.007' AS DateTime), NULL, CAST(N'2023-11-13T05:21:32.007' AS DateTime), NULL, NULL)
SET IDENTITY_INSERT [dbo].[Nhan_Vien] OFF
GO
SET IDENTITY_INSERT [dbo].[San_Pham] ON 

INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'SP01', N'Giay1', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'SP02', N'Giay2', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'SP03', N'Giay3', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'SP04', N'Giay4', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'SP05', N'Giay5', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'SP06', N'Giay6', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'SP07', N'Giay7', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'SP08', N'Giay8', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'SP09', N'Giay9', N'Nope', 1, NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL, CAST(N'2023-11-13T08:46:35.470' AS DateTime), NULL)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'SP001', N'Sản Phẩm 1', N'Mô tả sản phẩm 1', 1, 1, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 1, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, N'SP002', N'Sản Phẩm 2', N'Mô tả sản phẩm 2', 1, 2, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 2, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, N'SP003', N'Sản Phẩm 3', N'Mô tả sản phẩm 3', 1, 3, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 3, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, N'SP004', N'Sản Phẩm 4', N'Mô tả sản phẩm 4', 1, 4, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 4, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, N'SP005', N'Sản Phẩm 5', N'Mô tả sản phẩm 5', 1, 5, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 5, CAST(N'2023-11-16T17:17:25.370' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, N'SP001', N'Sản Phẩm 1', N'Mô tả sản phẩm 1', 1, 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, N'SP002', N'Sản Phẩm 2', N'Mô tả sản phẩm 2', 1, 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (17, N'SP003', N'Sản Phẩm 3', N'Mô tả sản phẩm 3', 1, 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (18, N'SP004', N'Sản Phẩm 4', N'Mô tả sản phẩm 4', 1, 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[San_Pham] ([ID], [Ma], [Ten], [MoTa], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (19, N'SP005', N'Sản Phẩm 5', N'Mô tả sản phẩm 5', 1, 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[San_Pham] OFF
GO
SET IDENTITY_INSERT [dbo].[San_Pham_Chi_Tiet] ON 

INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, NULL, 1, 1, 1, 3, 1, NULL, NULL, NULL, NULL, NULL, 10000.0000, 100, 1, NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, NULL, 2, 2, 2, 4, 2, NULL, NULL, NULL, NULL, NULL, 40000.0000, 310, 1, NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, NULL, 3, 3, 3, 5, 3, NULL, NULL, NULL, NULL, NULL, 90000.0000, 410, 1, NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, NULL, 4, 4, 4, 6, 4, NULL, NULL, NULL, NULL, NULL, 200000.0000, 10, 1, NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL, CAST(N'2023-11-13T08:51:44.443' AS DateTime), NULL)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, NULL, 5, 7, 7, 7, 5, NULL, NULL, NULL, NULL, NULL, 10000.0000, 28, 1, NULL, CAST(N'2023-11-16T17:31:24.810' AS DateTime), NULL, CAST(N'2023-11-16T17:31:24.810' AS DateTime), NULL)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, NULL, 6, 6, 3, 8, 6, NULL, NULL, NULL, NULL, NULL, 10000.0000, 31, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, NULL, 5, 5, 5, 9, 7, NULL, NULL, NULL, NULL, NULL, 74000.0000, 71, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, NULL, 4, 4, 4, 10, 8, NULL, NULL, NULL, NULL, NULL, 57000.0000, 78, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, NULL, 3, 3, 3, 11, 9, NULL, NULL, NULL, NULL, NULL, 25000.0000, 88, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, NULL, 1, 1, 1, 12, 10, NULL, NULL, NULL, NULL, NULL, 38000.0000, 44, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, NULL, 1, 1, 1, 13, 11, NULL, NULL, NULL, NULL, NULL, 57000.0000, 33, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, NULL, 2, 2, 2, 14, 12, NULL, NULL, NULL, NULL, NULL, 89000.0000, 22, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
INSERT [dbo].[San_Pham_Chi_Tiet] ([ID], [IDDanhMuc], [IDXuatXu], [IDNSX], [IDMauSac], [IDSize], [IDSanPham], [IDThuongHieu], [IDChatLieu], [IDDeGiay], [IDCoGiay], [KhoiLuong], [Gia], [SoLuongTon], [TrangThai], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, NULL, 3, 3, 3, 15, 13, NULL, NULL, NULL, NULL, NULL, 78000.0000, 11, 1, NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), NULL, CAST(N'2023-11-18T07:48:36.947' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[San_Pham_Chi_Tiet] OFF
GO
SET IDENTITY_INSERT [dbo].[Size] ON 

INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'SE1', 40, NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'SE2', 41, NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'SE3', 42, NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'SE4', 43, NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL, CAST(N'2023-11-13T08:41:41.877' AS DateTime), NULL)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'S001', 36, 1, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 1, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'S002', 38, 2, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 2, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'S003', 40, 3, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 3, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'S004', 42, 4, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 4, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (11, N'S005', 44, 5, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 5, CAST(N'2023-11-16T17:18:00.197' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (12, N'S001', 36, 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (13, N'S002', 38, 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (14, N'S003', 40, 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (15, N'S004', 42, 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Size] ([ID], [Ma], [Size], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (16, N'S005', 44, 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Size] OFF
GO
SET IDENTITY_INSERT [dbo].[Thanh_Toan] ON 

INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, 0, N'Chuyển khoản', NULL, CAST(N'2023-11-13T08:48:43.300' AS DateTime), NULL, CAST(N'2023-11-13T08:48:43.300' AS DateTime), NULL)
INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, 1, N'Tiền Mặt', NULL, CAST(N'2023-11-13T08:48:43.300' AS DateTime), NULL, CAST(N'2023-11-13T08:48:43.300' AS DateTime), NULL)
INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, 0, N'Thanh toán bằng chuyển khoản', 3, CAST(N'2023-11-16T17:19:01.593' AS DateTime), 3, CAST(N'2023-11-16T17:19:01.593' AS DateTime), 0)
INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, 1, N'Thanh toán bằng ví điện tử', 4, CAST(N'2023-11-16T17:19:01.593' AS DateTime), 4, CAST(N'2023-11-16T17:19:01.593' AS DateTime), 0)
INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, 0, N'Thanh toán khi nhận hàng', 5, CAST(N'2023-11-16T17:19:01.593' AS DateTime), 5, CAST(N'2023-11-16T17:19:01.593' AS DateTime), 0)
INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, 0, N'Thanh toán bằng chuyển khoản', 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, 1, N'Thanh toán bằng ví điện tử', 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Thanh_Toan] ([ID], [HinhThuc], [MoTa], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, 0, N'Thanh toán khi nhận hàng', 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Thanh_Toan] OFF
GO
SET IDENTITY_INSERT [dbo].[Thuong_Hieu] ON 

INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'TH001', N'Thương Hiệu 1', 1, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 1, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'TH002', N'Thương Hiệu 2', 2, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 2, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'TH003', N'Thương Hiệu 3', 3, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 3, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'TH004', N'Thương Hiệu 4', 4, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 4, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'TH005', N'Thương Hiệu 5', 5, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 5, CAST(N'2023-11-16T17:20:09.820' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'TH001', N'Thương Hiệu 1', 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'TH002', N'Thương Hiệu 2', 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'TH003', N'Thương Hiệu 3', 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'TH004', N'Thương Hiệu 4', 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Thuong_Hieu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'TH005', N'Thương Hiệu 5', 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Thuong_Hieu] OFF
GO
SET IDENTITY_INSERT [dbo].[Xuat_Xu] ON 

INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (1, N'XX001', N'Xuất Xứ 1', 1, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 1, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (2, N'XX002', N'Xuất Xứ 2', 2, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 2, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (3, N'XX003', N'Xuất Xứ 3', 3, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 3, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (4, N'XX004', N'Xuất Xứ 4', 4, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 4, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (5, N'XX005', N'Xuất Xứ 5', 5, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 5, CAST(N'2023-11-16T17:21:33.080' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (6, N'XX001', N'Xuất Xứ 1', 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 1, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (7, N'XX002', N'Xuất Xứ 2', 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 2, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (8, N'XX003', N'Xuất Xứ 3', 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 3, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (9, N'XX004', N'Xuất Xứ 4', 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 4, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
INSERT [dbo].[Xuat_Xu] ([ID], [Ma], [Ten], [NguoiTao], [NgayTao], [NguoiCapNhat], [NgayCapNhat], [Deleted]) VALUES (10, N'XX005', N'Xuất Xứ 5', 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 5, CAST(N'2023-11-16T17:23:19.180' AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[Xuat_Xu] OFF
GO
ALTER TABLE [dbo].[Chat_Lieu] ADD  CONSTRAINT [DF_Chat_Lieu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Chat_Lieu] ADD  CONSTRAINT [DF_Chat_Lieu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Chuc_Vu] ADD  CONSTRAINT [DF_Chuc_Vu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Chuc_Vu] ADD  CONSTRAINT [DF_Chuc_Vu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Co_Giay] ADD  CONSTRAINT [DF_Co_Giay_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Co_Giay] ADD  CONSTRAINT [DF_Co_Giay_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Danh_Muc] ADD  CONSTRAINT [DF_Danh_Muc_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Danh_Muc] ADD  CONSTRAINT [DF_Danh_Muc_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[De_Giay] ADD  CONSTRAINT [DF_De_Giay_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[De_Giay] ADD  CONSTRAINT [DF_De_Giay_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hinh_Anh] ADD  CONSTRAINT [DF_Hinh_Anh_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hinh_Anh] ADD  CONSTRAINT [DF_Hinh_Anh_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT] ADD  CONSTRAINT [DF_HinhThucTT_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hinh_Thuc_TT] ADD  CONSTRAINT [DF_HinhThucTT_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hoa_Don] ADD  CONSTRAINT [DF_Hoa_Don_NgayThanhToan]  DEFAULT (getdate()) FOR [NgayThanhToan]
GO
ALTER TABLE [dbo].[Hoa_Don] ADD  CONSTRAINT [DF_Hoa_Don_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hoa_Don] ADD  CONSTRAINT [DF_Hoa_Don_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet] ADD  CONSTRAINT [DF_Hoa_Don_Chi_Tiet_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Hoa_Don_Chi_Tiet] ADD  CONSTRAINT [DF_Hoa_Don_Chi_Tiet_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Khach_Hang] ADD  CONSTRAINT [DF_Khach_Hang_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Khach_Hang] ADD  CONSTRAINT [DF_Khach_Hang_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Khuyen_Mai] ADD  CONSTRAINT [DF_Khuyen_Mai_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Khuyen_Mai] ADD  CONSTRAINT [DF_Khuyen_Mai_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet] ADD  CONSTRAINT [DF_Khuyen_Mai_Chi_Tiet_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Khuyen_Mai_Chi_Tiet] ADD  CONSTRAINT [DF_Khuyen_Mai_Chi_Tiet_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Lich_Su_Hoa_Don] ADD  CONSTRAINT [DF_Lich_Su_Hoa_Don_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Lich_Su_Hoa_Don] ADD  CONSTRAINT [DF_Lich_Su_Hoa_Don_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Mau_Sac] ADD  CONSTRAINT [DF_Mau_Sac_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Mau_Sac] ADD  CONSTRAINT [DF_Mau_Sac_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Nha_San_Xuat] ADD  CONSTRAINT [DF_Nha_San_Xuat_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Nha_San_Xuat] ADD  CONSTRAINT [DF_Nha_San_Xuat_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Nhan_Vien] ADD  CONSTRAINT [DF_Nhan_Vien_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Nhan_Vien] ADD  CONSTRAINT [DF_Nhan_Vien_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[San_Pham] ADD  CONSTRAINT [DF_San_Pham_NgayTao_1]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[San_Pham] ADD  CONSTRAINT [DF_San_Pham_NgayCapNhat_1]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] ADD  CONSTRAINT [DF_San_Pham_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] ADD  CONSTRAINT [DF_San_Pham_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Size] ADD  CONSTRAINT [DF_Size_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Size] ADD  CONSTRAINT [DF_Size_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Thanh_Toan] ADD  CONSTRAINT [DF_Thanh_Toan_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Thanh_Toan] ADD  CONSTRAINT [DF_Thanh_Toan_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Thuong_Hieu] ADD  CONSTRAINT [DF_Thuong_Hieu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Thuong_Hieu] ADD  CONSTRAINT [DF_Thuong_Hieu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
GO
ALTER TABLE [dbo].[Xuat_Xu] ADD  CONSTRAINT [DF_Xuat_Xu_NgayTao]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[Xuat_Xu] ADD  CONSTRAINT [DF_Xuat_Xu_NgayCapNhat]  DEFAULT (getdate()) FOR [NgayCapNhat]
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
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Chat_Lieu] FOREIGN KEY([IDChatLieu])
REFERENCES [dbo].[Chat_Lieu] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Chat_Lieu]
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet]  WITH CHECK ADD  CONSTRAINT [FK_San_Pham_Chi_Tiet_Co_Giay] FOREIGN KEY([IDCoGiay])
REFERENCES [dbo].[Co_Giay] ([ID])
GO
ALTER TABLE [dbo].[San_Pham_Chi_Tiet] CHECK CONSTRAINT [FK_San_Pham_Chi_Tiet_Co_Giay]
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
/****** Object:  StoredProcedure [dbo].[sp_LichSu]    Script Date: 11/24/2023 10:30:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_LichSu]
AS BEGIN
SELECT
Lich_Su_Hoa_Don.ID, Nhan_Vien.TenNV, 
Nhan_Vien.MaNV, Hoa_Don.TenNguoiNhan, Hoa_Don.TongTien, 
Hoa_Don.NguoiTao, Hoa_Don.NgayThanhToan, Lich_Su_Hoa_Don.TrangThai
FROM Lich_Su_Hoa_Don INNER JOIN
 Hoa_Don ON Lich_Su_Hoa_Don.IDHoaDon = Hoa_Don.ID INNER JOIN
Nhan_Vien ON Hoa_Don.IDNhanVien = Nhan_Vien.ID
END
GO
