create table person
(id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

insert into person values(10001,'Rani','Bangalore',sysdate());
insert into person values(10002,'Raj','Bangalore',sysdate());
insert into person values(10003,'Rohit','Bangalore',sysdate());
insert into person values(10004,'Rita','Mangalore',sysdate());
insert into person values(10005,'Rinku','PAtna',sysdate());
insert into person values(10006,'Reena','Austria',sysdate());