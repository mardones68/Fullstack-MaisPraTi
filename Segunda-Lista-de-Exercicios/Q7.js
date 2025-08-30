// 7. Mapeamento e Ordenação
// Dado um array produtos = [{ nome, preco }, ...], crie uma função que
// retorne um novo array apenas com os nomes, ordenados por preço
// crescente, usando map, sort.

const produtos = [
  { nome: "Camiseta", preco: 50 },
  { nome: "Calça", preco: 100 },
  { nome: "Tênis", preco: 80 }
]

function nomesOrdenadosPorPreco(produtos) {
  return produtos
    .slice() // copia para não alterar o array original
    .sort((a, b) => a.preco - b.preco) // ordena por preco crescente
    .map(produto => produto.nome) // extrai apenas os nomes
}

const resultado = nomesOrdenadosPorPreco(produtos)
console.log(resultado)
