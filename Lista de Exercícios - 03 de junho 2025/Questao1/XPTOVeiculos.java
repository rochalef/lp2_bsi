package Questao1;

import java.util.Scanner;

public class XPTOVeiculos{
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
                    if(i==totalCarros){
                        System.out.print("Não há mais espaço para registrar mais carros!");
                    }else{
                        carros[i] = new CarrosXPTO();
                        carros[i].cadastrar();
                        i++;
                        break;
                    }
                case 2:
                    if(i == 0){
                        System.out.println("´\n\nAinda não há nenhum carro registrado!\n");
                    }else{
                        System.out.println("Qual deseja alterar?");
                        int a;
                        for (a = 0; a < i; a++) {
                            System.out.print("\n" + (a + 1) + ". " + carros[a].getModelo() + "\n");
                        }
                        System.out.print("Opção escolhida: ");
                        a = teclado.nextInt();
                        if (a < 1 && a > i) {
                            System.out.print("Opção inválida!");
                            break;
                        } else {
                            carros[a-1].alterar();
                        }
                    }
                    break;
                case 3:
                    for(int a = 0; a<i; a++){
                        carros[a].listar();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }while(resp!=4);
    }
}
