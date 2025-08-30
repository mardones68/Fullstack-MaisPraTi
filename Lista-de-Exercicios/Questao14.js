//  Crie um programa que calcula o fatorial de um número fornecido pelo usuário
//  utilizando um loop for ou while
const prompt = require('prompt-sync')()
let fatorial = 1
let num = Number(prompt("Digite um valor: "))
for(let i= 1; i<=num;i++){
    fatorial *= i
}
console.log(fatorial)