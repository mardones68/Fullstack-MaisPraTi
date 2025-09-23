package Q07;

import Q06.Dinheiro; // reutilizando Dinheiro do exercício anterior
import java.util.Objects;

public class Produto implements Identificavel<Integer> {
    private final Integer id;
    private final String nome;
    private final Dinheiro preco;

    public Produto(Integer id, String nome, Dinheiro preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Dinheiro getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return id.equals(produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "', preco=" + preco + "}";
    }
}
