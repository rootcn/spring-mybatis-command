CREATE DATABASE test
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
    
    
CREATE TABLE person (
keyId  int NOT NULL ,
name  varchar(100) NULL ,
PRIMARY KEY (keyId)
)
;

CREATE TABLE world (
keyId  int NOT NULL ,
name  varchar(100) NULL ,
birthday  date NULL ,
width  integer NULL ,
can_arrive  integer NULL ,
PRIMARY KEY (keyId)
)
;
COMMENT ON TABLE world  IS '世界';
COMMENT ON COLUMN world.keyid IS '关键字';
COMMENT ON COLUMN world.name IS '姓名';
COMMENT ON COLUMN world.birthday IS '生日';
COMMENT ON COLUMN world.width IS '宽度';
COMMENT ON COLUMN world.can_arrive IS '是否可达';

CREATE TABLE music (
keyId  int NOT NULL ,
name  varchar(100) NULL ,
author  varchar(100) NULL ,
pub_date  date NULL ,
PRIMARY KEY (keyId)
)
;
COMMENT ON TABLE music  IS '音乐';
COMMENT ON COLUMN music.keyid IS '主键';
COMMENT ON COLUMN music.name IS '名称';
COMMENT ON COLUMN music.author IS '作者';
COMMENT ON COLUMN music.pub_date IS '发行时间';


CREATE TABLE pen (
keyId  int NOT NULL ,
name  varchar(100) NULL ,
factory  varchar(100) NULL ,
manu_date  date NULL ,
PRIMARY KEY (keyId)
)
;

-----------------------

CREATE DATABASE test2
WITH 
OWNER = postgres
ENCODING = 'UTF8'
CONNECTION LIMIT = -1;

CREATE TABLE person2 (
keyId  int NOT NULL ,
name  varchar(100) NULL ,
PRIMARY KEY (keyId)
)
;