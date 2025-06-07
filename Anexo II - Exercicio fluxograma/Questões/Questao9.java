package Questões;

import java.util.Scanner;

public class Questao9{
    public static void main(String[] n){
        Scanner teclado = new Scanner(System.in);
        System.out.print("para calcular seu salario liquido, preciso que me informe o valor da sua hora aula: ");
        double horaAula = teclado.nextDouble();
        System.out.print("agora, informe a quantidade de horas trabalhadas: ");
        double horasTrab = teclado.nextDouble();
        System.out.print("por ultimo, o percentual de desconto do INSS: ");
        double INSS = teclado.nextDouble();
        INSS = INSS/100;
        double salBruto = horasTrab*horaAula;
        double salLiq = salBruto-(salBruto*INSS);
        System.out.println("seu salario bruto e de R$ " + salBruto + ", com o desconto do INSS, seu salario liquido e de R$ " + salLiq);
        teclado.close();
    }
}