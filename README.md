## 의존성

```
Spring Boot DevTools
Lombok
Mybatis Framework
MySQL Driver
Mustache
Spring Web
```

## MYSQL 셋팅

```
create user 'spring'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON _._ TO 'spring'@'%';
create database spring;
use spring;
```

## 테이블

```
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

CREATE TABLE player (
id int auto_increment primary key,
name varchar(300),
teamId int,
position varchar(500),
createDate timestamp )
engine=InnoDB default charset=utf8;

CREATE TABLE ExpelledPlayer (
id int auto_increment primary key,
playerId int,
reason varchar(1000),
day timestamp )
engine=InnoDB default charset=utf8;
```

## pivot

```
    SELECT POSITION,
	MAX(if(teamId=4,name,""))"kia",
	MAX(if(teamId=5,name,""))"lotte",
	MAX(if(teamId=6,name,""))"nc"
	FROM player
	GROUP BY position;
```

## rank

```
<![CDATA[
	select p.id, p.name as playerName, p.position, p.createDate, t.name as teamName
	, ( SELECT COUNT(*) + 1 FROM player WHERE name < p.name ) as No
	from player p INNER JOIN team t
	ON p.teamId = t.id
	order by No;
	]]>
```
