package Funcionario;

public class EmpresaXPTO {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.cadastrarAlterar("João Silva", "01/01/1990", "12.345.678-9", "123.456.789-00", "Rua A, 123", "São Paulo", "Engenheiro", "Superior", "001", 5000);
        func1.imprimirDados();
        func1.cadastrarAlterar("João Silva", "01/01/1990", "12.345.678-9", "123.456.789-00", "Rua A, 123", "São Paulo", "Gerente", "Pós-graduação", "001", 7000);
        func1.imprimirDados();
        func2.cadastrarAlterar("Maria Oliveira", "05/06/1985", "98.765.432-1", "987.654.321-00", "Av. B, 456", "Campinas", "Analista", "Superior", "002", 4500);
        func2.imprimirDados();
        func2.cadastrarAlterar("Carlos Souza", "10/12/1980", "11.223.344-5", "111.222.333-44", "Rua C, 789", "Ribeirão Preto", "Coordenador", "Mestrado", "003", 8000);
        func2.imprimirDados();
    }
}
