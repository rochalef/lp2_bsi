package EmpresaXPTO;

public class MatriculaDuplicadaException extends Exception{
    public MatriculaDuplicadaException(String nome){
        super("A matrícula de " + nome + " já foi registrada!");
    }
}
