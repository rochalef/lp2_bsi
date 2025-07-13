package BibliotecaXPTO;

public class Livro extends Publicacao{

    private int edicao;
    private String isbn;

    public Livro(String titulo, String autor, String genero, String editora, int ano, int quantidade, int edicao, String isbn){
        super(titulo, autor, genero, editora, ano, quantidade);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public void imprimirDados(){
        System.out.print("Título: " + titulo + "\nAutor: " + autor + "\nGênero: " + genero + "\nEditora: " + editora + "\nAno: " + ano + "\nQuantidade: " + quantidade + "\nEdição: " + edicao + "\nISBN: " + isbn + "\n");
    }

}
