//  Escreva um algoritmo para ler 2 valores (considere que não serão lidos valores iguais)
//  e escreve-los em ordem crescente

const prompt = require ("prompt-sync")()
let num1 = Number(prompt("Digite um número: "))
let num2 = Number(prompt("Digite mais um número: "))
if(num1<num2){
    console.log(`Ordem crescente ${num1} ${num2}`)
}else{
    console.log(`Ordem crescente ${num2} ${num1}`)
}