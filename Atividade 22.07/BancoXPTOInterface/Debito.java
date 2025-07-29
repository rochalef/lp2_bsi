package BancoXPTOInterface;

public class Debito implements IOperacao{
    public double atDouble;
    public Debito(){}
    public Debito(double atDouble){
        this.atDouble=atDouble;
    }

    public double operar(){
        return (atDouble*(-1));
    }
}
