package Banco;

public class Questao2EstudoDeCaso1{
    public static void main(String[] args){
        Televisao tv = new Televisao(50, 110, 5, 10, "Samsung");
        System.out.println("A televisão é da marca " + tv.getMarca() + ". Ela tem " + tv.getPolegadas() + " polegadas e a sua voltagem é de " + tv.getVoltagem() + "V");
        tv.ligar();
        tv.aumentarVol();
        tv.aumentarVol();
        tv.aumentarVol();
        tv.aumentarVol();
        tv.aumentarVol();
        tv.aumentarVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.diminuirVol();
        tv.subirCanal();
        tv.subirCanal();
        tv.descerCanal();
        tv.descerCanal();
        tv.desligar();
    }
}
