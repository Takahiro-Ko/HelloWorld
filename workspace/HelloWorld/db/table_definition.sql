DROP TABLE IF EXISTS `user`
;

CREATE TABLE IF NOT EXISTS `login_user` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
;
