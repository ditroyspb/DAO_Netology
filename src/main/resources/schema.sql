CREATE SCHEMA IF NOT EXISTS dao;

CREATE TABLE IF NOT EXISTS dao.customers
(
    id           int primary key auto_increment,
    name         varchar(50) not null,
    surname      varchar(50) not null,
    age          int         not null,
    phone_number varchar(20) not null
);

insert into dao.CUSTOMERS (name, surname, age, phone_number)
values ('Andrey', 'Andreev', 23, '89111234567');

insert into dao.CUSTOMERS (name, surname, age, phone_number)
values ('Petr', 'Ivanov', 37, '89231234573');

insert into dao.CUSTOMERS (name, surname, age, phone_number)
values ('Oleg', 'Petrov', 19, '89366344573');

insert into dao.CUSTOMERS (name, surname, age, phone_number)
values ('Konstantin', 'Smirnov', 54, '89128794573');

insert into dao.CUSTOMERS (name, surname, age, phone_number)
values ('Alexey', 'Vasilyev', 29, '89861539867');

insert into dao.CUSTOMERS (name, surname, age, phone_number)
values ('alexey', 'Kornev', 41, '89256369678');


CREATE TABLE IF NOT EXISTS dao.orders
(
    id           int primary key auto_increment,
    date         date        not null,
    customer_id  int         not null,
    product_name varchar(50) not null,
    amount       varchar(10) not null,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);


insert into dao.ORDERS (date, customer_id, product_name, amount)
values ('2023_01_14', 1, 'table', '5400');

insert into dao.ORDERS (date, customer_id, product_name, amount)
values ('2023_01_27', 3, 'chair', '4100');

insert into dao.ORDERS (date, customer_id, product_name, amount)
values ('2023_02_02', 2, 'cabinet', '28200');

insert into dao.ORDERS (date, customer_id, product_name, amount)
values ('2023_02_05', 5, 'bed', '25000');

insert into dao.ORDERS (date, customer_id, product_name, amount)
values ('2023_02_05', 4, 'carpet', '7000');

insert into dao.ORDERS (date, customer_id, product_name, amount)
values ('2023_03_01', 6, 'armchair', '9200');

