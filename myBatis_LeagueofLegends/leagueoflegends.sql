create database championdb;
use championdb;

-- drop table champion;
-- drop table shop;
-- drop table champshop;

create table champion(cid int primary key, cname varchar(255), role varchar(255), difficulty varchar(255));
create table shop(sid int primary key, skinname varchar(255), price int);
create table champshop(id int primary key, sid int references shop(sid), cid int references champion(cid));

-- champion(cid, dname, role, difficulty)
insert into champion values(100, 'Akali', 'assasin', 'moderate');
insert into champion values(101, 'Ashe', 'marksam', 'moderate');
insert into champion values(102, 'Irelia', 'fighter', 'moderate');
insert into champion values(103, 'Kaisa', 'marksam', 'moderate');
insert into champion values(104, 'Karma', 'mage', 'moderate');
insert into champion values(105, 'Kennen', 'mage', 'moderate');
insert into champion values(106, 'Pyke', 'support', 'moderate');
insert into champion values(107, 'MissFortune', 'marksam', 'low');
insert into champion values(108, 'Rumble', 'fighter', 'high');
insert into champion values(109, 'Ryze', 'mage', 'moderate');
insert into champion values(110, 'Sett', 'fighter', 'low');
insert into champion values(111, 'Swain', 'mage', 'high');
insert into champion values(112, 'Urgot', 'fighter', 'high');
insert into champion values(113, 'Viktor', 'mage', 'high');
insert into champion values(114, 'Yone', 'assasin', 'high');
insert into champion values(115, 'Zyra', 'mage', 'moderate');

-- shop(sid, skinname, price)
insert into shop values(100, 'Basic', 0);
insert into shop values(101, 'K/DA', 750);
insert into shop values(102, 'BloodMoon', 1150);
insert into shop values(103, 'Project', 750);
insert into shop values(104, 'Championship',  1150);
insert into shop values(105, 'IG', 550);
insert into shop values(106, 'DevineSword', 750);
insert into shop values(107, 'HighNoon', 1150);
insert into shop values(108, 'DarkStar', 750);
insert into shop values(109, 'Runied', 1150);
insert into shop values(110, 'Infernal', 750);
insert into shop values(111, 'PoolParty', 650);
insert into shop values(112, 'GunGoddess', 1550);
insert into shop values(113, 'BadlandsBaron', 1150);
insert into shop values(114, 'Hextech', 1850);
insert into shop values(115, 'Psyops', 1150);
insert into shop values(116, 'SpiritBlosson', 750);


-- id, sid, cid
insert into champshop values(1, 100, 100); -- Basic Akali
insert into champshop values(2, 100, 101); -- Basic Ashe
insert into champshop values(3, 100, 102); -- Basic Irelia 
insert into champshop values(4, 100, 103); -- Basic Kaisa
insert into champshop values(5, 100, 104); -- Basic Karma
insert into champshop values(6, 100, 105); -- Basic Kennen 
insert into champshop values(7, 100, 106); -- Basic Pyke
insert into champshop values(8, 100, 107); -- Basic MissFortune
insert into champshop values(9, 100, 108); -- Basic Rumble
insert into champshop values(10, 100, 109); -- Basic Ryze
insert into champshop values(11, 100, 110); -- Basic Sett
insert into champshop values(12, 100, 111); -- Basic Swain
insert into champshop values(13, 100, 112); -- Basic Urgot
insert into champshop values(14, 100, 113); -- Basic Viktor
insert into champshop values(15, 100, 114); -- Basic Yone
insert into champshop values(16, 100, 115); -- Basic Zyra
insert into champshop values(17, 101, 100); -- K/DA Akali
insert into champshop values(18, 102, 100); -- BloodMoon Akali
insert into champshop values(19, 103, 101); -- Project Ashe
insert into champshop values(20, 104, 101); -- Championship Ashe
insert into champshop values(21, 105, 102); -- IG Irelia 
insert into champshop values(22, 106, 102); -- DevineSword Irelia
insert into champshop values(23, 101, 103); -- K/DA Kaisa
insert into champshop values(24, 105, 103); -- IG Kaisa
insert into champshop values(25, 108, 104); -- DarkStar Karma
insert into champshop values(26, 109, 104); -- Runied Karma
insert into champshop values(27, 110, 105); -- Infernal Kennen
insert into champshop values(28, 102, 105); -- BloodMoon Kennen 
insert into champshop values(29, 103, 106); -- Project Pyke
insert into champshop values(30, 102, 106); -- BloodMoon Pyke
insert into champshop values(31, 111, 107); -- PoolParty MissFortune
insert into champshop values(32, 112, 107); -- GunGoddess MissFortune
insert into champshop values(33, 111, 108); -- PoolParty Rumble
insert into champshop values(34, 113, 108); -- BadlandsBaron Rumble
insert into champshop values(35, 108, 109); -- DarkStar Ryze 
insert into champshop values(36, 104, 109); -- Championship Ryze
insert into champshop values(37, 101, 110); -- K/DA Sett
insert into champshop values(38, 114, 111); -- Hextech Swain
insert into champshop values(39, 111, 112); -- PoolParty Urgot
insert into champshop values(40, 107, 112); -- HighNoon Urgot
insert into champshop values(41, 103, 113); -- Project Viktor
insert into champshop values(42, 115, 113); -- Psyops Viktor
insert into champshop values(43, 116, 114); -- SpiritBlosson Yone
insert into champshop values(44, 105, 115); -- IG Zyra
insert into champshop values(45, 110, 115); -- Infernal Zyra

select skinname from shop where sid IN (select sid from campshop where cid = 102);

select * from champion;
select * from shop; 
select * from champshop;