package Q04;

public class Carro implements IMeioTransporte {
    private int velocidade = 0;
    private final int VELOCIDADE_MAXIMA = 200;

    @Override
    public void acelerar() throws OperacaoInvalidaException {
        if (velocidade + 20 > VELOCIDADE_MAXIMA) {
            throw new OperacaoInvalidaException("Carro não pode ultrapassar " + VELOCIDADE_MAXIMA + " km/h!");
        }
        velocidade += 20;
        System.out.println("Carro acelerou para " + velocidade + " km/h");
    }

    @Override
    public void frear() throws OperacaoInvalidaException {
        if (velocidade - 20 < 0) {
            throw new OperacaoInvalidaException("Carro já está parado!");
        }
        velocidade -= 20;
        System.out.println("Carro freou para " + velocidade + " km/h");
    }
}
