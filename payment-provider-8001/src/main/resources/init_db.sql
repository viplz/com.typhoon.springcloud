CREATE TABLE `payment` (
    `id` bigint ( 20 ) NOT NULL auto_increment COMMENT 'ID',
    `serial` VARCHAR ( 200 ) DEFAULT '',
     PRIMARY KEY ( `id` )
)
ENGINE = INNODB
auto_increment = 1 
DEFAULT charset = utf8;