SELECT 
    c.data,
    SUM(i.quantidade * ca.preco_unit) AS faturamento_dia
FROM Comanda c
JOIN ItemComanda i ON c.cod_comanda = i.cod_comanda
JOIN Cardapio ca ON i.cod_cardapio = ca.cod_cardapio
GROUP BY c.data
ORDER BY c.data;