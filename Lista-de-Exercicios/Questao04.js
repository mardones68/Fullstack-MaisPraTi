// Crie um menu interativo no console que oferece ao usuário a escolha de três opções.
// Utilize switch-case para implementar a lógica de cada opção selecionada.

const prompt = require("prompt-sync")()
console.log("==== MENU INTERATIVO ====")
let opcao = Number(prompt("Digite 1 para realizar uma soma:\nDigite 2 para uma subtração\nDigite 3 para sair: "))

switch (opcao){
    case 1:
        let num1 = Number(prompt("Digite um número: "))
        let num2 = Number(prompt("Digite mais um número: "))
        let soma = num1+num2
        console.log(`A soma dos números ${num1} e ${num2} é igual a ${soma}`)
        break;
    
    case 2:
        let valor1 = Number(prompt("Digite um número: "))
        let valor2 = Number(prompt("Digite mais um número: "))
        let sub= valor1-valor2
        console.log(`A subtração dos números ${valor1} e ${valor2} é igual a ${sub}`)
        break;
    
    case 3:
        console.log("Saindo...!")
        break;
}