package EmpresaXPTO;

public class Aluno{
    private String nome, matricula, endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean ex, String matricula) throws MatriculaDuplicadaException{
        if(ex == true){
            MatriculaDuplicadaException e = new MatriculaDuplicadaException(nome);
            throw e;
        }else{
            this.matricula = matricula;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
