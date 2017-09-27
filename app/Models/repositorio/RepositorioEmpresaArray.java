package Models.repositorio;

import Models.entidade.Empresa;
import Models.entidade.Vaga;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghds on 26/09/2017.
 */
public class RepositorioEmpresaArray implements IRepositorioEmpresa {
    private ArrayList<Empresa> rep = new ArrayList<>();

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
    public void adicionarVaga(Vaga vaga, String cnpjEmpresa){
        Empresa empresa = buscar(cnpjEmpresa);
        empresa.getVagas().add(vaga);
    }
    public void removerVaga(String idVaga, String cnpj){
        Empresa empresa = buscar(cnpj);
        Vaga vaga = buscarVaga(idVaga, cnpj);
        empresa.getVagas().remove(vaga.getId());
    }
    public Vaga buscarVaga(String idVaga, String cnpj) {
        Empresa empresa = buscar(cnpj);
        for(int i=0; i<empresa.getVagas().size();i++){
            if(empresa.getVagas().get(i).getId().equals(idVaga)){
                return empresa.getVagas().get(i);
            }
        }
        return null;
    }
}

