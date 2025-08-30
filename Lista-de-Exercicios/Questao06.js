// 6. Ler três valores para os lados de um triângulo: A, B e C. Verificar se os lados fornecidos
// formam realmente um triângulo. Caso forme, deve ser indicado o tipo de triângulo:
// Isósceles, escaleno ou eqüilátero.

// Para verificar se os lados fornecidos formam triângulo: A < B + C ou B < A + C ou C < A + B
//A soma de dois lados deve ser maior que o terceiro, para todos os lados.
// Triângulo isósceles: possui dois lados iguais (A=B ou A=C ou B = C)
// Triângulo escaleno: possui todos os lados diferentes (A<>B e B <> C e A<>C)
// Triângulo eqüilátero: possui todos os lados iguais (A=B e B=C)

const prompt = require("prompt-sync")()
let a = Number(prompt("Digite o valor de um lado de um triângulo: "))
let b = Number(prompt("Digite mais um valor de um lado de um triângulo: "))
let c = Number(prompt("Digite mais um valor de um lado de um triângulo: "))

if (a<b+c && b<a+c && c< a+b){
    if(a==b && a==c && b==c){
        console.log("Triangulo Equilátero !")
    }else if(a!=b && b!=c && a!=c){
        console.log("Triângulo escaleno !")
    }else{
        console.log("Triângulo Isósceles !")
    }
}else{
    console.log("Não é triângulo!")
}