DROP TABLE people IF EXISTS;

create table people
(
persion_id bigint generated by default as identity,
first_name varchar(20),
last_name VARCHAR(20),
primary key (persion_id)
);