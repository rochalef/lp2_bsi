package BancoXPTOClass;

public class Credito extends Operacao{

    public Credito(){super();}
    public Credito(double atDouble){
        super(atDouble);
    }

    @Override
    public double operar(){
        return (atDouble);
    }
}
