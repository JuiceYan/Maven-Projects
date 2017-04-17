

drop table if EXISTS app_user;
drop table if EXISTS app_student;
CREATE TABLE app_student
(
   id varchar(32) PRIMARY KEY NOT NULL,
   createDate timestamp,
   modifyDate timestamp,
   age int NOT NULL,
   studentName varchar(255)
)
;
CREATE TABLE app_user
(
   id varchar(32) PRIMARY KEY NOT NULL,
   createDate timestamp,
   modifyDate timestamp,
   userName varchar(255),
   age int NOT NULL
)
;