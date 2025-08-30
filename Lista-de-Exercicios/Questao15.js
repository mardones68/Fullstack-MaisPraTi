//  Escreva um programa que gera e imprime os primeiros 10 números da sequência de
//  Fibonacci utilizando um loop for
/*A sequência de Fibonacci é uma sequência de números onde cada número é a soma dos dois números anteriores,
começando por 0 e 1. A sequência é frequentemente representada como: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... */
let a = 0
let b = 1

console.log("Sequência de Fibonacci:")
for (let i = 0; i < 10; i++) {
    console.log(a)
    let proximo = a + b
    a = b
    b = proximo

}
