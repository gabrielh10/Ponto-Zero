package Models.cadastros;

import Models.abstractfactory.RepositorioAbstractFactory;
import Models.entidade.Empresa;
import Models.entidade.Vaga;
import Models.repositorio.IRepositorioEmpresa;

import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class CadastroEmpresa {
    private IRepositorioEmpresa repositorio;

    public CadastroEmpresa(RepositorioAbstractFactory abstractFactory){
        repositorio = abstractFactory.criarRepositoriosEmpresa();
    }

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
    public void adicionarVaga(Vaga vaga, String cnpj){
        repositorio.adicionarVaga(vaga, cnpj);
    }
    public void removerVaga(String idVaga, String cnpjEmpresa){
        repositorio.removerVaga(idVaga, cnpjEmpresa);
    }
    public Vaga buscarVaga(String idVaga, String cnpjEmpresa){
        return repositorio.buscarVaga(idVaga, cnpjEmpresa);
    }
}
