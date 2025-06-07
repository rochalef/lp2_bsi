package Questões;

import java.util.Scanner;

public class Questao8{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("para calcularmos a area da circunferencia, preciso que me informe o raio da mesma em centimetro: ");
        double raio = teclado.nextDouble();
        double areaCircun = 3.14*(raio*raio);
        System.out.println("a area de uma circunferencia de raio " + raio + "cm e de " + areaCircun + "cm^2");
        teclado.close();
    }
}