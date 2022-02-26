## 孤勇者论坛

github上，主要写的一个项目
##资料
[Spring文档]https://spring.io/guides
[Spring Web]https://spring.io/guides/gs/serving-web-content

https://docs.github.com/cn/developers/apps/building-oauth-apps/scopes-for-oauth-apps

## 工具
[Git]https://git-scm.com/download
[Visual Paradigm]http://www.visual-paradigm.com
[Flyway]https://flywaydb.org/getstarted/firststeps/maven
[Lombok]https://www.projectlombok.org
##脚本
CREATE TABLE `user`( 
	`id` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`account_id` VARCHAR(100),
	`name` VARCHAR(50),
	`token` CHAR(36),
	`gmt_create` BIGINT,
	`gmt_modified` BIGINT
    )
    
mvn flyway:migrate

