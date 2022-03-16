drop table rating;
drop table publication;
drop table "user";

create table if not exists "user" (
  id bigserial primary key,
  nickname varchar(20),
  mail varchar(253),
  password varchar(60),
  role varchar(5),
  create_date timestamp
);

create table if not exists publication (
                                           id bigserial primary key,
                                           id_user bigint references "user"(id),
                                           head varchar(100),
                                           body varchar(1000),
                                           create_date timestamp
);

create table if not exists rating (
                      id bigserial primary key,
                      id_user bigint references "user"(id),
                      id_publication bigint references publication(id),
                      value boolean
);

