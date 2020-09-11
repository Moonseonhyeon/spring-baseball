create user 'spring'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON _._ TO 'spring'@'%';
create database spring;
use spring;

CREATE TABLE stadium(
id int auto_increment primary key,
name varchar(300),
address varchar(2000),
createDate timestamp
) engine=InnoDB default charset=utf8;

CREATE TABLE team(
id int auto_increment primary key,
name varchar(300),
stadiumId int,
createDate timestamp
) engine=InnoDB default charset=utf8;
