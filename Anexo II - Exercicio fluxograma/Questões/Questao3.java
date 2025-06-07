package Questões;

import java.util.Scanner;

public class Questao3{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite sua idade: ");
        int idade = teclado.nextInt();
        if(idade>=18){
            System.out.println("voce ja esta na maioridade, portanto, ja pode tirar sua carteira de motorista");
        }else{
            System.out.println("voce ainda nao pode tirar sua carteira de motorista");   
        }
        teclado.close();
    }
}