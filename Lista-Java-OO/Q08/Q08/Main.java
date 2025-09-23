package Q08;

import Q08.estrategias.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            Pedido pedido = new Pedido("12345678", new BigDecimal("200.00"), new Sedex());
            System.out.println("Frete com Sedex: R$ " + pedido.calcularFrete());

            pedido.setEstrategiaFrete(new Pac());
            System.out.println("Frete com PAC: R$ " + pedido.calcularFrete());

            pedido.setEstrategiaFrete(new RetiradaNaLoja());
            System.out.println("Frete com Retirada na Loja: R$ " + pedido.calcularFrete());

            pedido.setEstrategiaFrete(p -> {
                if (!p.getCepDestino().matches("\\d{8}")) {
                    throw new FreteInvalidoException("CEP inválido para promoção.");
                }
                return p.getValorTotal().compareTo(new BigDecimal("150")) > 0 ?
                        BigDecimal.ZERO : new BigDecimal("10.00");
            });
            System.out.println("Frete com Promoção (lambda): R$ " + pedido.calcularFrete());

        } catch (FreteInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
