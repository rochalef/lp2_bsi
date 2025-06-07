package Animal;

public class JardimZoologico{
    public static void main(String[] args){
        Animal cavalo = new Animal();
        Animal estrela = new Animal();
        cavalo.cadastrarAlterar("Marinho", "14/02/1987", "Carlos Magno", "Saubara - Bahia", 1);
        cavalo.imprimirCarac();
        cavalo.cadastrarAlterar("Marinho dos Mares", "14/02/1987", "Carlos Magno", "Saubara - Bahia", 1);
        cavalo.imprimirCarac();
        estrela.cadastrarAlterar("Do mar", "12/12/2012", "Patrick", "Fenda do Biquini - Atol de Bikini", 120938);
        estrela.imprimirCarac();
        estrela.cadastrarAlterar("Do mar", "13/13/2013", "Patrick, a estrela", "Fenda do Biquini - Atol de Bikini", 120938);
        estrela.imprimirCarac();
    }
}
