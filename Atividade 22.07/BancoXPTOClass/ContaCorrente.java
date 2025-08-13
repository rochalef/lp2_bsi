package BancoXPTOClass;

public class ContaCorrente{
    private double saldo=0;
    private Operacao oprDebito = new Debito();
    private Operacao oprCredito = new Credito();
    public void executarOperacao(Operacao opr, double valor){
        this.saldo += opr.operar();
    }
    public double getSaldo(){return saldo;}
    
    public ContaCorrente(){}

}