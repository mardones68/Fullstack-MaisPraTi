package Q06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Carrinho {
    private final List<ItemCarrinho> itens;

    public Carrinho() {
        this.itens = Collections.emptyList();
    }

    private Carrinho(List<ItemCarrinho> itens) {
        this.itens = Collections.unmodifiableList(itens);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public Carrinho adicionarItem(ItemCarrinho item) {
        List<ItemCarrinho> novaLista = new ArrayList<>(itens);
        novaLista.add(item);
        return new Carrinho(novaLista);
    }

    public Carrinho removerItem(ItemCarrinho item) {
        List<ItemCarrinho> novaLista = new ArrayList<>(itens);
        novaLista.remove(item);
        return new Carrinho(novaLista);
    }

    public Carrinho aplicarCupom(double percentual) {
        if (percentual < 0 || percentual > 0.3) {
            throw new IllegalArgumentException("Cupom máximo de 30%");
        }
        List<ItemCarrinho> novaLista = new ArrayList<>();
        for (ItemCarrinho item : itens) {
            Dinheiro precoComDesconto = item.getProduto().getPreco().aplicarDesconto(percentual);
            Produto produtoComDesconto = new Produto(item.getProduto().getNome(), precoComDesconto);
            novaLista.add(new ItemCarrinho(produtoComDesconto, item.getQuantidade()));
        }
        return new Carrinho(novaLista);
    }

    public Dinheiro calcularTotal() {
        Dinheiro total = new Dinheiro(new java.math.BigDecimal("0.00"), Dinheiro.Moeda.BRL);
        for (ItemCarrinho item : itens) {
            total = new Dinheiro(total.getValor().add(item.calcularTotal().getValor()), total.getMoeda());
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Carrinho:\n");
        for (ItemCarrinho item : itens) {
            sb.append(item).append("\n");
        }
        sb.append("Total: ").append(calcularTotal());
        return sb.toString();
    }
}
