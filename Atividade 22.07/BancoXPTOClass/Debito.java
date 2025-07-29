package BancoXPTOClass;

public class Debito extends Operacao{

    public Debito(){}
    public Debito(double atDouble){
        super(atDouble);
    }

    public double operar(){
        return (atDouble*(-1));
    }
}
