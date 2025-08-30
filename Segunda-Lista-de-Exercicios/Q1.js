//1. Validação de Datas
//  Crie a função ehDataValida(dia, mes, ano) que retorne true se os valores
// formarem uma data real (meses de 28–31 dias, ano bissexto para
// fevereiro) e false caso contrário.

//npm install prompt-sync

const prompt = require("prompt-sync")()
function ehDataValida(dia, mes, ano) {
    const data = new Date(ano, mes - 1, dia);
    return data.getFullYear() === ano &&
           data.getMonth() === mes - 1 &&
           data.getDate() === dia;
}
console.log(ehDataValida(29, 2, 2024)); // true
console.log(ehDataValida(31, 4, 2024)); // false