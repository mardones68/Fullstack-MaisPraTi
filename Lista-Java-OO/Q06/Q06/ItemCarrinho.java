package Q06;

import java.util.Objects;

public final class ItemCarrinho {
    private final Produto produto;
    private final int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Dinheiro calcularTotal() {
        return produto.getPreco().multiplicar(quantidade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemCarrinho)) return false;
        ItemCarrinho that = (ItemCarrinho) o;
        return quantidade == that.quantidade && produto.equals(that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto, quantidade);
    }

    @Override
    public String toString() {
        return quantidade + " x " + produto.getNome() + " = " + calcularTotal();
    }
}
