CREATE DATABASE quarkus-social

CREATE TABLE USERS (
	id bigserial not null primary key,
	name varchar(100) not null,
	idade integer not null
)