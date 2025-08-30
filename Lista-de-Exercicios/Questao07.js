//  As maçãs custam R$ 0,30 se forem compradas menos do que uma dúzia, eR$0,25 se
//  forem compradas pelo menos doze. Escreva um algoritmo que leia o número de maçãs
//  compradas, calcule e escreva o valor total da compra.

const prompt = require("prompt-sync")()
let numero = Number(prompt("Digite o número de maçãs compradas:"))
let valor = 0
if(numero<12){
    valor=0.30
    console.log(`O valor total da compra é de: R$ ${numero*valor}`)
}else{
    valor = 0.25
    console.log(`O valor total da compra é de: R$ ${numero*valor}`)
}