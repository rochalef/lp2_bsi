package BibliotecaXPTO;

public class ProgramaBiblioteca{
    public static void main(String[] args){

        Livro livro = new Livro("Amigo Imaginário", "Stephen Chbosky", "Horror e Ficção", "Record", 2020, 100, 1, "8501118893");
        Filme filme = new Filme("Encanto", "Lin-Manuel Miranda, Byron Howard, Jared Bush, Charise Castro Smith, Nancy Kruse", "Animação", "Disney", 2021, 18, "Byron Howard, Jared Bush", "Mirabel", "Uma menina colombiana pode ser a última esperança de sua família ao descobrir que a magia que envolve o Encanto, um lugar que abençoa crianças com dons únicos, está em perigo.", 109);
        Publicacao[] pub = new Publicacao[2];
        pub[0] = livro;
        pub[1] = filme;
        for(int i = 0; i < pub.length; i++){
            pub[i].imprimirDados();
            System.out.print("\n");
        }

    }
}
