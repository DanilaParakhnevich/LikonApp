insert into "user" (nickname, password, create_date)
values ('dendil', '123456', '2022-03-14T23:47Z');
insert into "user" (nickname, password, create_date)
values ('masha', '111111', '2022-03-15T9:17Z');
insert into "user" (nickname, password, create_date)
values ('jenya', '228822', '2022-03-15T10:33Z');
insert into "user" (nickname, password, create_date)
values ('vlad', '123456', '2022-03-15T1:21Z');

insert into role (name) values ('ADMIN');
insert into role (name) values ('MODERATOR');
insert into role (name) values ('USER');

insert into user_role (id_user, id_role) values (1, 1);
insert into user_role (id_user, id_role) values (2, 2);
insert into user_role (id_user, id_role) values (3, 3);
insert into user_role (id_user, id_role) values (4, 3);


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

insert into publication_rating(id_user, id_publication, value)
values (1, 1, 't');
insert into publication_rating(id_user, id_publication, value)
values (2, 1, 't');
insert into publication_rating(id_user, id_publication, value)
values (3, 1, 't');
insert into publication_rating(id_user, id_publication, value)
values (4, 2, 'f');
insert into publication_rating(id_user, id_publication, value)
values (1, 2, 't');
insert into publication_rating(id_user, id_publication, value)
values (3, 3, 't');
insert into publication_rating(id_user, id_publication, value)
values (4, 2, 't');

insert into comment(id_publication, id_user, body, create_date) values (1, 1, 'Lol', '2022-03-15T10:33Z');
insert into comment(id_publication, id_user, body, create_date) values (2, 1, 'Lol', '2022-03-15T10:33Z');
insert into comment(id_publication, id_user, body, create_date) values (3, 2,'Lol', '2022-03-15T10:33Z');
insert into comment(id_publication, id_user, body, create_date) values (4, 3, 'Lol', '2022-03-15T10:33Z');
insert into comment(id_publication, id_user, body, create_date) values (5, 4, 'Lol', '2022-03-15T10:33Z');

