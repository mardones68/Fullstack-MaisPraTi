// Implemente um programa que recebe uma nota de 0 a 10 e classifica como
// "Aprovado", "Recuperação", ou "Reprovado" utilizando if-else if.

const prompt = require("prompt-sync")()
let nota = Number(prompt("Digite sua nota: "))
if (nota>=7){
    console.log("Você está aprovado, parabéns! ")
}else if(nota<7 && nota>=4){
    console.log("Você está de recuperação!")
}else{
    console.log("Você está reprovado! ")
}