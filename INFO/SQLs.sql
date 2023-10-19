CREATE DATABASE demo_db;

CREATE TABLE IF NOT EXISTS clients
( id INTEGER NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(128) NOT NULL,
  image VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	clients (first_name, last_name, phone, image, description)
VALUES
	('Tom', 'Jefferson', '777 555-5555', 'huawei_mate_x3.jpg', 'Huawei Mate X3'),
	('Bob', 'Green', '777 333-3333', 'iphone_15.jpg', 'iPhone 15'),
	('Andy', 'Wallace', '777 222-2222', 'samsung_zfold5.jpg', 'Samsung ZFold5'),
	('Emma', 'Grace', '777 111-1234', 'xiaomi_m12.jpg', 'Xiaomi M12');

SELECT first_name, last_name, phone, image, description FROM clients;


