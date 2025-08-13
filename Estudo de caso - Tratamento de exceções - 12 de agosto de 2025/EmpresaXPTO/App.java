package EmpresaXPTO;

import java.util.Scanner;

public class App{
    public static void main(String[] args) throws MatriculaDuplicadaException {

        final int totalAlunos = 10;
        int i = 0;
        String nome, matricula, endereco;
        Scanner teclado = new Scanner(System.in);
        Aluno[] a = new Aluno[totalAlunos];

        do {
            a[i] = new Aluno();
            System.out.print("Há " + i + " aluno(s) cadastrado(s) no sistema até agora.\n\nPara cadastrar, digite o nome do aluno: ");
            nome = teclado.nextLine();
            a[i].setNome(nome);
            System.out.print("Agora informe o número de matrícula: ");
            matricula = teclado.nextLine();
            a[i].setMatricula(false, matricula);
            if(i!=0){
                for(int j = 0; j <= i; j++){
                    if(matricula == a[j].getMatricula()){
                        a[i].setMatricula(true, matricula);
                    }else{
                        a[i].setMatricula(false, matricula);
                    }
                }
            }
            System.out.print("Por último, informe o endereço: ");
            endereco = teclado.nextLine();
            System.out.print("\n");
            ++i;
        }while(i != totalAlunos);

        System.out.print("\n\nTotal de alunos atingido!");

    }
}
