package Q07;

import Q06.Dinheiro;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        InMemoryRepository<Produto, Integer> repoProdutos = new InMemoryRepository<>();
        InMemoryRepository<Funcionario, Integer> repoFuncionarios = new InMemoryRepository<>();

        // Produtos
        Produto p1 = new Produto(1, "Notebook", new Dinheiro(new BigDecimal("3500.00"), Dinheiro.Moeda.BRL));
        Produto p2 = new Produto(2, "Mouse", new Dinheiro(new BigDecimal("150.00"), Dinheiro.Moeda.BRL));
        repoProdutos.salvar(p1);
        repoProdutos.salvar(p2);

        // Funcionários
        Funcionario f1 = new Funcionario(1, "Alice", new BigDecimal("5000"));
        Funcionario f2 = new Funcionario(2, "Bob", new BigDecimal("3000"));
        repoFuncionarios.salvar(f1);
        repoFuncionarios.salvar(f2);

        // Listar todos
        System.out.println("Produtos:");
        repoProdutos.listarTodos().forEach(System.out::println);

        System.out.println("\nFuncionários:");
        repoFuncionarios.listarTodos().forEach(System.out::println);

        // Buscar por ID
        System.out.println("\nBuscar Produto ID 1:");
        repoProdutos.buscarPorId(1).ifPresent(System.out::println);

        // Remover e testar exceção
        try {
            repoProdutos.remover(3); // inexistente
        } catch (EntidadeNaoEncontradaException e) {
            System.out.println("\nErro ao remover: " + e.getMessage());
        }
    }
}
