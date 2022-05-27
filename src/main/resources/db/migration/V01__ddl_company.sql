CREATE SCHEMA business;

CREATE TABLE business.t_company (
	id serial4 NOT NULL,
	cnpj varchar(192) NOT NULL,
	name varchar(512) NOT NULL,
	creation_date timestamp NULL,
	update_date timestamp NULL,
	"version" int4 NOT NULL DEFAULT 0,
	CONSTRAINT pk_t_business PRIMARY KEY (id)
);
