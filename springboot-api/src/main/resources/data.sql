CREATE TABLE IF NOT EXISTS products (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255),
                          description VARCHAR(255),
                          price DOUBLE,
                          quantity INT
);


INSERT INTO products (name, description, price, quantity)
VALUES ('Laptop', 'Dell Inspiron 15', 75000, 10),
       ('Smartphone', 'Samsung Galaxy S21', 60000, 15),
       ('Headphones', 'Sony Wireless Headphones', 12000, 25),
       ('Keyboard', 'Mechanical RGB Keyboard', 5000, 30),
       ('Mouse', 'Wireless Logitech Mouse', 2500, 40),
       ('Monitor', '24 inch Full HD Monitor', 18000, 12),
       ('Tablet', 'Samsung Galaxy Tab', 35000, 8),
       ('Smartwatch', 'Fitness Smartwatch', 9000, 20),
       ('Printer', 'HP LaserJet Printer', 22000, 5),
       ('Router', 'TP-Link WiFi Router', 4000, 18);