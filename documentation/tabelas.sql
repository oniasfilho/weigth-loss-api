CREATE TABLE pessoa
(
    id      serial,
    nome    varchar,
    idade   integer,
    altura  float,
    meta float,
    primary key (id)
);

CREATE TABLE peso
(
    id   serial,
    peso float,
    data_criacao date,
    pessoa_id integer,
    primary key (id),
    foreign key (pessoa_id) references pessoa (id)
);

INSERT INTO pessoa (nome, idade, altura, meta) VALUES ('Onias da Rocha', 26, 1.80, 80.0);

INSERT INTO peso (pessoa_id, peso, data_criacao)
VALUES (1, 156.2, '2021-11-25');
INSERT INTO peso (pessoa_id, peso, data_criacao)
VALUES (1, 154.5, '2021-12-02');
INSERT INTO peso (pessoa_id, peso, data_criacao)
VALUES (1, 151.8, '2021-12-09');