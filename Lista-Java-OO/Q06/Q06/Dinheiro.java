package Q06;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class Dinheiro {
    private final BigDecimal valor;
    private final Moeda moeda;

    public enum Moeda {
        BRL, USD, EUR
    }

    public Dinheiro(BigDecimal valor, Moeda moeda) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.valor = valor.setScale(2, RoundingMode.HALF_EVEN); // arredondamento bancário
        this.moeda = moeda;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public Dinheiro multiplicar(int quantidade) {
        return new Dinheiro(valor.multiply(BigDecimal.valueOf(quantidade)), moeda);
    }

    public Dinheiro aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 0.3) {
            throw new IllegalArgumentException("Desconto máximo é 30%");
        }
        BigDecimal fator = BigDecimal.valueOf(1.0 - percentual);
        return new Dinheiro(valor.multiply(fator), moeda);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dinheiro)) return false;
        Dinheiro dinheiro = (Dinheiro) o;
        return valor.equals(dinheiro.valor) && moeda == dinheiro.moeda;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, moeda);
    }

    @Override
    public String toString() {
        return valor + " " + moeda;
    }
}
