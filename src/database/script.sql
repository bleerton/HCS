USE [master]
GO
/****** Object:  Database [HealthCareScheduling]    Script Date: 6/14/2019 2:39:39 PM ******/
CREATE DATABASE [HealthCareScheduling]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'HealthCareScheduling', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\HealthCareScheduling.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'HealthCareScheduling_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\HealthCareScheduling_log.ldf' , SIZE = 1856KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [HealthCareScheduling] SET COMPATIBILITY_LEVEL = 110
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
ALTER DATABASE [HealthCareScheduling] SET AUTO_CREATE_STATISTICS ON 
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
USE [HealthCareScheduling]
GO
/****** Object:  Table [dbo].[Administrator]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Administrator](
	[AdministratorID] [int] IDENTITY(1,1) NOT NULL,
	[First_Name] [varchar](50) NOT NULL,
	[Last_Name] [varchar](50) NOT NULL,
	[Date_Of_birth] [date] NOT NULL,
	[Phone_Number] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Sex] [varchar](5) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[Login_ID] [int] NOT NULL,
 CONSTRAINT [PK_Administrator] PRIMARY KEY CLUSTERED 
(
	[AdministratorID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Appointment]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Appointment](
	[AppointmentID] [int] IDENTITY(1,1) NOT NULL,
	[PatientID] [int] NOT NULL,
	[First_Name_Of_Patient] [varchar](50) NOT NULL,
	[Last_Name_Of_Patient] [varchar](50) NOT NULL,
	[Location] [varchar](50) NOT NULL,
	[DateTime] [datetime] NULL,
	[DoctorID] [int] NOT NULL,
	[Note] [varchar](150) NOT NULL,
	[Status] [varchar](50) NULL,
 CONSTRAINT [PK_Appointment] PRIMARY KEY CLUSTERED 
(
	[AppointmentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Connection]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Connection](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[DoctorID] [int] NOT NULL,
	[PatientID] [int] NOT NULL,
 CONSTRAINT [PK_Connection] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Doctor]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Doctor](
	[DoctorID] [int] IDENTITY(1,1) NOT NULL,
	[First_Name] [varchar](50) NOT NULL,
	[Last_Name] [varchar](50) NOT NULL,
	[Specalization] [varchar](50) NOT NULL,
	[Date_Of_Birth] [date] NOT NULL,
	[Phone_Number] [varchar](50) NOT NULL,
	[Address] [varchar](150) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Sex] [varchar](50) NOT NULL,
	[Username] [varchar](50) NULL,
	[Password] [varchar](50) NULL,
	[Login_ID] [int] NULL,
 CONSTRAINT [PK_Doctor] PRIMARY KEY CLUSTERED 
(
	[DoctorID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Login]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Login](
	[LoginID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](550) NOT NULL,
	[Roli] [int] NOT NULL,
 CONSTRAINT [PK_Login] PRIMARY KEY CLUSTERED 
(
	[LoginID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Patient]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Patient](
	[PatientID] [int] IDENTITY(1,1) NOT NULL,
	[First_Name] [varchar](50) NOT NULL,
	[Last_Name] [varchar](50) NOT NULL,
	[Date_Of_Birth] [date] NULL,
	[Phone_Number] [varchar](50) NOT NULL,
	[Sex] [varchar](50) NOT NULL,
	[Address] [varchar](150) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[LoginId] [int] NULL,
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[ParentName] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Patient] PRIMARY KEY CLUSTERED 
(
	[PatientID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Report]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Report](
	[ReportID] [int] IDENTITY(1,1) NOT NULL,
	[PatientID] [int] NOT NULL,
	[DoctorID] [int] NOT NULL,
	[Date] [date] NOT NULL,
	[Code] [int] NOT NULL,
	[City] [varchar](50) NOT NULL,
	[Institution] [varchar](50) NOT NULL,
	[Diagnose] [varchar](2000) NOT NULL,
 CONSTRAINT [PK_ReportID] PRIMARY KEY CLUSTERED 
(
	[ReportID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Request]    Script Date: 6/14/2019 2:39:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Request](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[DoctorID] [int] NOT NULL,
	[PatientID] [int] NOT NULL,
	[Status] [varchar](50) NULL,
	[Date] [datetime] NULL,
 CONSTRAINT [PK_Request] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Administrator]  WITH CHECK ADD  CONSTRAINT [FK_Administrator_Login] FOREIGN KEY([Login_ID])
REFERENCES [dbo].[Login] ([LoginID])
GO
ALTER TABLE [dbo].[Administrator] CHECK CONSTRAINT [FK_Administrator_Login]
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
ALTER TABLE [dbo].[Connection]  WITH CHECK ADD  CONSTRAINT [FK_Connection_Doctor] FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctor] ([DoctorID])
GO
ALTER TABLE [dbo].[Connection] CHECK CONSTRAINT [FK_Connection_Doctor]
GO
ALTER TABLE [dbo].[Connection]  WITH CHECK ADD  CONSTRAINT [FK_Connection_Patient] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patient] ([PatientID])
GO
ALTER TABLE [dbo].[Connection] CHECK CONSTRAINT [FK_Connection_Patient]
GO
ALTER TABLE [dbo].[Doctor]  WITH CHECK ADD  CONSTRAINT [FK_Doctor_Login] FOREIGN KEY([Login_ID])
REFERENCES [dbo].[Login] ([LoginID])
GO
ALTER TABLE [dbo].[Doctor] CHECK CONSTRAINT [FK_Doctor_Login]
GO
ALTER TABLE [dbo].[Patient]  WITH CHECK ADD  CONSTRAINT [FK_Patient_Login] FOREIGN KEY([LoginId])
REFERENCES [dbo].[Login] ([LoginID])
GO
ALTER TABLE [dbo].[Patient] CHECK CONSTRAINT [FK_Patient_Login]
GO
ALTER TABLE [dbo].[Report]  WITH CHECK ADD  CONSTRAINT [FK_Report_Doctor] FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctor] ([DoctorID])
GO
ALTER TABLE [dbo].[Report] CHECK CONSTRAINT [FK_Report_Doctor]
GO
ALTER TABLE [dbo].[Report]  WITH CHECK ADD  CONSTRAINT [FK_ReportID_Patient] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patient] ([PatientID])
GO
ALTER TABLE [dbo].[Report] CHECK CONSTRAINT [FK_ReportID_Patient]
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Doctor] FOREIGN KEY([DoctorID])
REFERENCES [dbo].[Doctor] ([DoctorID])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Doctor]
GO
ALTER TABLE [dbo].[Request]  WITH CHECK ADD  CONSTRAINT [FK_Request_Patient] FOREIGN KEY([PatientID])
REFERENCES [dbo].[Patient] ([PatientID])
GO
ALTER TABLE [dbo].[Request] CHECK CONSTRAINT [FK_Request_Patient]
GO
USE [master]
GO
ALTER DATABASE [HealthCareScheduling] SET  READ_WRITE 
GO
