package Carro;

public class Questao1EstudoDeCaso1{
    public static void main(String[] args){
        Carro carro = new Carro("Uno", 4, 200, 30);
        System.out.print("O carro é do modelo " + carro.getModelo() + ", possui " + carro.getMarchas() + " marchas, sua velocidade máxima é de " + carro.getVelMax() + " km/h e sua aceleração no arranque é de " + carro.getAceleracao());
        carro.ligar();
        carro.acelerar();
        carro.desacelerar();
        carro.marchaCima();
        carro.marchaBaixo();
        carro.virarDireita();
        carro.virarEsquerda();
        carro.desligar();
    }
}

