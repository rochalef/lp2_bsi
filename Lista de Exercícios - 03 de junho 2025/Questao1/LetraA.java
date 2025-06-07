package Questao1;

import java.util.Scanner;

public class LetraA{
    public static void main(String args[]){

        final int totalCarros = 10;

        Scanner teclado = new Scanner(System.in);
        CarrosXPTO[] carros = new CarrosXPTO[totalCarros];
        int i = 0, resp;
        System.out.println("Sistema para registro de carros");
        do{
            System.out.print("\nHá " + i + " registro(s)! O que deseja fazer?\n\n1. Cadastrar\n2. Alterar\n3. Listar\n4. Encerrar programa\n\nOpção esolhida: "); resp = teclado.nextInt();
            switch(resp){
                case 1:
                    carros[i] = new CarrosXPTO();
                    carros[i].cadastrar();
                    i++;
                    break;
                case 2:
                    carros[i].alterar();
                    break;
                case 3:
                    carros[i].listar();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(i!=totalCarros);
    }
}
