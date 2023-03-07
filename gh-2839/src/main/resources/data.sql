insert into person_group (id, name) values(11, 'Group-11');

insert into person (id, name, group_id) values(4, 'Person-with-group-11', 11);

insert into company (id, name) values(2, 'Company-2-no-director');
insert into company (id, name, director_id) values(3, 'Company-3-with-director-4', 4);

