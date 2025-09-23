package Q08.estrategias;

import Q08.CalculadoraFrete;
import Q08.FreteInvalidoException;
import Q08.Pedido;

import java.math.BigDecimal;

public class Sedex implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) throws FreteInvalidoException {
        validarCep(pedido.getCepDestino());
        return new BigDecimal("25.00"); // frete fixo
    }

    private void validarCep(String cep) throws FreteInvalidoException {
        if (cep == null || !cep.matches("\\d{8}")) {
            throw new FreteInvalidoException("CEP inválido para Sedex.");
        }
    }
}
