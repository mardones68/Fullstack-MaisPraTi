// 5. Debounce
// Crie function debounce(fn, delay) que receba uma função fn e um delay
// em ms, retornando uma nova função que só executa fn se não for
// chamada novamente dentro do intervalo.

function debounce(fn, delay) {
  let timeoutId

  return function(...args) {
    if (timeoutId) {
      clearTimeout(timeoutId)
    }

    // Agendamos a função para executar após o delay
    timeoutId = setTimeout(() => {
      fn.apply(this, args) // chama a função original com os argumentos corretos
    }, delay)
  }
}

function mostrarMensagem() {
  console.log("Função executada!")
}

const debounced = debounce(mostrarMensagem, 1000)

debounced()
debounced()
debounced()
