package Colecao;

public class Livro{
    private int isbn;
    private String autor, editora, titulo;

    public Livro(int isbn, String autor, String editora, String titulo){
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public int getIsbn(){return isbn;}

    public String toString(){
        return "ISBN: " + isbn + " | Título: " + titulo + " | Autor(a): " + autor + " | Editora: " + editora;
    }
}
