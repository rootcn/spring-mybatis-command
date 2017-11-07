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

CREATE TABLE music (
keyId  int NOT NULL ,
name  varchar(100) NULL ,
author  varchar(100) NULL ,
pub_date  date NULL ,
PRIMARY KEY (keyId)
)
;


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