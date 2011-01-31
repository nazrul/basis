CREATE TABLE IF NOT EXISTS `nbr_record` (
`id` int( 11 ) NOT NULL AUTO_INCREMENT ,
`version` int( 11 ) NOT NULL ,
`national_id` varchar( 20 ) COLLATE utf8_unicode_ci NOT NULL ,
PRIMARY KEY ( `id` ) ,
UNIQUE KEY `national_id` ( `national_id` )
) ENGINE = MYISAM DEFAULT CHARSET = utf8 COLLATE = utf8_unicode_ci AUTO_INCREMENT =1