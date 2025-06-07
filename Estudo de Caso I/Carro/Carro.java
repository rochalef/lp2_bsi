package Carro;

public class Carro{

    private String modelo;
    private int marchas;
    private float velMax, aceleracao;
    private boolean ligaDesliga = false;

    public Carro(String modelo, int marchas, float velMax, float aceleracao){
        this.modelo = modelo;
        this.marchas = marchas;
        this.velMax = velMax;
        this.aceleracao = aceleracao;
    }
    
    public void setModelo(String modelo){this.modelo = modelo;}
    public String getModelo(){return modelo;}

    public void setMarchas(int marchas){this.marchas = marchas;}
    public int getMarchas(){return marchas;}

    public void setVelMax(float velMax){this.velMax = velMax;}
    public float getVelMax(){return velMax;}
    
    public void setAceleracao(float aceleracao){this.aceleracao = aceleracao;}
    public float getAceleracao(){return aceleracao;}
    
    public void ligar(){
        if(!ligaDesliga){
            ligaDesliga = true;
            System.out.print("\nCarro ligado!");
        }else{
            System.out.print("\nO carro ja ligado!");
        }
    }
    public void desligar(){
        if(ligaDesliga){
            ligaDesliga = false; 
            System.out.println("\nCarro desligado!");
        }else{
            System.out.print("\nO carro ja desligado!");
        }
    }
    
    public void acelerar(){System.out.print("\nO carro esta acelerando!");}
    public void desacelerar(){System.out.print("\nO carro esta desacelerando!");}
    
    public void virarDireita(){System.out.print("\nVirando a direita!");}
    public void virarEsquerda(){System.out.print("\nVirando a esquerda!");}
    
    public void marchaCima(){System.out.print("\nMarcha para cima");}
    public void marchaBaixo(){System.out.print("\nMarcha para baixo");}
    
    
}
