INSERT INTO store(id, store_name, address)
VALUES (nextval("store_seq"), "Store1", "tester1");

INSERT INTO product(id, store_id, product_name, description, price)
values (nextval("product_seq"), currval("store_seq"), "product1", "This is the best one!", 10.0);

INSERT INTO product(id, store_id, product_name, description, price)
values (nextval("product_seq"), currval("store_seq"), "product2", "Computer science", 20.0);

INSERT INTO product(id, store_id, product_name, description, price)
values (nextval("product_seq"), currval("store_seq"), "product3", "Computer science", 30.0);