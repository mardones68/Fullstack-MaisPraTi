package Q04;

public interface IMeioTransporte {
    void acelerar() throws OperacaoInvalidaException;
    void frear() throws OperacaoInvalidaException;
}
