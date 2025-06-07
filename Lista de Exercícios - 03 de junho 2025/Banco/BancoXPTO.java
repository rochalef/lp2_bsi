package Banco;

public class BancoXPTO{
    public static void main(String[] args){
        ContaPoupanca pessoa1 = new ContaPoupanca();
        ContaPoupanca pessoa2 = new ContaPoupanca();
        pessoa1.cadastrarAlterar("Marcelo Nicolas", "000.000.111-23", "000.000.111-23", "41", 20, 981971210);
        pessoa1.imprimirSaldo();
        pessoa1.cadastrarAlterar("Marcelo Nicolas", "000.000.111-23", "000.000.111-23", "41", 21, 981971210);
        pessoa1.imprimirSaldo();
        pessoa2.cadastrarAlterar("Neide", "20.567.876-90", "123.123.456-56", "01", 90000, 911234567);
        pessoa2.imprimirSaldo();
        pessoa2.cadastrarAlterar("Neidenalva", "20.567.876-90", "123.123.456-56", "01", 9, 911234567);
        pessoa2.imprimirSaldo();
    }
}
