package Q03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Alice", new BigDecimal("10000")));
        funcionarios.add(new Desenvolvedor("Bob", new BigDecimal("5000")));
        funcionarios.add(new Desenvolvedor("Carol", new BigDecimal("7000")));
        funcionarios.add(new Gerente("David", new BigDecimal("15000")));

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Bônus: " + f.calcularBonus());
        }
    }
}
