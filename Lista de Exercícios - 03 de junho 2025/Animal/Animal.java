package Animal;

public class Animal{

    private String especie, dataNasc, nome, localNasc;
    private int numRegistro;

    public Animal(){}

    public void cadastrarAlterar(String especie, String dataNasc, String nome, String localNasc, int numRegistro){
        this.especie = especie;
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.localNasc = localNasc;
        this.numRegistro = numRegistro;
    }

    public void imprimirCarac(){
        System.out.println("\nEspécie: " + especie + "\nData de Nascimento: " + dataNasc + "\nNome: " + nome + "\nLocal de nascimento: " + localNasc + "\nNúmero de registro: " + numRegistro);
    }

}
