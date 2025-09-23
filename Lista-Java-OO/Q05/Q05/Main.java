package Q05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new CartaoCredito("1234567812345678")); // válido
        pagamentos.add(new Boleto("23791234567890123456789012345678901234567890123")); // válido
        pagamentos.add(new Pix("meuemail@exemplo.com")); // válido
        pagamentos.add(new CartaoCredito("1111")); // inválido para testar exceção

        for (FormaPagamento f : pagamentos) {
            try {
                f.processarPagamento(new BigDecimal("150.00"));
            } catch (PagamentoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            System.out.println("---");
        }
    }
}
