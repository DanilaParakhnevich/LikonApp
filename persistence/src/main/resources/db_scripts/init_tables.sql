insert into "user" (nickname, mail, password, role, create_date)
values ('dendil', 'dendil@mail.ru', '123456', 'ADMIN', '2022-03-14T23:47Z');
insert into "user" (nickname, mail, password, role, create_date)
values ('masha', 'masha@mail.ru', '111111', 'USER', '2022-03-15T9:17Z');
insert into "user" (nickname, mail, password, role, create_date)
values ('jenya', 'jenek@mail.ru', '228822', 'USER', '2022-03-15T10:33Z');
insert into "user" (nickname, mail, password, role, create_date)
values ('vlad', 'vladiskav2007@mail.ru', '123456', 'ADMIN', '2022-03-15T1:21Z');

insert into publication (id_user, head, body, create_date)
values (1, 'top 10', '1.2.3.4.5.6.7.8.9.10.', '2022-03-14T23:50Z');
insert into publication (id_user, head, body, create_date)
values (3, 'top 3', '1.2.3.', '2022-03-20T20:03Z');
insert into publication (id_user, head, body, create_date)
values (4, 'hello', 'world', '2022-03-16T21:52Z');
insert into publication (id_user, head, body, create_date)
values (2, 'bye', 'wrld', '2022-03-17T20:03Z');
insert into publication (id_user, head, body, create_date)
values (3, 'killstation', 'sarcoma', '2022-03-17T15:34Z');
insert into publication (id_user, head, body, create_date)
values (1, 'lil', 'peep', '2022-03-14T23:50Z');
insert into publication (id_user, head, body, create_date)
values (2, 'lil', 'pump', '2022-03-14T23:50Z');
insert into publication (id_user, head, body, create_date)
values (2, 'XO', 'life', '2022-03-14T23:50Z');
insert into publication (id_user, head, body, create_date)
values (3, 'hate', 'them', '2022-03-14T23:50Z');
insert into publication (id_user, head, body, create_date)
values (4, 'rape', 'me', '2022-03-14T23:50Z');
insert into publication (id_user, head, body, create_date)
values (1, 'rame', 'you', '2022-03-14T23:50Z');

insert into rating(id_user, id_publication, value)
values (1, 1, 't');