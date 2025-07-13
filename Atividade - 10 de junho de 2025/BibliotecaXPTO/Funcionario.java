package BibliotecaXPTO;

public class Funcionario{

    private String nome, dataContratacao;
    public String cpf, rg;
    private double salarioBase, salario;
    private int horasTrabalhadas, matricula;
    private Calculo calcSalario = new Calculo();

    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas, String dataContratacao){
        this.nome = nome;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
        matricula = geraMatricula++;
    }

    public void calculaSalario(){
        salario = calcSalario.calculaSalario(salarioBase, horasTrabalhadas);
    }

    public void imprimirDados(){
        System.out.print("Nome: " + nome + "\nCPF: " + cpf + "\nRG: " +  rg + "\nSalário final: " + salario + "\nSalário base: " + salarioBase + "\nHoras trabalhadas: " + horasTrabalhadas + "\nMatrícula: " + matricula + "\nData de contratação: " + dataContratacao);
    }
}