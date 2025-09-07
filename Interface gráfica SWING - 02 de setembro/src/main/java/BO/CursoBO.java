package BO;
import DAO.CursoDAO;

public class CursoBO{
    private CursoDAO cursodao = new CursoDAO();

    public CursoBO (){}
    public void incluir (Curso curso){
        cursodao.incluir(curso);    
    }

}
