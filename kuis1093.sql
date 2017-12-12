-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.48
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1093`
--
CREATE DATABASE IF NOT EXISTS `kuis1093` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `kuis1093`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1093`
--

CREATE TABLE `cv_1093` (
  `nim` bigint(20) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `prodi` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1093`
--

INSERT INTO `cv_1093` (`nim`, `nama`, `prodi`) VALUES
(1555301041, 'Linda', 'Sejarah'),
(1555301063, 'Rachmawati', 'Memasak'),
(1555301092, 'Winnie Alison', 'Eyebrow Art');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1093`
--

CREATE TABLE `nilai_1093` (
  `kode_nilai` bigint(20) NOT NULL,
  `kategori` varchar(255) NOT NULL,
  `nilai` varchar(255) NOT NULL,
  `nim` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1093`
--

INSERT INTO `nilai_1093` (`kode_nilai`, `kategori`, `nilai`, `nim`) VALUES
(1, 'Sangat Bagus', '100', 1555301092),
(2, 'Lumayan Bagus', '89', 1555301063),
(3, 'Bagus', '81', 1555301041);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1093`
--
ALTER TABLE `cv_1093`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `nilai_1093`
--
ALTER TABLE `nilai_1093`
  ADD PRIMARY KEY (`kode_nilai`),
  ADD KEY `FK70mm6aspor3d2ubvfxd0ei27v` (`nim`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1093`
--
ALTER TABLE `cv_1093`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1555301093;
--
-- AUTO_INCREMENT for table `nilai_1093`
--
ALTER TABLE `nilai_1093`
  MODIFY `kode_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1093`
--
ALTER TABLE `nilai_1093`
  ADD CONSTRAINT `FK70mm6aspor3d2ubvfxd0ei27v` FOREIGN KEY (`nim`) REFERENCES `cv_1093` (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
