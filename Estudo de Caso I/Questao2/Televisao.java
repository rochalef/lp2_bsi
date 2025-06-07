package Questao2;

public class Televisao{

    private float polegadas;
    private int volume, voltagem, canal;
    private String marca;
    private boolean ligaDesliga = false;

    public Televisao(float polegadas, int voltagem, int volume, int canal, String marca) {
        this.polegadas = polegadas;
        this.voltagem = voltagem;
        this.volume = volume;
        this.canal = canal;
        this.marca = marca;
    }

    public float getPolegadas() {return polegadas;}
    public void setPolegadas(float polegadas) {this.polegadas = polegadas;}

    public int getVoltagem() {return voltagem;}
    public void setVoltagem(int voltagem) {this.voltagem = voltagem;}

    public int getVolume() {return volume;}
    public void setVolume(int volume) {this.volume = volume;}

    public int getCanal() {return canal;}
    public void setCanal(int canal) {this.canal = canal;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public void ligar(){
        if(!ligaDesliga){
            System.out.println("Ligando a TV...\nTV ligada! O consumo é de " + (polegadas*voltagem));
            ligaDesliga=true;
        }else{
            System.out.println("A televisão já está ligada!");
        }
    }
    public void desligar(){
        if(ligaDesliga){
            System.out.println("Desligando a TV...\nTV desligada!");
            ligaDesliga=false;
        }else{
            System.out.println("A televisão já está desligada!");
        }
    }

    public void aumentarVol(){
        if(volume!=10){
            System.out.println("Volume: " + (++volume));
        }else if(volume==10){
            System.out.println("Volume máximo!");
        }
    }
    public void diminuirVol(){
        if(volume!=1){
            System.out.println("Volume: " + (--volume));
        }
    }

    public void subirCanal(){
            System.out.println("Canal: " + (canal++));
    }
    public void descerCanal() {
        if (canal > -1) {
            System.out.println("Canal: " + (canal--));
        }
    }
}
