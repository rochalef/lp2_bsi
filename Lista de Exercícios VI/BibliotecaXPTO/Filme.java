package BibliotecaXPTO;

public class Filme extends Publicacao{

    private String diretor, atorPrincipal, sinopse;
    private int tempoDuracao;

    public Filme(String titulo, String autor, String genero, String editora, int ano, int quantidade, String diretor, String atorPrincipal, String sinopse, int tempoDuracao){
        super(titulo, autor, genero, editora, ano, quantidade);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    public void imprimirDados(){
        System.out.print("Título: " + titulo + "\nAutor: " + autor + "\nGênero: " + genero + "\nEditora: " + editora + "\nAno: " + ano + "\nQuantidade: " + quantidade + "\nDiretor: " + diretor + "\nAtor Principal: " + atorPrincipal + "\nSinopse: " + sinopse + "\nTempo de Duração: " + tempoDuracao + "\n");
    }
}
