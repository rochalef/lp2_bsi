package Funcionario;

public class Funcionario{

    private String nome, dataNasc, rg, cpf, endereco, naturalidade, profissao, grauInstrucao, matricula;
    private float salario;

    public Funcionario(){}

    public void cadastrarAlterar(String nome, String dataNasc, String rg, String cpf, String endereco, String naturalidade, String profissao, String grauInstrucao, String matricula, float salario) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void imprimirDados() {
        System.out.println("\nNome: " + nome + "\nData de Nascimento: " + dataNasc + "\nRG: " + rg + "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nNaturalidade: " + naturalidade + "\nProfissão: " + profissao + "\nGrau de Instrução: " + grauInstrucao + "\nMatrícula: " + matricula + "\nSalário: R$ " + salario);
    }


}
