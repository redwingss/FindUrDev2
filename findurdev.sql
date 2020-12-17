-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 17 déc. 2020 à 11:34
-- Version du serveur :  5.7.26
-- Version de PHP :  7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `findurdev`
--

-- --------------------------------------------------------

--
-- Structure de la table `app_mission`
--

DROP TABLE IF EXISTS `app_mission`;
CREATE TABLE IF NOT EXISTS `app_mission` (
  `mission_id` int(11) NOT NULL AUTO_INCREMENT,
  `mission_category` varchar(255) DEFAULT NULL,
  `mission_goal` varchar(255) DEFAULT NULL,
  `mission_name` varchar(255) DEFAULT NULL,
  `mission_phone` varchar(255) DEFAULT NULL,
  `mission_price` int(11) DEFAULT NULL,
  PRIMARY KEY (`mission_id`)
) ENGINE=MyISAM AUTO_INCREMENT=67 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `app_mission`
--

INSERT INTO `app_mission` (`mission_id`, `mission_category`, `mission_goal`, `mission_name`, `mission_phone`, `mission_price`) VALUES
(66, 'hbtgvrfcd', 'nhbtgvrfc', 'PJP', '894562', 89465123),
(1, 'php', 'le but du projet', 'PHP help', ' 06 10 34 35 15', 135);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
