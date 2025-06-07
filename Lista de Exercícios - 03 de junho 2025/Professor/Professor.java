package Professor;

public class Professor{

    private String nome, titulacao, formacao, descDisciplina;
    private float salario;
    private int cargaHoraria;

    public Professor(){}

    public void cadastrarAlterar(String nome, String titulacao, String formacao, String descDisciplina, float salario, int cargaHoraria){
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.descDisciplina = descDisciplina;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public void mudarDisc(String descDisciplina){
        this.descDisciplina = descDisciplina;
    }

    public void imprimirDados(){
        System.out.println("\nNome: " + nome + "\nTitulação: " + titulacao + "\nFormação: " + formacao + "\nDisciplina: " + descDisciplina + "\nSalário: " + salario + "\nCarga Horária: " + cargaHoraria);
    }

}
