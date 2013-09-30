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