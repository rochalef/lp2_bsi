package Questões;

import java.util.Scanner;

public class Questao1{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("agora digite suas horas de trabalho: ");
        int horas = teclado.nextInt();
        float salario =  horas * 20;
        System.out.println("voce, " + nome + ", voce ganhara " + salario + " reais");
        teclado.close();
    }
}