package Questões;

import java.util.Scanner;

public class Questao7{
    public static void main(String[] n) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite seu peso em quilos e sua altura em metros, respectivamente, separados por espaco: ");
        float peso = teclado.nextFloat();
        float altura = teclado.nextFloat();
        float icm = peso / (altura * altura);
        if (icm > 30) {
            System.out.println("infelizmente, voce esta obeso");
        } else {
            System.out.println("voce nao esta obeso!");
        }
        teclado.close();
    }
}