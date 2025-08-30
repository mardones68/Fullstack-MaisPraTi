// 6. Memoization
// Implemente function memoize(fn) que armazene em cache chamadas
// anteriores de fn (por argumentos), retornando resultados instantâneos em
// repetidas invocações.
function memoize(fn) {
  const cache = {}

  return function(...args) {
    const chave = JSON.stringify(args) // cria uma chave única com os argumentos

    if (cache[chave] !== undefined) {
      console.log("resultado vindo do cache")
      return cache[chave]
    } else {
      console.log("calculando resultado...")
      const resultado = fn(...args)
      cache[chave] = resultado
      return resultado
    }
  }
}

function somar(a, b) {
  return a + b
}

const somarMemoizada = memoize(somar)

console.log(somarMemoizada(2, 3)) // calcula
console.log(somarMemoizada(2, 3)) // cache
console.log(somarMemoizada(4, 1)) // calcula
console.log(somarMemoizada(4, 1)) // cache
