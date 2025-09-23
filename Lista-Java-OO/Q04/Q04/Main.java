package Q04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IMeioTransporte> transportes = new ArrayList<>();
        transportes.add(new Carro());
        transportes.add(new Bicicleta());
        transportes.add(new Trem());

        for (IMeioTransporte t : transportes) {
            try {
                t.acelerar();
                t.acelerar();
                t.frear();
                t.frear();
            } catch (OperacaoInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            System.out.println("---");
        }
    }
}
