package Models.repositorio;

import Models.entidade.Empresa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghds on 26/09/2017.
 */
public class RepositorioEmpresaArray implements IRepositorioEmpresa {
    private ArrayList<Empresa> rep;

    public void cadastrar(Empresa empresa){
        rep.add(empresa);
    }
    public Empresa buscar(String cnpj){
        for (Empresa empresa : rep) {
            if(empresa.getCnpj().equals(cnpj)){
                return empresa;
            }
        }
        return null;
    }
    public List<Empresa> mostrarTodas(){
        return rep;
    }
    public Empresa atualizar(Empresa empresa){
        return empresa;
    }
    public void remover(Empresa empresa){
        rep.remove(empresa);
    }
}
