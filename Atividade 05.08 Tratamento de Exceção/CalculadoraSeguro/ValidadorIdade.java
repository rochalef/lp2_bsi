package CalculadoraSeguro;

public class ValidadorIdade {
   public ValidadorIdade() {}
    public void validarIdade(int idade) throws Exception {
        if (idade < 18) {
            throw new IdadeInvalidaException();
        }
    }
}
