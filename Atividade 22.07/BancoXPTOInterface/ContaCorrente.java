package BancoXPTOInterface;

public class ContaCorrente{
    private double saldo=0;
    private Debito oprDebito = new Debito();
    private Credito oprCredito = new Credito();
    public void executarOperacao(Debito opr, double valor){
        this.saldo += opr.operar();
    }
    public void executarOperacao(Credito opr, double valor){
        this.saldo += opr.operar();
    }
    public double getSaldo(){return saldo;}
    
    public ContaCorrente(){}

}