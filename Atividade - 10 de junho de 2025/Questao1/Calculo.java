package Questao1;

public class Calculo{
    private double totalSalario;

    public double calculaSalario(double salarioBase, int horasTrabalhadas) {
        totalSalario = salarioBase*horasTrabalhadas;
        return totalSalario;
    }

    public double getTotalSalario(){return totalSalario;}

}