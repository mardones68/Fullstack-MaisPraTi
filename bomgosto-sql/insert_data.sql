INSERT INTO Cardapio VALUES 
(1, 'Café Expresso', 'Café forte e encorpado', 5.00),
(2, 'Cappuccino', 'Café com leite vaporizado e canela', 7.50),
(3, 'Mocha', 'Café com chocolate e chantilly', 8.00);

INSERT INTO Comanda VALUES
(101, '2025-10-25', 3, 'Maria Souza'),
(102, '2025-10-26', 5, 'Carlos Lima'),
(103, '2025-10-26', 2, 'Ana Oliveira');

INSERT INTO ItemComanda VALUES
(101, 1, 2),
(101, 2, 1),
(102, 3, 3),
(103, 1, 1),
(103, 3, 2);