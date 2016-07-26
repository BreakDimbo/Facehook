create table country(
	id int not null primary key auto_increment,
	name varchar(32) not null
)
--省份表
CREATE TABLE province(
id int not null primary key auto_increment,
name varchar(32) not null,
countryId int,
FOREIGN KEY (countryId) REFERENCES country(id)
)

--中国省份表
create table localProvince(
lp_id int(11) primary key,
lp_name varchar(32) not null)

--城市表
create table city(
	id int not null primary key auto_increment,
	name varchar(32) not null,
	proId	int references province(id),
	FOREIGN KEY (proId) REFERENCES province(id)
)

--中国城市表
create table localCity(
 lc_id int primary key auto_increment,
 lc_name varchar(32),
 lc_lpId int
)
--乡村表
create table town(
	id int	not null primary key auto_increment,
	name	varchar(32) not null,
	cityId	int,
	foreign key (cityId) references city(id)
)
--技工学校
create table techSchool(
	id int	not null primary key auto_increment,
	name	varchar(64) not null,
	cityId	int,
	townId	int,
	foreign key (cityId) references city(id),
	foreign key (townId) references town(id)
)
--初中表
create table junior(
	id int not null primary key auto_increment,
	name varchar(64) not null,
	cityId int,
	townId int,
	foreign key (cityId) references city(id),
	foreign key (townId) references town(id)
)
--小学表
create table primarySchool(
	id int not null primary key auto_increment,
	name varchar(64) not null,
	cityId int,
	townId int,
	foreign key (cityId) references city(id),
	foreign key (townId) references town(id)
)
--高中表(公共信息部分)
create table senior(
	id int not null primary key auto_increment,
	name   varchar(64) not null,
	cityId	int,
	townId	int,
	foreign key (cityId) references city(id),
	foreign key (townId) references town(id)
)

--用户表
create table users(
	id int(11) not null primary key auto_increment,
	email varchar(128) unique not null,
	name varchar(128) not null,
	pwd varchar(128) not null,
	photo	varchar(128) default 'default.gif',
	sex	varchar(16),
	homePro	int(11),
	homeCity int(11),
	birth	date,
	tel	varchar(32),
	mobile	varchar(32),
	oicq	varchar(32),
	msn	varchar(128),
	website	varchar(128),
	techSch	int(11),
	techSchYear int(11),
	juniorSch int(11),
	juniorYear int(11),
	primarySch int(11),
	primaryYear int(11),
	interest varchar(256),
	music	varchar(256),
	movie	varchar(256),
	game	varchar(256),
	cartoon	varchar(256),
	sport	varchar(256),
	book	varchar(256),
	assn	varchar(256),
	visited	int default 0,
	doing	varchar(128),
	online	tinyint	default 0,
	registerDate datetime ,
	loginDate datetime,
	level	tinyint default 1,
	locked	tinyint	default 0,
	foreign key (homePro) references province(id),
	foreign key (homeCity) references city(id),
	foreign key (techSch) references techschool(id),
	foreign key (juniorSch) references junior(id),
	foreign key (primarySch) references primarySchool(id)
)

--用户高中表 userSenior ----

create table userSenior(
	id int	not null primary key auto_increment,
	userId	int,
	seniorSchId int,
	seniorYear int,
	grade1	varchar(64),
	grade2	varchar	(64),
	grade3	varchar	(64),
	foreign key (userid) references users(id),
	foreign key (seniorSchId) references senior(id)
)

--大学表(大学的公共信息部分)
create table university(
	id int not null primary key auto_increment,
	name varchar(64) not null,
	countryId int,
	proId int,
	foreign key (countryId) references country(id),
	foreign key (proId) references province(id)
)

--用户大学表 userUniversity
create table userUniversity
(
  id int not null primary key auto_increment,
  userId int,
  universityId int,
  uniYear int,
  userType varchar(32),
  college varchar(128),
  drom varchar(128),
  foreign key(userId) references users(id),
  foreign key(universityId) references university(id)
)


--用户所在网络[即该同学是哪个圈的人.]
create table userNet(
	id		int	not null primary key auto_increment,
	userId	int	,
	name		varchar	(64)	not null,
	isPrimary	tinyint	default 1,
	foreign key (userId) references users(id)
)