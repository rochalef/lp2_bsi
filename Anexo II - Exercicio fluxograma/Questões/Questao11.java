package Questões;

import java.util.Scanner;

public class Questao11{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite dois numeros quaisquer, separados por espaco: ");
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float soma = n1+n2;
        if(soma>=10){
            soma = soma+5;
            System.out.println("o resultado foi " + soma);
        }else{
            soma = soma-7;
            System.out.println("o resultado foi " + soma);
        }
        teclado.close();
    }
}