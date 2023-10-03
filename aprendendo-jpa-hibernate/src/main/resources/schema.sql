-- noinspection SqlNoDataSourceInspectionForFile

create table livro
(
    id bigint not null,
    nome varchar(255) not null,
    autor varchar(255) not null,
    primary key(id)

);