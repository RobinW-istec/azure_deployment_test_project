create sequence dev_id_sequence start 1 increment 1;

insert into data (id, name, devMode, someNumber)
values (nextval('dev_id_sequence'), 'Peter', true, 283);

insert into data (id, name, devMode, someNumber)
values (nextval('dev_id_sequence'), 'Walter', true, 463);

insert into data (id, name, devMode, someNumber)
values (nextval('dev_id_sequence'), 'Jesus', true, 457);

insert into data (id, name, devMode, someNumber)
values (nextval('dev_id_sequence'), 'Karen', true, 237);

insert into data (id, name, devMode, someNumber)
values (nextval('dev_id_sequence'), 'Megan', true, 836);