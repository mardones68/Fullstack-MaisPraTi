package Q08;

import java.math.BigDecimal;

public class Pedido {
    private String cepDestino;
    private BigDecimal valorTotal;
    private CalculadoraFrete estrategiaFrete;

    public Pedido(String cepDestino, BigDecimal valorTotal, CalculadoraFrete estrategiaFrete) {
        this.cepDestino = cepDestino;
        this.valorTotal = valorTotal;
        this.estrategiaFrete = estrategiaFrete;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setEstrategiaFrete(CalculadoraFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public BigDecimal calcularFrete() throws FreteInvalidoException {
        if (estrategiaFrete == null) {
            throw new FreteInvalidoException("Nenhuma estratégia de frete definida.");
        }
        return estrategiaFrete.calcular(this);
    }
}
