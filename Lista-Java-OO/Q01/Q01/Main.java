package Q01;

public class Main {
    public static void main(String[] args) {
        try {
            Produto p1 = new Produto("Notebook", 3500.00, 10);
            System.out.println(p1);

            p1.setPreco(3000.00);
            p1.setQuantidadeEmEstoque(15);
            System.out.println("Após alterações: " + p1);

            System.out.println("\n--- Testando atribuições inválidas ---");

            try {
                p1.setPreco(-100.00); // inválido
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            try {
                p1.setQuantidadeEmEstoque(-5); // inválido
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            try {
                p1.setNome(""); // inválido
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

            try {
                Produto p2 = new Produto(null, 1000.00, 5);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar produto: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
