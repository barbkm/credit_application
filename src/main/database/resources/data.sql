insert into credit (credit_name) values
('Dobry'),
('Znakomity'),
('Tani'),
('Dla studenta'),
('Dla rodziny');


insert into customer (credit_id, first_name, surname, pesel) values
(1, 'Jan', 'Kowlaski', '98120187543'),
(2,'Dorota', 'Kot',  '76010976541'),
(3, 'Alicja',  'Dom',  '77110976049'),
(4, 'Tomasz', 'But',  '86011776341'),
(5, 'Daria', 'Zent',  '61011076942');

insert into product (credit_id, product_name, product_value) values
(1, 'kredyt gotówkowy', 5000 ),
(2, 'kredyt gotówkowy',  10000),
(3, 'kredyt hipoteczny',  200000),
(4, 'kredyt studencki',  20000),
(5, 'kredyt samochowy',  25000);


