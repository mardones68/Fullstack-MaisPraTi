package Q04;

public class Trem implements IMeioTransporte {
    private int velocidade = 0;
    private final int VELOCIDADE_MAXIMA = 300;

    @Override
    public void acelerar() throws OperacaoInvalidaException {
        if (velocidade + 50 > VELOCIDADE_MAXIMA) {
            throw new OperacaoInvalidaException("Trem não pode ultrapassar " + VELOCIDADE_MAXIMA + " km/h!");
        }
        velocidade += 50;
        System.out.println("Trem acelerou para " + velocidade + " km/h");
    }

    @Override
    public void frear() throws OperacaoInvalidaException {
        if (velocidade - 50 < 0) {
            throw new OperacaoInvalidaException("Trem já está parado!");
        }
        velocidade -= 50;
        System.out.println("Trem freou para " + velocidade + " km/h");
    }
}
