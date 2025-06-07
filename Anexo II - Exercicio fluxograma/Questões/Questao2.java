package Questões;

import java.util.Scanner;

public class Questao2{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite qual a distancia, em quilometros, que voce precisara percorrer para chegar a sua fazenda: ");
        float distancia = teclado.nextFloat();
        System.out.print("agora digite quanto esta custando o litro da gasolina na sua regiao: ");
        float preco = teclado.nextFloat();
        float qtdt =  distancia/12;
        float gasolina = qtdt * preco;
        System.out.println("voce precisara de " + qtdt + " litros de gasolina que custara " + preco);
        teclado.close();
    }
}