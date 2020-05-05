CREATE TABLE `ROLLOUT_STATUS` (
  `id` int(11) PRIMARY KEY,
  `application` varchar(255) NOT NULL,
  `group_id` varchar(255) NOT NULL,
  `artifact_id` varchar(255) NOT NULL,
  `packaging` varchar(255) NOT NULL,
  `version` varchar(255) NOT NULL,
  `classifier` varchar(255) NOT NULL,
  `stage` varchar(255) NOT NULL,
  `server` varchar(255) NOT NULL,
  `ddate` date NOT NULL,
  `ttime` timestamp NOT NULL,
  `user_id` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
);
