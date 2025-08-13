package CalculadoraSeguro;

public class CalculadoraSeguro {


    public CalculadoraSeguro(){}

    public void calcularSeguro(int idadeCondutor, double valorCarro){
//        Caso contrário, o seguro será 5% do valor do veículo, com um adicional de 2% se o
//        condutor tiver menos de 25 anos
        if(idadeCondutor<25){
            System.out.println("valor do seguro: "+(valorCarro*0.07));
        }else{
            System.out.println("valor do seguro: "+(valorCarro*0.05));
        }
    }



}
