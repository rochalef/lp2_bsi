package Questões;

import java.util.Scanner;

public class Questao6{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite as tres notas para o calculo da media, separados por um espaco (ex.: 1 2 4): ");
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float trabalho = teclado.nextFloat();
        float media = (n1+n2+trabalho)/3;
        if(media>=7){
            System.out.println("voce tirou " + media + " na sua media final, portanto esta APROVADO");
        }else{
                System.out.println("voce tirou " + media + " na sua media final, portanto esta REPROVADO");
        }
        teclado.close();
    }
}