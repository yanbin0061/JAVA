create database day25;
use day25;

create table user(
	username varchar(100) primary key,
	password varchar(100),
	birthday date,
	hobby varchar(255),
	married bit(1)
);