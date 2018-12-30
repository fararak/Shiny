create user shiny identified by shiny;
grant dba to shiny;
connect shiny;

create sequence idCompte start with 1;
create table compte(
	id int ,
	nom varchar(200)
);
insert into compte values(idCompte.nextval,'wawa');