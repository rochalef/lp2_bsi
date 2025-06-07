package Carro;

import java.util.Scanner;

public class CarrosXPTO{

    Scanner teclado = new Scanner(System.in);

    private String codigo, marca, cor, modelo, tipoCombustivel, basicoCompleto;
    private int anoFab, numPortas, qtdDisp, preco;

    public CarrosXPTO(){}

    public String getModelo() {
        return modelo;
    }

    public void cadastrar(){
        System.out.print("Para o cadastro de um novo carro no sistema, preciso que informe algumas informações com relação ao carro que deseja cadastrar.\n\nMarca: "); this.marca = teclado.nextLine();
        System.out.print("Modelo: "); modelo = teclado.nextLine();
        System.out.print("Código (4 letra e 4 números): "); codigo = teclado.nextLine();
        System.out.print("Cor: "); cor = teclado.nextLine();
        System.out.print("Tipo de combustível que usa: "); tipoCombustivel = teclado.nextLine();
        System.out.print("Número de portas: "); numPortas = teclado.nextInt();
        System.out.print("Ano de fabricação: "); anoFab = teclado.nextInt();
        System.out.print("Quantidade disponível: "); qtdDisp = teclado.nextInt();
        System.out.print("Preço: "); preco = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Básico ou completo: "); basicoCompleto = teclado.nextLine();
    }

    public void alterar(){
        int resp;
        System.out.print("O que deseja alterar?\n\n1. Marca\n2. Modelo\n3. Código\n4. Cor\n5. Tipo de Combustível\n6. Número de portas\n7. Ano de fabricação\n8. Quantidade disponivel\n9. Preço\n10. Básico ou Completo\n11. Voltar ao menu\n\nOpção escolhida: "); resp = teclado.nextInt();
        teclado.nextLine();
        switch(resp){
            case 1:
                System.out.print("\n\nAtualmente: " + marca + "\nDigite a mudança: "); marca = teclado.nextLine();
                break;
            case 2:
                System.out.print("\n\nAtualmente: " + modelo + "\nDigite sua mudança: "); modelo = teclado.nextLine();
                break;
            case 3:
                System.out.print("\n\nAtualmente: " + codigo + "\nDigite sua mudança: "); codigo = teclado.nextLine();
                break;
            case 4:
                System.out.print("\n\nAtualmente: " + cor + "\nDigite sua mudança: "); cor = teclado.nextLine();
                break;
            case 5:
                System.out.print("\n\nAtualmente: " + tipoCombustivel + "\nDigite sua mudança: "); tipoCombustivel = teclado.nextLine();
                break;
            case 6:
                System.out.print("\n\nAtualmente: " + numPortas + "\nDigite sua mudança: "); numPortas = teclado.nextInt();
                break;
            case 7:
                System.out.print("\n\nAtualmente: " + anoFab + "\nDigite sua mudança: "); anoFab = teclado.nextInt();
                break;
            case 8:
                System.out.print("\n\nAtualmente: " + qtdDisp + "\nDigite sua mudança: "); qtdDisp = teclado.nextInt();
                break;
            case 9:
                System.out.print("\n\nAtualmente: " + preco + "\nDigite sua mudança: "); preco = teclado.nextInt();
                break;
            case 10:
                System.out.print("\n\nAtualmente: " + basicoCompleto + "\nDigite sua mudança: "); basicoCompleto = teclado.nextLine();
                break;
            case 11:
                System.out.println("\n\nVoltando ao menu...");
                break;
            default:
                System.out.println("\n\nOpção inválida!");
                break;

        }
    }

    public void listar(){
        System.out.print("\n\nMarca: " + marca + "\nModelo: " + modelo + "\nCódigo: " + codigo + "\nCor: " + cor + "\nTipo de Combustível: " + tipoCombustivel + "\nNúmero de portas: " + numPortas + "\nAno de fabricação: " + anoFab + "\nQuantidade disponivel: " + qtdDisp + "\nPreço: " + preco + "\nBásico ou Completo: " + basicoCompleto);
    }

}
