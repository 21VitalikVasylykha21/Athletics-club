-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Май 14 2021 г., 10:34
-- Версия сервера: 10.4.17-MariaDB
-- Версия PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `athlethic_base_club_data`
--

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `id_admin` int(11) NOT NULL,
  `name_admin` varchar(100) NOT NULL,
  `password_admin` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_admin`
--

INSERT INTO `tbl_admin` (`id_admin`, `name_admin`, `password_admin`) VALUES
(4, 'Віталік', '6f4b6612125fb3a0daecd2799dfd6c9c299424fd920f9b308110a2c1fbd8f443');

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_athlete`
--

CREATE TABLE `tbl_athlete` (
  `id_athlete` int(11) NOT NULL,
  `name_athlete` varchar(100) NOT NULL,
  `birth_athlete` date NOT NULL,
  `id_category_tbl_athlete` int(11) NOT NULL,
  `id_coach_tbl_athlete` int(11) NOT NULL,
  `residence_athlete` varchar(200) NOT NULL,
  `telephone_athlete` int(12) NOT NULL,
  `photo_athlete` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_athlete`
--

INSERT INTO `tbl_athlete` (`id_athlete`, `name_athlete`, `birth_athlete`, `id_category_tbl_athlete`, `id_coach_tbl_athlete`, `residence_athlete`, `telephone_athlete`, `photo_athlete`) VALUES
(1, 'Василиха Віталій Васильович', '2003-09-21', 1, 1, 'місто Перечин', 509606344, 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-k7x587.jpg'),
(5, ' Костянтин Рурак Михайлович', '1990-07-09', 8, 1, 'Запоріжжя', 977865616, 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-lnkw6n.jpg'),
(6, 'Сергій Володимирович Смелик', '1987-04-19', 6, 3, 'місто Луганськ', 529401324, 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-lnkw6n.jpg'),
(7, 'Мухін Ферасій Андірович', '2021-05-23', 1, 4, 'Львів', 559163285, 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-lnkw6n.jpg');

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_category`
--

CREATE TABLE `tbl_category` (
  `id_categorys` int(10) NOT NULL,
  `name_categorys` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_category`
--

INSERT INTO `tbl_category` (`id_categorys`, `name_categorys`) VALUES
(1, 'I юнацький'),
(2, 'II юнацький'),
(3, 'III юнацький'),
(4, 'I розряд'),
(5, 'II розряд'),
(6, 'III розряд'),
(7, 'Кандинат майстеру спорту (КМС)'),
(8, 'Майстер спорту (МС)'),
(9, 'Майстер спорту міжнародного класу (МСМК)');

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_club`
--

CREATE TABLE `tbl_club` (
  `id_club` int(11) NOT NULL,
  `competition` varchar(1000) NOT NULL,
  `day_competition` date NOT NULL,
  `venue_competition` varchar(1000) NOT NULL,
  `distance_tbl_club` varchar(1000) NOT NULL,
  `participants` varchar(1000) NOT NULL,
  `judges` varchar(1000) NOT NULL,
  `number_club` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_club`
--

INSERT INTO `tbl_club` (`id_club`, `competition`, `day_competition`, `venue_competition`, `distance_tbl_club`, `participants`, `judges`, `number_club`) VALUES
(2, 'Кубок \"Дружба\", 100 метрів', '2021-05-08', 'Мукачево', '2100;200;', 'Михайло Гаджега\r\nІванов Печкін\r\nКлименко Петро', 'Олексдр Петрович Дубощит', 1),
(3, 'Кубок \"Дружби\", 200 метрів', '2021-05-07', 'Ужгород', '3', 'Келемен Дмитро Петрович\r\nПаш Андрій Федорович', 'Голодняк Олексій', 3),
(4, 'Халф марафон', '2021-05-10', 'Хуст', '11', 'Келемен Дмитро Петрович,\r Паш Андрій Федорович ', 'Один єдиний', 4),
(10, 'Кубок Дружби', '2020-05-08', 'Львів', '100;200;', 'Василиха Віталій Васильович;Сергій Володимирович Смелик;', 'Сатмарі Альберт Бейлович', 58),
(11, 'Найшвидша нога на \"Дикому западі\"', '2020-05-25', 'місто Ужгород', '100\n60\n', 'Сергій Володимирович Смелик\nВасилиха Віталій Васильович\n', 'Марушка Петро Петрович', 32),
(12, 'NotNutNovember', '2020-10-01', 'село Середнє', '60;', 'Василиха Віталій Васильович;Мухін Ферасій Андірович;', 'Верещагін Олександрови Олександрович', 232);

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_coach`
--

CREATE TABLE `tbl_coach` (
  `id_coach` int(11) NOT NULL,
  `name_coach` varchar(100) NOT NULL,
  `birth_coach` date NOT NULL,
  `id_rank_tbl_coach` int(10) NOT NULL,
  `work_experience_coach` int(100) NOT NULL,
  `residence_coach` varchar(200) NOT NULL,
  `telephone_coach` int(15) NOT NULL,
  `photo_coach` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_coach`
--

INSERT INTO `tbl_coach` (`id_coach`, `name_coach`, `birth_coach`, `id_rank_tbl_coach`, `work_experience_coach`, `residence_coach`, `telephone_coach`, `photo_coach`) VALUES
(1, 'Юрій Гафарович Новак ', '1947-01-25', 1, 28, 'село Макіївка', 839467571, 'фото'),
(3, 'Костянтин Вікторович Васюков', '1981-05-10', 3, 8, 'місто Донецьк', 509606344, 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-73w26e.png'),
(4, 'Єфросіній Микола Мстиславович', '2000-12-19', 5, 3, 'село Гукливе', 633166427, 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-2em38y.jpg');

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_distances`
--

CREATE TABLE `tbl_distances` (
  `id_distances` int(11) NOT NULL,
  `distances` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_distances`
--

INSERT INTO `tbl_distances` (`id_distances`, `distances`) VALUES
(1, 60),
(2, 100),
(3, 200),
(4, 400),
(5, 800),
(6, 1000),
(7, 1500),
(8, 3000),
(9, 5000),
(10, 10000),
(11, 42195);

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_rank`
--

CREATE TABLE `tbl_rank` (
  `id_ranks` int(11) NOT NULL,
  `name_ranks` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_rank`
--

INSERT INTO `tbl_rank` (`id_ranks`, `name_ranks`) VALUES
(4, 'Гросмейстер України (ГУ)'),
(2, 'Заслужений майстер спорту України (ЗМСУ)'),
(1, 'Заслужений тренер України (ЗТУ)'),
(5, 'Майстер спорту України (МСУ)'),
(3, 'Майстер спорту України міжнародного класу (МСУМК)');

-- --------------------------------------------------------

--
-- Структура таблицы `tbl_rezults`
--

CREATE TABLE `tbl_rezults` (
  `id_rezults` int(11) NOT NULL,
  `id_club_rezults` int(11) NOT NULL,
  `id_athlete_rezults` int(11) NOT NULL,
  `id_coach_rezults` int(11) NOT NULL,
  `id_ditance_rezults` int(11) NOT NULL,
  `position_rezults` varchar(1000) NOT NULL,
  `time_rezults` time NOT NULL,
  `photo_athlete` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `tbl_rezults`
--

INSERT INTO `tbl_rezults` (`id_rezults`, `id_club_rezults`, `id_athlete_rezults`, `id_coach_rezults`, `id_ditance_rezults`, `position_rezults`, `time_rezults`, `photo_athlete`) VALUES
(1, 0, 1, 1, 2, '1 місце', '00:00:13', ''),
(2, 3, 5, 1, 8, '2-місце', '00:26:03', ''),
(3, 58, 6, 3, 3, '2-місце', '00:26:10', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-lnkw6n.jpg'),
(4, 58, 1, 1, 2, '1-місце', '00:11:05', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-k7x587.jpg'),
(5, 58, 1, 1, 3, '3-місце', '00:27:05', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-k7x587.jpg'),
(6, 32, 1, 1, 1, '1 місце', '00:06:25', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-k7x587.jpg'),
(7, 32, 6, 3, 2, '2-місце', '00:14:50', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-lnkw6n.jpg'),
(8, 23, 6, 3, 11, '1-місце', '05:11:13', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-lnkw6n.jpg'),
(9, 232, 1, 1, 1, 'Джедай', '00:06:02', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-k7x587.jpg'),
(10, 232, 7, 4, 1, 'Ситх', '00:11:07', 'C:\\Users\\Vitalik\\Pictures\\Wallhaven\\wallhaven-lnkw6n.jpg');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Индексы таблицы `tbl_athlete`
--
ALTER TABLE `tbl_athlete`
  ADD PRIMARY KEY (`id_athlete`),
  ADD KEY `id_category_tbl_sportsman` (`id_category_tbl_athlete`,`id_coach_tbl_athlete`),
  ADD KEY `id_coach_tbl_athlete` (`id_coach_tbl_athlete`);

--
-- Индексы таблицы `tbl_category`
--
ALTER TABLE `tbl_category`
  ADD PRIMARY KEY (`id_categorys`);

--
-- Индексы таблицы `tbl_club`
--
ALTER TABLE `tbl_club`
  ADD PRIMARY KEY (`id_club`),
  ADD KEY `id_distance_tbl_club` (`distance_tbl_club`),
  ADD KEY `number_club` (`number_club`),
  ADD KEY `distance_tbl_club` (`distance_tbl_club`);

--
-- Индексы таблицы `tbl_coach`
--
ALTER TABLE `tbl_coach`
  ADD PRIMARY KEY (`id_coach`),
  ADD KEY `id_category_tbl_coach` (`id_rank_tbl_coach`);

--
-- Индексы таблицы `tbl_distances`
--
ALTER TABLE `tbl_distances`
  ADD PRIMARY KEY (`id_distances`);

--
-- Индексы таблицы `tbl_rank`
--
ALTER TABLE `tbl_rank`
  ADD PRIMARY KEY (`id_ranks`),
  ADD KEY `name_ranks` (`name_ranks`);

--
-- Индексы таблицы `tbl_rezults`
--
ALTER TABLE `tbl_rezults`
  ADD PRIMARY KEY (`id_rezults`),
  ADD KEY `id_club_rezults` (`id_club_rezults`,`id_athlete_rezults`,`id_coach_rezults`),
  ADD KEY `id_ditance_rezults` (`id_ditance_rezults`),
  ADD KEY `id_athlete_rezults` (`id_athlete_rezults`),
  ADD KEY `id_coach_rezults` (`id_coach_rezults`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `tbl_admin`
--
ALTER TABLE `tbl_admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT для таблицы `tbl_athlete`
--
ALTER TABLE `tbl_athlete`
  MODIFY `id_athlete` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT для таблицы `tbl_category`
--
ALTER TABLE `tbl_category`
  MODIFY `id_categorys` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT для таблицы `tbl_club`
--
ALTER TABLE `tbl_club`
  MODIFY `id_club` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT для таблицы `tbl_coach`
--
ALTER TABLE `tbl_coach`
  MODIFY `id_coach` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT для таблицы `tbl_distances`
--
ALTER TABLE `tbl_distances`
  MODIFY `id_distances` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT для таблицы `tbl_rank`
--
ALTER TABLE `tbl_rank`
  MODIFY `id_ranks` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT для таблицы `tbl_rezults`
--
ALTER TABLE `tbl_rezults`
  MODIFY `id_rezults` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `tbl_athlete`
--
ALTER TABLE `tbl_athlete`
  ADD CONSTRAINT `tbl_athlete_ibfk_1` FOREIGN KEY (`id_category_tbl_athlete`) REFERENCES `tbl_category` (`id_categorys`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_athlete_ibfk_2` FOREIGN KEY (`id_coach_tbl_athlete`) REFERENCES `tbl_coach` (`id_coach`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ограничения внешнего ключа таблицы `tbl_coach`
--
ALTER TABLE `tbl_coach`
  ADD CONSTRAINT `tbl_coach_ibfk_1` FOREIGN KEY (`id_rank_tbl_coach`) REFERENCES `tbl_rank` (`id_ranks`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ограничения внешнего ключа таблицы `tbl_rezults`
--
ALTER TABLE `tbl_rezults`
  ADD CONSTRAINT `tbl_rezults_ibfk_1` FOREIGN KEY (`id_athlete_rezults`) REFERENCES `tbl_athlete` (`id_athlete`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_rezults_ibfk_3` FOREIGN KEY (`id_coach_rezults`) REFERENCES `tbl_coach` (`id_coach`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tbl_rezults_ibfk_4` FOREIGN KEY (`id_ditance_rezults`) REFERENCES `tbl_distances` (`id_distances`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
