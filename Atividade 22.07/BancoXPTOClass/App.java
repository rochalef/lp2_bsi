package BancoXPTOClass;

public class App {

    public static void main(String[] args){

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();

        Banco banco = new Banco("Andrey", c1, "Michaela", c2,
                "Flavio", c3);

        banco.creditar("Andrey", 3);
        banco.debitar("Michaela", 150);
        banco.transferir("Andrey", "Flavio", 27);

        System.out.println("\nCorrentistas | Saldo" +
                "\nAndrey: " + banco.getSaldo("Andrey") +
                "\nMichaela: " + banco.getSaldo("Michaela") +
                "\nFlavio: " + banco.getSaldo("Flavio"));
    }


}