package Models.repositorio;

import Models.entidade.Empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class RepositorioEmpresaBDR implements IRepositorioEmpresa {
   public void cadastrar(Empresa empresa){

   }
   public Empresa buscar(String cnpj){
       Empresa e = new Empresa();
       return e;
   }
    public List<Empresa> mostrarTodas(){
        ArrayList<Empresa> my = new ArrayList<Empresa>();
        return my;
    }
    public Empresa atualizar(Empresa empresa){
        return empresa;
    }
    public void remover(Empresa empresa){

    }

}
