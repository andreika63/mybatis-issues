drop table company if exists;

create table company
(
    id bigint,
    name varchar(255),
    director_id bigint
);

drop table person if exists;

create table person
(
    id bigint,
    name varchar(255),
    group_id bigint
);

drop table person_group if exists;

create table person_group
(
    id bigint,
    name varchar(255)
);

