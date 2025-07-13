package BibliotecaXPTO;

public class Publicacao {

    protected String titulo, autor, genero, editora;
    protected int ano, quantidade;

    public Publicacao(String titulo, String autor, String genero, String editora, int ano, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.ano = ano;
        this.quantidade = quantidade;
    }

    public void setAno(int ano) {this.ano = ano;}
    public void setAutor(String autor) {this.autor = autor;}
    public void setEditora(String editora) {this.editora = editora;}
    public void setGenero(String genero) {this.genero = genero;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getAno() {return ano;}
    public String getAutor() {return autor;}
    public String getEditora() {return editora;}
    public String getGenero() {return genero;}
    public int getQuantidade() {return quantidade;}
    public String getTitulo() {return titulo;}

    protected void imprimirDados(){};
}