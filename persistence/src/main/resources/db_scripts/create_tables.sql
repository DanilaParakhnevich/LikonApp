create table if not exists "user" (
    id bigserial primary key,
    nickname varchar(20),
    password varchar(60),
    create_date timestamp
);

create table if not exists role (
    id bigserial primary key ,
    name varchar(10)
);

create table if not exists user_role (
    id_user bigint references "user" (id),
    id_role bigint references role (id)
);

create table if not exists publication (
    id bigserial primary key,
    id_user bigint references "user"(id),
    head varchar(100),
    body varchar(1000),
    is_accepted boolean,
    create_date timestamp
);

drop table comment_rating;
drop table comment;

create table if not exists comment (
    id bigserial primary key,
    id_user bigint references "user" (id),
    id_publication bigint references publication (id),
    body varchar(100),
    create_date timestamp
);

create table if not exists publication_rating (
    id bigserial primary key,
    id_user bigint references "user" (id),
    id_publication bigint references publication (id),
    value boolean
);

drop table comment_rating;

create table if not exists comment_rating (
    id bigserial primary key,
    id_user bigint references "user" (id),
    id_comment bigint references comment (id),
    value boolean
);

create sequence public.hibernate_sequence


