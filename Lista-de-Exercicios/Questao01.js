/*1. Escreva um programa que recebe um número inteiro e verifica se ele é par ou ímpar
 utilizando uma estrutura de controle if.*/

//npm install prompt-sync

 const prompt = require("prompt-sync")()
let num = Number(prompt("Digite um número inteiro: "))
if (Number.isInteger(num)){
    if(num%2==0){
    console.log(`O numero ${num} e par!`)
}else{
    console.log(`O numero ${num} é impar`)
}
}
