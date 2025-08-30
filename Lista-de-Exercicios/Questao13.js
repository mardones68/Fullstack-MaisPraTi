// Fazer um algoritmo para receber números decimais até que o usuário digite 0 e fazer
// a média aritmética desses números.
const prompt = require("prompt-sync")()
let media = 0
let soma = 0
let cont = 0
let num = Number(prompt("Digite um número: "))
while(num!=0){
    cont ++
    soma +=num
    media = soma /cont
    num = Number(prompt("Digite mais um número ou O para encerrar: "))
}
console.log(`Media: ${media.toFixed(2)}`)