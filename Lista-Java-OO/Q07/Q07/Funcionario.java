package Q07;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario implements Identificavel<Integer> {
    private final Integer id;
    private final String nome;
    private final BigDecimal salario;

    public Funcionario(Integer id, String nome, BigDecimal salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Funcionario{id=" + id + ", nome='" + nome + "', salario=" + salario + "}";
    }
}
