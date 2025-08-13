package CalculadoraSeguro;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idadeCondutor;
        double valorCarro;
        Scanner teclado = new Scanner(System.in);
        ValidadorIdade validadorIdade = new ValidadorIdade();
        ValidadorValor validadorValor = new ValidadorValor();
        CalculadoraSeguro calculadora = new CalculadoraSeguro();

        System.out.println("Idade do condutor: ");
        idadeCondutor = teclado.nextInt();
//idade
        try{
            validadorIdade.validarIdade(idadeCondutor);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("processando");
        }



        System.out.println("Valor do carro: ");
        valorCarro = teclado.nextDouble();
//valor
        try{
            validadorValor.validarValor(valorCarro);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("processando");
        }
        calculadora.calcularSeguro(idadeCondutor, valorCarro);


    }
}