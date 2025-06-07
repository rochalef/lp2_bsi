package Questões;

import java.util.Scanner;

public class Questao5{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite dois valores, separados por um espaco entre eles (ex.: 1 2): ");
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        if(n1>n2){
            System.out.println(n1 + " e o maior numero entre os digitados");
        }else if(n2>n1){
            System.out.println(n2 + " e o maior numero entre os digitados");   
        }else{
            System.out.println("ambos os numeros digitados sao iguais!");
        }
        teclado.close();
    }
}