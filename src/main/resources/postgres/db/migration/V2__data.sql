INSERT INTO store(id, store_name, address)
VALUES (nextval("store_seq"), "Store1", "tester1");

INSERT INTO product(id, store_id, product_name, description, price)
values (nextval("product_seq"), currval("store_seq"), "tester2", "Computer science", 10.0);

INSERT INTO product(id, store_id, product_name, description, price)
values (nextval("product_seq"), currval("store_seq"), "tester2", "Computer science", 20.0);

INSERT INTO product(id, store_id, product_name, description, price)
values (nextval("product_seq"), currval("store_seq"), "tester2", "Computer science", 30.0);