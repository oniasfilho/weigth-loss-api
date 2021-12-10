CREATE TABLE peso
(
    id   serial,
    peso float,
    meta float,
    pessoa_id integer,
    primary key (id)
    foreign key (pessoa_id) references pessoa (id)
);

CREATE TABLE pessoa
(
    id      serial,
    nome    varchar,
    idade   integer,
    altura  float,
    primary key (id)
);
