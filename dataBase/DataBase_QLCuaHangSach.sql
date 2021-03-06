USE [master]
GO
/****** Object:  Database [QLCuaHangSach]    Script Date: 12/26/2021 9:39:31 AM ******/
CREATE DATABASE [QLCuaHangSach]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLCuaHangSach', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\QLCuaHangSach.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLCuaHangSach_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQLEXPRESS\MSSQL\DATA\QLCuaHangSach_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [QLCuaHangSach] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLCuaHangSach].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLCuaHangSach] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QLCuaHangSach] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLCuaHangSach] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLCuaHangSach] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET  ENABLE_BROKER 
GO
ALTER DATABASE [QLCuaHangSach] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLCuaHangSach] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLCuaHangSach] SET  MULTI_USER 
GO
ALTER DATABASE [QLCuaHangSach] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLCuaHangSach] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLCuaHangSach] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLCuaHangSach] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLCuaHangSach] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLCuaHangSach] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [QLCuaHangSach] SET QUERY_STORE = OFF
GO
USE [QLCuaHangSach]
GO
/****** Object:  Table [dbo].[CT_HoaDon]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CT_HoaDon](
	[maHD] [varchar](255) NOT NULL,
	[maSach] [varchar](255) NOT NULL,
	[giaban] [float] NOT NULL,
	[soluong] [int] NOT NULL,
	[tongTien] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maHD] ASC,
	[maSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CT_PhieuNhap]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CT_PhieuNhap](
	[maPN] [varchar](255) NOT NULL,
	[maSach] [varchar](255) NOT NULL,
	[soluong] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maPN] ASC,
	[maSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonDat]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonDat](
	[maDD] [varchar](255) NOT NULL,
	[ngayDat] [datetime2](7) NOT NULL,
	[ngayNhan] [datetime2](7) NOT NULL,
	[soLuong] [int] NOT NULL,
	[maKH] [varchar](255) NULL,
	[maSach] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maDD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [varchar](255) NOT NULL,
	[ngaylap] [datetime2](7) NOT NULL,
	[tongTien] [float] NOT NULL,
	[maDD] [varchar](255) NULL,
	[maKH] [varchar](255) NULL,
	[maNV] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [varchar](255) NOT NULL,
	[diaChi] [nvarchar](255) NULL,
	[email] [varchar](50) NULL,
	[namSinh] [datetime2](7) NULL,
	[soDT] [nvarchar](10) NOT NULL,
	[tenKH] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [varchar](255) NOT NULL,
	[caLam] [int] NOT NULL,
	[diaChi] [nvarchar](255) NULL,
	[namSinh] [datetime2](7) NULL,
	[soDT] [varchar](10) NOT NULL,
	[tenNV] [nvarchar](255) NOT NULL,
	[quanLyId] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaXuatBan]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaXuatBan](
	[maNXB] [varchar](255) NOT NULL,
	[diachi] [nvarchar](255) NULL,
	[tenNXB] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNXB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuChamCong]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuChamCong](
	[maPhieu] [varchar](255) NOT NULL,
	[luongCB] [money] NOT NULL,
	[ngaylapPhieu] [datetime2](7) NULL,
	[soNgayLam] [int] NOT NULL,
	[tienPhat] [float] NOT NULL,
	[tienThuong] [float] NOT NULL,
	[maNV] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maPhieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[maPN] [varchar](255) NOT NULL,
	[ngayNhap] [datetime2](7) NULL,
	[maNV] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[maPN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sach]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sach](
	[maSach] [varchar](255) NOT NULL,
	[giaThanh] [float] NOT NULL,
	[loai] [nvarchar](50) NULL,
	[soLuong] [int] NOT NULL,
	[tenSach] [nvarchar](255) NOT NULL,
	[maNXB] [varchar](255) NULL,
	[maTG] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[maSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TacGia]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TacGia](
	[maTG] [varchar](10) NOT NULL,
	[diachi] [nvarchar](255) NULL,
	[namsinh] [datetime2](7) NULL,
	[tenTG] [nvarchar](255) NOT NULL,
	[tieusu] [text] NULL,
PRIMARY KEY CLUSTERED 
(
	[maTG] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 12/26/2021 9:39:31 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[tenTK] [varchar](20) NOT NULL,
	[matKhau] [varchar](50) NULL,
	[maNV] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[tenTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00001', N'S00001', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00001', N'S00002', 25000, 10, 250000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00002', N'S00002', 22000, 1, 22000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00002', N'S00003', 74800, 2, 149600)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00003', N'S00001', 12000, 2, 24000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00003', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00003', N'S00009', 15000, 5, 75000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00003', N'S00010', 15000, 4, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00004', N'S00003', 68000, 3, 204000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00004', N'S00005', 50000, 2, 100000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00004', N'S00008', 16000, 2, 48000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00004', N'S00010', 15000, 3, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00005', N'S00002', 20000, 5, 100000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00005', N'S00004', 60000, 5, 300000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00005', N'S00005', 50000, 3, 150000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00005', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00005', N'S00007', 10000, 7, 70000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00005', N'S00010', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00006', N'S00002', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00006', N'S00006', 60000, 3, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00006', N'S00011', 70000, 5, 350000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00007', N'S00003', 68000, 3, 204000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00007', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00007', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00007', N'S00009', 15000, 3, 45000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00007', N'S00011', 70000, 3, 210000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00008', N'S00003', 68000, 4, 272000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00008', N'S00004', 60000, 3, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00008', N'S00006', 60000, 3, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00008', N'S00008', 16000, 3, 48000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00008', N'S00010', 15000, 3, 45000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00009', N'S00001', 12000, 2, 24000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00009', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00009', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00009', N'S00007', 10000, 2, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00009', N'S00011', 70000, 4, 280000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00010', N'S00004', 60000, 4, 240000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00010', N'S00005', 50000, 2, 100000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00010', N'S00007', 10000, 2, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00010', N'S00009', 15000, 3, 45000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00010', N'S00010', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00010', N'S00011', 70000, 2, 140000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00011', N'S00001', 12000, 1, 12000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00011', N'S00006', 60000, 1, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00011', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00011', N'S00010', 15000, 5, 75000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00011', N'S00011', 70000, 3, 210000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00012', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00012', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00012', N'S00011', 70000, 3, 210000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00013', N'S00004', 60000, 3, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00013', N'S00010', 15000, 4, 15000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00014', N'S00001', 12000, 3, 36000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00014', N'S00003', 68000, 5, 340000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00014', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00014', N'S00009', 15000, 4, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00014', N'S00011', 70000, 2, 140000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00015', N'S00001', 12000, 2, 24000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00015', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00015', N'S00007', 10000, 2, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00015', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00016', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00016', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00016', N'S00008', 16000, 4, 64000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00016', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00016', N'S00011', 70000, 2, 140000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00017', N'S00001', 12000, 4, 48000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00017', N'S00003', 68000, 4, 272000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00017', N'S00005', 50000, 3, 150000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00017', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00017', N'S00012', 30000, 3, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00018', N'S00001', 12000, 2, 24000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00018', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00018', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00018', N'S00011', 70000, 2, 140000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00019', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00019', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00019', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00019', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00019', N'S00012', 30000, 2, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00020', N'S00001', 12000, 4, 48000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00020', N'S00006', 60000, 4, 240000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00020', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00020', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00020', N'S00013', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00020', N'S00014', 45000, 3, 135000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00021', N'S00001', 12000, 2, 24000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00021', N'S00003', 68000, 3, 204000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00021', N'S00009', 15000, 6, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00021', N'S00010', 15000, 6, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00021', N'S00012', 30000, 3, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00021', N'S00014', 45000, 3, 135000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00022', N'S00002', 20000, 3, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00022', N'S00005', 50000, 5, 250000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00022', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00022', N'S00011', 70000, 3, 210000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00023', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00023', N'S00006', 60000, 4, 240000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00023', N'S00009', 15000, 4, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00023', N'S00011', 70000, 3, 210000)
GO
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00023', N'S00013', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00023', N'S00014', 45000, 3, 135000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00024', N'S00002', 20000, 4, 80000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00024', N'S00004', 60000, 4, 240000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00024', N'S00006', 60000, 3, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00024', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00024', N'S00009', 15000, 3, 45000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00024', N'S00013', 20000, 4, 80000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00024', N'S00014', 45000, 3, 135000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00025', N'S00001', 12000, 1, 12000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00025', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00025', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00025', N'S00009', 15000, 3, 45000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00025', N'S00012', 30000, 3, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00025', N'S00013', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00025', N'S00014', 45000, 3, 135000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00026', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00026', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00026', N'S00011', 70000, 2, 140000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00026', N'S00014', 45000, 2, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00001', 12000, 4, 48000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00002', 20000, 3, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00005', 50000, 4, 200000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00006', 60000, 3, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00009', 15000, 3, 45000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00010', 15000, 6, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00013', 20000, 4, 80000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00027', N'S00014', 45000, 4, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00001', 12000, 5, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00002', 20000, 1, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00003', 68000, 1, 68000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00004', 60000, 1, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00005', 50000, 1, 50000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00006', 60000, 1, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00008', 16000, 1, 16000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00009', 15000, 1, 15000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00010', 15000, 1, 15000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00011', 70000, 1, 70000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00028', N'S00012', 30000, 1, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00002', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00003', 68000, 5, 340000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00005', 50000, 3, 150000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00008', 16000, 5, 80000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00009', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00012', 30000, 3, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00013', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00029', N'S00014', 45000, 6, 270000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00001', 12000, 1, 12000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00002', 20000, 1, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00003', 68000, 3, 204000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00004', 60000, 1, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00005', 50000, 1, 50000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00006', 60000, 1, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00008', 16000, 1, 16000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00009', 15000, 5, 75000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00010', 15000, 1, 15000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00011', 70000, 3, 210000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00012', 30000, 5, 150000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00013', 20000, 1, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00030', N'S00014', 45000, 4, 180000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00031', N'S00012', 30000, 1, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00031', N'S00013', 20000, 3, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00032', N'S00003', 68000, 1, 68000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00032', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00032', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00032', N'S00012', 30000, 2, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00032', N'S00014', 45000, 2, 90000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00032', N'S00015', 200000, 2, 400000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00032', N'S00016', 140000, 2, 280000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00033', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00033', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00033', N'S00005', 50000, 2, 100000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00033', N'S00006', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00033', N'S00008', 16000, 4, 64000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00033', N'S00013', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00033', N'S00015', 200000, 2, 400000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00034', N'S00004', 60000, 2, 120000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00034', N'S00008', 16000, 2, 32000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00034', N'S00010', 15000, 1, 15000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00034', N'S00013', 20000, 1, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00034', N'S00014', 45000, 1, 45000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00034', N'S00016', 140000, 1, 140000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00035', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00035', N'S00005', 50000, 2, 100000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00035', N'S00010', 15000, 2, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00035', N'S00013', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00035', N'S00016', 140000, 2, 280000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00036', N'S00003', 68000, 2, 136000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00036', N'S00013', 20000, 2, 40000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00036', N'S00015', 200000, 2, 400000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00037', N'S00005', 50000, 1, 50000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00037', N'S00010', 15000, 4, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00037', N'S00012', 30000, 1, 30000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00037', N'S00015', 200000, 1, 200000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00038', N'S00006', 60000, 1, 60000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00038', N'S00011', 70000, 2, 140000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00038', N'S00013', 20000, 1, 20000)
INSERT [dbo].[CT_HoaDon] ([maHD], [maSach], [giaban], [soluong], [tongTien]) VALUES (N'HD00038', N'S00015', 200000, 2, 400000)
GO
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00001', CAST(N'2021-09-25T00:00:00.0000000' AS DateTime2), 280000, NULL, N'KH00001', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00002', CAST(N'2021-11-22T00:00:00.0000000' AS DateTime2), 171600, NULL, N'KH00002', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00003', CAST(N'2021-12-01T00:00:00.0000000' AS DateTime2), 295000, NULL, N'KH00002', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00004', CAST(N'2021-12-01T00:00:00.0000000' AS DateTime2), 382000, NULL, N'KH00005', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00005', CAST(N'2021-12-02T00:00:00.0000000' AS DateTime2), 770000, NULL, N'KH00007', N'NV00002')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00006', CAST(N'2021-12-03T00:00:00.0000000' AS DateTime2), 570000, NULL, N'KH00008', N'NV00002')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00007', CAST(N'2021-12-03T00:00:00.0000000' AS DateTime2), 699000, NULL, N'KH00011', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00008', CAST(N'2021-12-03T00:00:00.0000000' AS DateTime2), 725000, NULL, N'KH00011', N'NV00007')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00009', CAST(N'2020-12-03T00:00:00.0000000' AS DateTime2), 580000, NULL, N'KH00010', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00010', CAST(N'2020-12-03T00:00:00.0000000' AS DateTime2), 575000, NULL, N'KH00008', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00011', CAST(N'2021-12-03T00:00:00.0000000' AS DateTime2), 387000, NULL, N'KH00007', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00012', CAST(N'2021-12-04T00:00:00.0000000' AS DateTime2), 360000, NULL, N'KH00006', N'NV00007')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00013', CAST(N'2021-12-04T00:00:00.0000000' AS DateTime2), 195000, NULL, N'KH00011', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00014', CAST(N'2021-12-11T00:00:00.0000000' AS DateTime2), 696000, NULL, N'KH00012', N'NV00007')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00015', CAST(N'2021-12-15T00:00:00.0000000' AS DateTime2), 196000, NULL, N'KH00011', N'NV00007')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00016', CAST(N'2021-12-15T00:00:00.0000000' AS DateTime2), 474000, NULL, N'KH00002', N'NV00007')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00017', CAST(N'2021-12-20T00:00:00.0000000' AS DateTime2), 592000, NULL, N'KH00013', N'NV00007')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00018', CAST(N'2021-12-20T00:00:00.0000000' AS DateTime2), 330000, NULL, N'KH00012', N'NV00007')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00019', CAST(N'2021-12-22T00:00:00.0000000' AS DateTime2), 466000, NULL, N'KH00003', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00020', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 525000, NULL, N'KH00013', N'NV00008')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00021', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 633000, NULL, N'KH00005', N'NV00008')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00022', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 552000, NULL, N'KH00001', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00023', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 821000, NULL, N'KH00011', N'NV00004')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00024', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 792000, NULL, N'KH00004', N'NV00009')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00025', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 490000, NULL, N'KH00009', N'NV00009')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00026', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 380000, NULL, N'KH00004', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00027', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 1051000, NULL, N'KH00012', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00028', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 464000, NULL, N'KH00012', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00029', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 1040000, NULL, N'KH00012', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00030', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 1072000, NULL, N'KH00011', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00031', CAST(N'2021-12-24T00:00:00.0000000' AS DateTime2), 90000, NULL, N'KH00013', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00032', CAST(N'2021-12-25T00:00:00.0000000' AS DateTime2), 1138000, NULL, N'KH00013', N'NV00009')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00033', CAST(N'2021-12-25T00:00:00.0000000' AS DateTime2), 980000, NULL, N'KH00008', N'NV00009')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00034', CAST(N'2021-12-25T00:00:00.0000000' AS DateTime2), 372000, NULL, N'KH00001', N'NV00009')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00035', CAST(N'2021-12-25T00:00:00.0000000' AS DateTime2), 586000, NULL, N'KH00008', N'NV00009')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00036', CAST(N'2021-12-26T00:00:00.0000000' AS DateTime2), 576000, NULL, N'KH00005', N'NV00003')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00037', CAST(N'2021-12-26T00:00:00.0000000' AS DateTime2), 340000, NULL, N'KH00008', N'NV00001')
INSERT [dbo].[HoaDon] ([maHD], [ngaylap], [tongTien], [maDD], [maKH], [maNV]) VALUES (N'HD00038', CAST(N'2021-12-26T00:00:00.0000000' AS DateTime2), 620000, NULL, N'KH00007', N'NV00008')
GO
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00001', N'12 Phan co Ich, ho tay, HN', N'E@gmail.com', CAST(N'2000-09-25T00:00:00.0000000' AS DateTime2), N'0123456789', N'Nguyễn An')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00002', N'12 Phan co Ich, ho tay, HN', N'E2@gmail.com', CAST(N'1993-08-12T00:00:00.0000000' AS DateTime2), N'0163456789', N'Trần Bá')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00003', N'A2 TP HCM', N'Hao123@gmail.com', CAST(N'1999-08-13T00:00:00.0000000' AS DateTime2), N'0123456798', N'Thái Anh Hào')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00004', N'12 Nguyễn Trãi, HN', N'An1@gamil.com', CAST(N'1975-08-17T00:00:00.0000000' AS DateTime2), N'0123456679', N'Phan Cao An')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00005', N'HCM', N'MailVuong@gmail.com', CAST(N'1985-11-29T00:00:00.0000000' AS DateTime2), N'0159357101', N'Trần Vương')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00006', N'HN', N'KienMail@gmail.com', CAST(N'1979-10-25T00:00:00.0000000' AS DateTime2), N'0159357102', N'Phan Kiên')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00007', N'TP HCM', N'HungEmail@gmail.com', CAST(N'1966-08-01T00:00:00.0000000' AS DateTime2), N'0159357103', N'Đại Hùng')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00008', N'HN', N'TaiMail@gmail.com', CAST(N'1994-12-01T00:00:00.0000000' AS DateTime2), N'0159357104', N'Vũ Anh Tài')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00009', N'TP HCM', N'AnhMail@gmail.com', CAST(N'1996-12-01T00:00:00.0000000' AS DateTime2), N'0159357105', N'Phan Anh')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00010', N'HN', N'HaMail@gmail.com', CAST(N'1981-12-01T00:00:00.0000000' AS DateTime2), N'0159357106', N'Phạm Thì Hà')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00011', N'HN', N'BinhMail@gmail.com', CAST(N'1981-12-01T00:00:00.0000000' AS DateTime2), N'0159357107', N'Công Anh')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00012', N'NB', N'TrangEmail@gmail.com', CAST(N'1978-03-11T00:00:00.0000000' AS DateTime2), N'0159357108', N'Mai Thị Trang')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00013', N'BÌnh Dương', N'BinhEmail@gmail.com', CAST(N'1979-12-20T00:00:00.0000000' AS DateTime2), N'0159357109', N'Phạm Bình')
INSERT [dbo].[KhachHang] ([maKH], [diaChi], [email], [namSinh], [soDT], [tenKH]) VALUES (N'KH00014', N'NB', N'Email@gmail.com', CAST(N'1985-12-26T00:00:00.0000000' AS DateTime2), N'0159357123', N'Nguyen A')
GO
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00001', -1, N'Việt Nam', CAST(N'2001-02-01T00:00:00.0000000' AS DateTime2), N'0123456789', N'System Admin', NULL)
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00002', 2, N'12 Phan co Ich, ho tay, HN', CAST(N'2001-11-25T00:00:00.0000000' AS DateTime2), N'0123456987', N'Nguyễn Kha', N'NV00001')
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00003', 3, N'12 Phan co Ich, ho tay, HN', CAST(N'2001-11-25T00:00:00.0000000' AS DateTime2), N'0123456798', N'Khoa Văn', N'NV00001')
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00004', 1, N'12, Ba Đình, Hà Nội', CAST(N'1997-10-28T00:00:00.0000000' AS DateTime2), N'0159357001', N'Phan Bồ Luật', N'NV00001')
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00005', 1, N'16, Hùng Vương, HN', CAST(N'1995-12-03T00:00:00.0000000' AS DateTime2), N'0159357002', N'Trần Mai Sao', N'NV00002')
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00006', 1, N'HN', CAST(N'1997-12-03T00:00:00.0000000' AS DateTime2), N'0159357003', N'Phạm Công', NULL)
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00007', 2, N'TP HCM', CAST(N'2001-12-03T00:00:00.0000000' AS DateTime2), N'0357159101', N'Phạm Công Trình', N'NV00002')
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00008', 1, N'Đã Nẵng', CAST(N'2000-06-24T00:00:00.0000000' AS DateTime2), N'0357159001', N'Vũ Thu', N'NV00003')
INSERT [dbo].[NhanVien] ([maNV], [caLam], [diaChi], [namSinh], [soDT], [tenNV], [quanLyId]) VALUES (N'NV00009', 1, N'TP HCM', CAST(N'1990-07-25T00:00:00.0000000' AS DateTime2), N'0357159002', N'Trần Quỳnh', N'NV00003')
GO
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00001', N'12 Phan có Ích, Hồ Gươm, HN', N'Nhà sách A01')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00002', N'12 Phan có Ích, Hồ Tây, HN', N'Nhà sách A02')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00003', N'365 Phạm Văn Đồng, Gò Vắp, TP HCM', N'Công ty sách Hồng Phúc')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00004', N'Hà Nội', N'Nhà XB Kim Đồng')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00005', N'TP HCM', N'Nhà XB Trẻ')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00006', N'TP HCM', N'Nhà XB tổng hợp TP HCM')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00007', N'Đà Nẵng', N'Nhà XB giáo dục')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00008', N'Hà Nội', N'Thông tin  và truyền thông')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00009', N'TP HCM', N'Nhà XB lao động')
INSERT [dbo].[NhaXuatBan] ([maNXB], [diachi], [tenNXB]) VALUES (N'NXB00010', N'TP HCM', N'Nhà xuất bản Sao Mai')
GO
INSERT [dbo].[PhieuChamCong] ([maPhieu], [luongCB], [ngaylapPhieu], [soNgayLam], [tienPhat], [tienThuong], [maNV]) VALUES (N'PCC00001', 150000.0000, CAST(N'2021-09-25T00:00:00.0000000' AS DateTime2), 20, 100000, 200000, N'NV00001')
GO
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00001', 12000, N'Sách Giáo trình', 68, N'Tiếng việt lớp 9', N'NXB00001', N'TG00001')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00002', 20000, N'Sách Truyện, tiểu thuyết', 79, N'Đắc nhân tâm', N'NXB00002', N'TG00001')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00003', 68000, N'Sách Văn học nghệ thuật', 148, N'Tuổi Trẻ Đáng Giá Bao Nhiêu', N'NXB00002', N'TG00002')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00004', 60000, N'Sách Văn học nghệ thuật', 81, N'Truyện Kiều', N'NXB00006', N'TG00004')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00005', 50000, N'Sách Chính trị – pháp luật', 215, N'Luật Sở Hữu Chí Tuệ(2009)', N'NXB00002', N'TG00004')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00006', 60000, N'Sách Truyện, tiểu thuyết', 295, N'Sherlock Holmes', N'NXB00007', N'TG00002')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00007', 10000, N'Sách Văn học nghệ thuật', 0, N'Thơ Ca Dân Gian', N'NXB00001', N'TG00002')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00008', 16000, N'Sách Giáo trình', 114, N'Tiếng Anh 2', N'NXB00002', N'TG00002')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00009', 15000, N'Sách Chính trị – pháp luật', 109, N'Luật Công Nghệ Thông Tin', N'NXB00005', N'TG00004')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00010', 15000, N'Sách Văn hóa xã hội – Lịch sử', 6, N'Chiếc Lược Ngà', N'NXB00006', N'TG00003')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00011', 70000, N'Sách Khoa học công nghệ', 80, N'Homo Deus: Lược Sử Tương Lai', N'NXB00003', N'TG00003')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00012', 30000, N'Sách Giáo trình', 176, N'Tiếng Anh 1', N'NXB00007', N'TG00003')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00013', 20000, N'Sách Văn học nghệ thuật', 172, N'Câu Chuyện Giáng Sinh', N'NXB00005', N'TG00005')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00014', 45000, N'Sách Sách thiếu nhi', 166, N'Vua Sáng Chế - Tập 1', N'NXB00004', N'TG00005')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00015', 200000, N'Sách Giáo trình', 241, N'Sách Giáo Khoa Bộ Lớp 12', N'NXB00007', N'TG00003')
INSERT [dbo].[Sach] ([maSach], [giaThanh], [loai], [soLuong], [tenSach], [maNXB], [maTG]) VALUES (N'S00016', 140000, N'Sách Tâm lý', 155, N'Cuộc Sống Với Nhân Số Học', N'NXB00006', N'TG00005')
GO
INSERT [dbo].[TacGia] ([maTG], [diachi], [namsinh], [tenTG], [tieusu]) VALUES (N'TG00001', N'12 Phan co Ich, ho tay, HN', CAST(N'1981-06-25T00:00:00.0000000' AS DateTime2), N'Trần anh Dương', NULL)
INSERT [dbo].[TacGia] ([maTG], [diachi], [namsinh], [tenTG], [tieusu]) VALUES (N'TG00002', N'A2, TP HCM', CAST(N'1987-01-01T00:00:00.0000000' AS DateTime2), N'Rosie Nguyễn', N'Chuyên Van')
INSERT [dbo].[TacGia] ([maTG], [diachi], [namsinh], [tenTG], [tieusu]) VALUES (N'TG00003', N'A1, TP HCM', CAST(N'1984-11-21T00:00:00.0000000' AS DateTime2), N'Vũ Duy Thanh', N'Chuyên Van')
INSERT [dbo].[TacGia] ([maTG], [diachi], [namsinh], [tenTG], [tieusu]) VALUES (N'TG00004', N'HCM', CAST(N'1955-05-07T00:00:00.0000000' AS DateTime2), N'Nguyễn Nhật Ánh', NULL)
INSERT [dbo].[TacGia] ([maTG], [diachi], [namsinh], [tenTG], [tieusu]) VALUES (N'TG00005', N'ALL', CAST(N'1960-02-27T00:00:00.0000000' AS DateTime2), N'Nhiều Tác Giả', N'Nh?ng câu chuy?n l? giáo trong b? sách này là nh?ng bài giáo d?c d?o d?c nho nh? giúp các em h?c h?i nh?ng di?u hay')
GO
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'Admin', N'123456aQ@', N'NV00001')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'Luat10', N'123456aQ@', N'NV00004')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'Luat11', N'123456aQ@', N'NV00004')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'nhanvien08', N'123456aQ@', N'NV00008')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'nhanvien09', N'123456aQ@', N'NV00009')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'nv02', N'123456aQ@', N'NV00005')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'nv03', N'123456aQ@', N'NV00007')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'taikhoannv2', N'123456aQ@', N'NV00002')
INSERT [dbo].[TaiKhoan] ([tenTK], [matKhau], [maNV]) VALUES (N'taikhoannv3', N'123456aQ@', N'NV00003')
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK_44y8t8wxiasfglyq8igl57rf1]    Script Date: 12/26/2021 9:39:31 AM ******/
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [UK_44y8t8wxiasfglyq8igl57rf1] UNIQUE NONCLUSTERED 
(
	[soDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[CT_HoaDon]  WITH CHECK ADD  CONSTRAINT [FKkjexmd079fwn8sbbuavktl5u0] FOREIGN KEY([maSach])
REFERENCES [dbo].[Sach] ([maSach])
GO
ALTER TABLE [dbo].[CT_HoaDon] CHECK CONSTRAINT [FKkjexmd079fwn8sbbuavktl5u0]
GO
ALTER TABLE [dbo].[CT_HoaDon]  WITH CHECK ADD  CONSTRAINT [FKnbc1n418i6dvdy4iip69upge7] FOREIGN KEY([maHD])
REFERENCES [dbo].[HoaDon] ([maHD])
GO
ALTER TABLE [dbo].[CT_HoaDon] CHECK CONSTRAINT [FKnbc1n418i6dvdy4iip69upge7]
GO
ALTER TABLE [dbo].[CT_PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK7s79eju172fn2fuhv6esrfp9f] FOREIGN KEY([maPN])
REFERENCES [dbo].[PhieuNhap] ([maPN])
GO
ALTER TABLE [dbo].[CT_PhieuNhap] CHECK CONSTRAINT [FK7s79eju172fn2fuhv6esrfp9f]
GO
ALTER TABLE [dbo].[CT_PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FKd66l8milhua1jvuv2aglddf30] FOREIGN KEY([maSach])
REFERENCES [dbo].[Sach] ([maSach])
GO
ALTER TABLE [dbo].[CT_PhieuNhap] CHECK CONSTRAINT [FKd66l8milhua1jvuv2aglddf30]
GO
ALTER TABLE [dbo].[DonDat]  WITH CHECK ADD  CONSTRAINT [FK14big9b93489vaj7nh8ah4kni] FOREIGN KEY([maSach])
REFERENCES [dbo].[Sach] ([maSach])
GO
ALTER TABLE [dbo].[DonDat] CHECK CONSTRAINT [FK14big9b93489vaj7nh8ah4kni]
GO
ALTER TABLE [dbo].[DonDat]  WITH CHECK ADD  CONSTRAINT [FK26qr2sw7oenftvwiwakeif2l7] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[DonDat] CHECK CONSTRAINT [FK26qr2sw7oenftvwiwakeif2l7]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK5q1e717glsvw7kr5lb6og7ert] FOREIGN KEY([maDD])
REFERENCES [dbo].[DonDat] ([maDD])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK5q1e717glsvw7kr5lb6og7ert]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKg1ebuq3tydt58wb4gutehmh9w] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKg1ebuq3tydt58wb4gutehmh9w]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FKoyaa1162ps1nyifmfv2pv2qr] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FKoyaa1162ps1nyifmfv2pv2qr]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FKqx7yin414pyvuc5dxh2923545] FOREIGN KEY([quanLyId])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FKqx7yin414pyvuc5dxh2923545]
GO
ALTER TABLE [dbo].[PhieuChamCong]  WITH CHECK ADD  CONSTRAINT [FK7nm9oclufqmo8bnpwyjoarhem] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[PhieuChamCong] CHECK CONSTRAINT [FK7nm9oclufqmo8bnpwyjoarhem]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FKa2uv1xqc89m288f0hglbexnit] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FKa2uv1xqc89m288f0hglbexnit]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [FK1omdihaln44phbdosqx93ybpf] FOREIGN KEY([maNXB])
REFERENCES [dbo].[NhaXuatBan] ([maNXB])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [FK1omdihaln44phbdosqx93ybpf]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [FK1y0ivkeo5dhqia3c05qowe62a] FOREIGN KEY([maTG])
REFERENCES [dbo].[TacGia] ([maTG])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [FK1y0ivkeo5dhqia3c05qowe62a]
GO
ALTER TABLE [dbo].[TaiKhoan]  WITH CHECK ADD  CONSTRAINT [FKdlo89541w3584djqsekcdm274] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[TaiKhoan] CHECK CONSTRAINT [FKdlo89541w3584djqsekcdm274]
GO
USE [master]
GO
ALTER DATABASE [QLCuaHangSach] SET  READ_WRITE 
GO
