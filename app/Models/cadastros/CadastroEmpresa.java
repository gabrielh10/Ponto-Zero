package Models.cadastros;

import Models.entidade.Empresa;
import Models.repositorio.IRepositorioEmpresa;

import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class CadastroEmpresa {
    private IRepositorioEmpresa repositorio;

    public CadastroEmpresa(){}

    public void cadastrar(Empresa empresa){
        repositorio.cadastrar(empresa);
    }
    public Empresa buscar(String cnpj) {
        return repositorio.buscar(cnpj);
    }
    public List<Empresa> mostrarTodas(){
       return repositorio.mostrarTodas();
    }
    public Empresa atualizar(Empresa empresa){
       return repositorio.atualizar(empresa);
    }
    public void remover(Empresa empresa){
        repositorio.remover(empresa);
    }
}
