package Banco;

public class ContaPoupanca{

    private String nomeCorrentista, rg, cpf, agencia;
    private float saldo;
    private int numero;

    public ContaPoupanca(){}

    public void cadastrarAlterar(String nomeCorrentista, String rg, String cpf, String agencia, float saldo, int numero) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.agencia = agencia;
        this.saldo = saldo;
        this.numero = numero;
    }

    public void imprimirSaldo(){
        System.out.println("Saldo de " + nomeCorrentista + ": " + saldo + " reais");
    }

}
