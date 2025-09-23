package Q02;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Smartphone", 2000.00, 5);
        System.out.println("Preço inicial: " + p1.getPreco());

        // Valido
        p1.aplicarDesconto(10);
        System.out.println("Após desconto de 10%: " + p1.getPreco());

        p1.aplicarDesconto(50);
        System.out.println("Após desconto de 50%: " + p1.getPreco());

        // Testando desconto inválido
        try {
            p1.aplicarDesconto(60); // inválido
        } catch (DescontoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            p1.aplicarDesconto(-5); // inválido
        } catch (DescontoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
