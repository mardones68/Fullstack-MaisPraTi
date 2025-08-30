// 2. Jogo de Adivinhação
// Escreva um script que gere um número aleatório de 1 a 100 e peça ao
// usuário, para adivinhar. Use while para repetir até acertar, contando
// tentativas e exibindo “mais alto” ou “mais baixo” a cada palpite errado.

const prompt = require("prompt-sync")()
const valor = Math.random().toFixed(2)*100
let numDigitado = null
let tentativas = 0
while(numDigitado != valor){
    numDigitado = Number(prompt("Adivinhe o número aleatório gerado: "))
    if(numDigitado!=valor){
         if(numDigitado<valor){
            console.log("Mais alto")
        }else{
            console.log("Mais baixo")
        }
    }
   
    tentativas++
}
console.log(`Parabéns, você acertou, o número gerado foi o ${valor} e você usou ${tentativas} tentativas.`)