CREATE TABLE `Counters`
(
    `id`        int(11)     NOT NULL AUTO_INCREMENT,
    `openid`    varchar(64) NOT NULL DEFAULT '_',
    `count`     int(11)     NOT NULL DEFAULT '1',
    `createdAt` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8