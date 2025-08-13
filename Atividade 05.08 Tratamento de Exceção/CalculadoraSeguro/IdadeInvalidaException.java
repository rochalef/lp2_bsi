package CalculadoraSeguro;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() throws Exception {
            super("Idade invaliad: menor de idade");
    }

}
