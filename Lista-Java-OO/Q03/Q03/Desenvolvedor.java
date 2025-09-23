package Q03;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus() {
        return salario.multiply(new BigDecimal("0.1")); // 10% do salário
    }
}
