CREATE TABLE `CONTAINER_IMAGE` (
  `id` int(11) PRIMARY KEY,
  `organisation` varchar(255) NOT NULL,
  `repository` varchar(255) NOT NULL,
  `registry_url` varchar(255) NOT NULL,
  `tag` varchar(255) NOT NULL,
  `digest` varchar(255) NOT NULL
);