package Questões;

import java.util.Scanner;

public class Questao4{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite qual a sua temperatura corporal atual: ");
        float temperatura = teclado.nextFloat();
        if(temperatura>37){
            System.out.println("voce, infelizmente, esta com febre");
        }else{
            System.out.println("voce esta bem! nao esta com febre");   
        }
        teclado.close();
    }
}