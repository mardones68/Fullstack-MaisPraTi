package Q08.estrategias;

import Q08.CalculadoraFrete;
import Q08.Pedido;

import java.math.BigDecimal;

public class RetiradaNaLoja implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return BigDecimal.ZERO; // sempre grátis
    }
}
