package Models.controladores;

import Models.cadastros.CadastroEmpresa;
import Models.entidade.Empresa;

import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class ControladorEmpresa {
    private CadastroEmpresa cadastroEmpresa;

    public ControladorEmpresa(){
    //    cadEmpresa = new CadastroEmpresa(new RepositorioEmpresaTempo())
    }

    public void cadastrar(Empresa empresa){
       cadastroEmpresa.cadastrar(empresa);
    }
    public Empresa buscar(String cnpj) {

        return cadastroEmpresa.buscar(cnpj);
    }
    public List<Empresa> mostrarTodas(){

        return cadastroEmpresa.mostrarTodas();
    }
    public Empresa atualizar(Empresa empresa){

        return cadastroEmpresa.atualizar(empresa);
    }
    public void remover(Empresa empresa){
        cadastroEmpresa.remover(empresa);
    }

}
