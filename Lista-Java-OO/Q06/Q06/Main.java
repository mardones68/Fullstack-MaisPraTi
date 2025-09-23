package Q06;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", new Dinheiro(new BigDecimal("3500.00"), Dinheiro.Moeda.BRL));
        Produto p2 = new Produto("Mouse", new Dinheiro(new BigDecimal("150.00"), Dinheiro.Moeda.BRL));

        ItemCarrinho item1 = new ItemCarrinho(p1, 1);
        ItemCarrinho item2 = new ItemCarrinho(p2, 2);

        Carrinho carrinho = new Carrinho();
        carrinho = carrinho.adicionarItem(item1);
        carrinho = carrinho.adicionarItem(item2);

        System.out.println("Carrinho sem desconto:");
        System.out.println(carrinho);
        System.out.println("---");

        Carrinho carrinhoComCupom = carrinho.aplicarCupom(0.2);
        System.out.println("Carrinho com 20% de desconto:");
        System.out.println(carrinhoComCupom);
    }
}
