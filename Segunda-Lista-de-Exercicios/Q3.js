// 3. Palavras Únicas
// Dada uma string (ex.: "olá olá mundo mundo"), use if/else e for para extrair
// todas as palavras únicas e exibi-las em um array.

function palavrasUnicas(texto) {
  // Quebra a string em palavras separadas por espaço
  const palavras = texto.split(' ');
  const unicas = [];

  for (let i = 0; i < palavras.length; i++) {
    let palavra = palavras[i];
    // Verifica se a palavra ainda não está no array 'unicas'
    if (unicas.indexOf(palavra) === -1) {
      unicas.push(palavra);
    } else {
      // só para cumprir a exigência do if/else
    }
  }

  return unicas;
}

const resultado = palavrasUnicas("olá olá mundo mundo");
console.log(resultado); // ["olá", "mundo"]
