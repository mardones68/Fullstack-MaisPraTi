// Crie um programa que exibe a tabuada de um número fornecido pelo usuário 
// (de 1a 10) utilizando um loop for.
const prompt = require("prompt-sync")()
let num = Number(prompt("Digite um número desejado para exibir a tabuada: "))
for(let i=1; i<=110; i++){
    let calculo = i*num
    console.log(`${i} x ${num} = ${calculo}`)
}