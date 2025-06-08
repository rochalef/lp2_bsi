package Calculadora;

import java.util.Scanner;

public class ProgramaCalculadora{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        boolean erro = false;

        System.out.println("Calculadora Simples\n");
        System.out.print("Digite sua conta matemática simples (ex.: 3 + 2): ");
        double num1 = teclado.nextDouble();
        char operacao = teclado.next().charAt(0);
        double num2 = teclado.nextDouble();

        double resultado = 0;

        switch(operacao){
            case '+':
                resultado = calc.somar(num1, num2);
                break;
            case '-':
                resultado = calc.subtrair(num1, num2);
                break;
            case '*':
                resultado = calc.multiplicar(num1, num2);
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Não é possível divisão de um número por zero!");
                    erro = true;
                    break;
                }else{
                    resultado = calc.dividir(num1, num2);
                    break;
                }
            default:
                System.out.println("Operação inválida.");
                erro = true;
                break;
        }

        if(erro){
            System.out.println("Ocorreu um erro! Tente reiniciar o programa!");
        }else{
            System.out.println("Resultado: " + resultado);
        }
        teclado.close();
    }
}
