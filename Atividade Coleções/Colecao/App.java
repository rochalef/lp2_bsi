package Colecao;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class App{
    public static void main(String[] args) {
        List<Livro> listaLivro = new ArrayList<>();
        Set<Integer> isbns = new HashSet<>();
        Map<Integer, Livro> mapaLivro = new HashMap<>();

        cadastrarLivro(new Livro(1, "Raphael Montes", "Companhia das Letras", "Uma família feliz"), listaLivro, isbns, mapaLivro);
        cadastrarLivro(new Livro(2, "Stephen Chbosky", "Record", "As vantagens de ser invisível"), listaLivro, isbns, mapaLivro);
        cadastrarLivro(new Livro(3, "Holly Jackson", "Intríseca", "Manual de Assassinato para Boas Garotas"), listaLivro, isbns, mapaLivro);

        cadastrarLivro(new Livro(3, "Holly Jackson", "Intríseca", "Boa Garota, Segredo Mortal"), listaLivro, isbns, mapaLivro);


        listarLivros(listaLivro);
        removerLivro(1, listaLivro, isbns, mapaLivro);
        verificarLivro(2, mapaLivro);
        obterLivro(3, mapaLivro);
        if(listaVazia(listaLivro)){
            System.out.println("A lista está vazia! Registre novos livros no sistema.");
        }else{
            System.out.println("A lista não está vazia! Na verdade, tem " + listaLivro.size() + " livros!");
        }

    }

    static void cadastrarLivro(Livro livro, List<Livro> listaLivro, Set<Integer> isbns, Map<Integer, Livro> mapaLivro){
        if(isbns.contains(livro.getIsbn())){
            System.out.println("ISBN "+ livro.getIsbn() +" já está cadastrado no sistema!");
        }else{
            listaLivro.add(livro);
            isbns.add(livro.getIsbn());
            mapaLivro.put(livro.getIsbn(), livro);
            System.out.println("Livro adicionado no sistema com sucesso!");
        }
    }

    static void listarLivros(List<Livro> listaLivro){
        for (Livro livro : listaLivro) {
            System.out.println(livro);
        }
    }

    static void removerLivro(int isbn, List<Livro> listaLivro, Set<Integer> isbns, Map<Integer, Livro> mapaLivro){
        if(mapaLivro.containsKey(isbn)){
            isbns.remove(isbn);
            listaLivro.remove(mapaLivro.get(isbn));
            mapaLivro.remove(isbn);
            System.out.println("Livro removido do sistema!");
        }else{
            System.out.println("Livro não encontrado no sistema!");
        }
    }

    static void verificarLivro(int isbn, Map<Integer, Livro> mapaLivro){
        if(mapaLivro.containsKey(isbn)){
            System.out.println("Livro já está no sistema!");
        }else{
            System.out.println("Livro não encontrado no sistema!");
        }
    }

    static void obterLivro(int isbn, Map<Integer, Livro> mapaLivro){
        if(mapaLivro.containsKey(isbn)){
            System.out.println(mapaLivro.get(isbn));
        }else{
            System.out.println("Livro não encontrado no sistema!");
        }
    }

    static boolean listaVazia(List<Livro> listaLivro){
        return listaLivro.isEmpty();
    }
}
