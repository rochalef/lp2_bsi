package BancoXPTOInterface;

public class Credito implements IOperacao {
    private double atDouble;
    public Credito(){}
    public Credito(double atDouble){
        this.atDouble=atDouble;
    }

    @Override
    public double operar(){
        return (atDouble);
    }
}
