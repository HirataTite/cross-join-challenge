DROP TABLE IF EXISTS store;
DROP TABLE IF EXISTS product;

CREATE TABLE store
(
    id                   BIGINT NOT NULL,
    store_name           VARCHAR(100) NOT NULL,
    address              VARCHAR NOT NULL,
    PRIMARY KEY (id)
);

CREATE SEQUENCE store_seq START WITH 1 INCREMENT BY 1 MINVALUE 1 NO CYCLE;

CREATE TABLE product
(
    id                   BIGINT NOT NULL,
    store_id             BIGINT NOT NULL,
    product_name         VARCHAR(100) NOT NULL,
    description          VARCHAR,
    price                BIGINT NOT NULL
);

CREATE SEQUENCE product_seq START WITH 1 INCREMENT BY 1 MINVALUE 1 NO CYCLE;


