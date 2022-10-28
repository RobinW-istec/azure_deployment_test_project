create sequence id_sequence start 1 increment 1;

insert into data (id, name, devMode, someNumber)
values (nextval('id_sequence'), 'Aron', false, 123);

insert into data (id, name, devMode, someNumber)
values (nextval('id_sequence'), 'Gabriel', false, 533);

insert into data (id, name, devMode, someNumber)
values (nextval('id_sequence'), 'Krew', false, 865);

insert into data (id, name, devMode, someNumber)
values (nextval('id_sequence'), 'Ryler', false, 909);

insert into data (id, name, devMode, someNumber)
values (nextval('id_sequence'), 'Tayden', false, 353);
