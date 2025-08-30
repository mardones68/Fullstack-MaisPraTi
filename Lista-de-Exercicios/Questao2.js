/* . Crie um programa que classifica a idade de uma pessoa em categorias (criança,
adolescente, adulto, idoso) com base no valor fornecido, utilizando uma estrutura de
controle if-else.*/

const prompt = require("prompt-sync")()
let idade = Number(prompt("Digite sua idade: "))
if (idade<12){
    console.log("Você é criança!")
}else if(idade>=12 && idade<18){
    console.log("Você é adolescente!")
}else if(idade>=18 && idade<50){
    console.log("Você é adulto!")
}else{
    console.log("Você é idoso! ")
}