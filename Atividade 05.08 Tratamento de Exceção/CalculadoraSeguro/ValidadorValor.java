package CalculadoraSeguro;

public class ValidadorValor {
    public ValidadorValor() {}

    public void validarValor(double valorCarro) throws Exception {
        if (valorCarro <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
