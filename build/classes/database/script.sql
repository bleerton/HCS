USE [master]
GO
/****** Object:  Database [HealthCareScheduling]    Script Date: 5/26/2019 12:15:08 AM ******/
CREATE DATABASE [HealthCareScheduling]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'HealthCareScheduling', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\HealthCareScheduling.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'HealthCareScheduling_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\HealthCareScheduling_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [HealthCareScheduling] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [HealthCareScheduling].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [HealthCareScheduling] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET ARITHABORT OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [HealthCareScheduling] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [HealthCareScheduling] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET  DISABLE_BROKER 
GO
ALTER DATABASE [HealthCareScheduling] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [HealthCareScheduling] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET RECOVERY FULL 
GO
ALTER DATABASE [HealthCareScheduling] SET  MULTI_USER 
GO
ALTER DATABASE [HealthCareScheduling] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [HealthCareScheduling] SET DB_CHAINING OFF 
GO
ALTER DATABASE [HealthCareScheduling] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [HealthCareScheduling] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [HealthCareScheduling] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'HealthCareScheduling', N'ON'
GO
ALTER DATABASE [HealthCareScheduling] SET QUERY_STORE = OFF
GO
USE [HealthCareScheduling]
GO
/****** Object:  Table [dbo].[Administrator]    Script Date: 5/26/2019 12:15:08 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Administrator](
	[AdministratorID] [int] NOT NULL,
	[First_Name] [varchar](50) NOT NULL,
	[Last_Name] [varchar](50) NOT NULL,
	[Date_Of_birth] [date] NOT NULL,
	[Phone_Number] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Sex] [varchar](5) NOT NULL,
 CONSTRAINT [PK_Administrator] PRIMARY KEY CLUSTERED 
(
	[AdministratorID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Appointment]    Script Date: 5/26/2019 12:15:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Appointment](
	[AppointmentID] [int] NOT NULL,
	[PatientID] [int] NOT NULL,
	[First_Name_Of_Patient] [varchar](50) NOT NULL,
	[Last_Name_Of_Patient] [varchar](50) NOT NULL,
	[Location] [varchar](50) NOT NULL,
	[DateTime] [datetime] NOT NULL,
	[DoctorID] [int] NOT NULL,
	[Note] [varchar](150) NOT NULL,
 CONSTRAINT [PK_Appointment] PRIMARY KEY CLUSTERED 
(
	[AppointmentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Doctor]    Script Date: 5/26/2019 12:15:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Doctor](
	[DoctorID] [int] NOT NULL,
	[First_Name] [varchar](50) NOT NULL,
	[Last_Name] [varchar](50) NOT NULL,
	[Specalization] [varchar](50) NOT NULL,
	[Date_Of_Birth] [date] NOT NULL,
	[Phone_Number] [varchar](50) NOT NULL,
	[Address] [varchar](150) NOT NULL,
	[Email] [varbinary](50) NOT NULL,
	[Sex] [varchar](5) NOT NULL,
 CONSTRAINT [PK_Doctor] PRIMARY KEY CLUSTERED 
(
	[DoctorID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Login]    Script Date: 5/26/2019 12:15:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Login](
	[LoginID] [int] NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](550) NOT NULL,
	[Roli] [int] NOT NULL,
 CONSTRAINT [PK_Login] PRIMARY KEY CLUSTERED 
(
	[LoginID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Patient]    Script Date: 5/26/2019 12:15:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Patient](
	[PatientID] [int] NOT NULL,
	[First_Name] [varchar](50) NOT NULL,
	[Last_Name] [varchar](50) NOT NULL,
	[Date_Of_Birth] [date] NOT NULL,
	[Phone_Number] [varchar](50) NOT NULL,
	[Sex] [varchar](5) NOT NULL,
	[Address] [varchar](150) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[DoctorID] [int] NOT NULL,
 CONSTRAINT [PK_Patient] PRIMARY KEY CLUSTERED 
(
	[PatientID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Report]    Script Date: 5/26/2019 12:15:09 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Report](
	[ReportID] [int] NOT NULL,
	[PatientID] [int] NOT NULL,
	[DoctorID] [int] NOT NULL,
	[Date] [date] NOT NULL,
 CONSTRAINT [PK_ReportID] PRIMARY KEY CLUSTERED 
(
	[ReportID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Appointment]  WITH CHECK ADD  CONSTRAINT [FK_Appointment_Doctor] FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctor] ([DoctorID])
GO
ALTER TABLE [dbo].[Appointment] CHECK CONSTRAINT [FK_Appointment_Doctor]
GO
ALTER TABLE [dbo].[Appointment]  WITH CHECK ADD  CONSTRAINT [FK_Appointment_Patient] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patient] ([PatientID])
GO
ALTER TABLE [dbo].[Appointment] CHECK CONSTRAINT [FK_Appointment_Patient]
GO
ALTER TABLE [dbo].[Patient]  WITH CHECK ADD  CONSTRAINT [FK_Patient_Doctor] FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctor] ([DoctorID])
GO
ALTER TABLE [dbo].[Patient] CHECK CONSTRAINT [FK_Patient_Doctor]
GO
ALTER TABLE [dbo].[Report]  WITH CHECK ADD  CONSTRAINT [FK_ReportID_Doctor] FOREIGN KEY([ReportID])
REFERENCES [dbo].[Doctor] ([DoctorID])
GO
ALTER TABLE [dbo].[Report] CHECK CONSTRAINT [FK_ReportID_Doctor]
GO
ALTER TABLE [dbo].[Report]  WITH CHECK ADD  CONSTRAINT [FK_ReportID_Patient] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patient] ([PatientID])
GO
ALTER TABLE [dbo].[Report] CHECK CONSTRAINT [FK_ReportID_Patient]
GO
USE [master]
GO
ALTER DATABASE [HealthCareScheduling] SET  READ_WRITE 
GO
