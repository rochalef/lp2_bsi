package Professor;

public class FaculdadeXPTO{
    public static void main(String[] args){
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        prof1.cadastrarAlterar("Sabrina TravaZap", "Doutora", "Habbo Hotel", "Bobba", 32, 168);
        prof1.imprimirDados();
        prof1.cadastrarAlterar("Sabrina TravaZap", "Doutora", "Habbo Hotel", "Bobba", 33, 167);
        prof1.imprimirDados();
        prof2.cadastrarAlterar("Marcela Nicole", "Mestre", "Cavaloterapia", "Terapia para cavalos", 19000, 40);
        prof2.imprimirDados();
        prof2.cadastrarAlterar("Rubinho", "Mestre", "Cavaloterapia", "Terapia para cavalos", 19000, 40);
        prof2.imprimirDados();
    }
}
