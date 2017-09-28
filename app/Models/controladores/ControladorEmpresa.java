package Models.controladores;

import Models.abstractfactory.RepositorioArrayFactory;
import Models.abstractfactory.RepositorioBDRFactory;
import Models.cadastros.CadastroEmpresa;
import Models.empresa.Empresa;
import Models.empresa.Vaga;
import Models.gmail.ISubSistemaEmail;
import Models.gmail.ServicoEmail;

import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class ControladorEmpresa {
    private CadastroEmpresa cadastroEmpresa;

    public ControladorEmpresa(String conf){
            if(conf.contains("array")){
                cadastroEmpresa = new CadastroEmpresa(new RepositorioArrayFactory());
            } else {
                cadastroEmpresa = new CadastroEmpresa(new RepositorioBDRFactory());
            }
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

    public void adicionarVaga(Vaga vaga, String cnpj){
        cadastroEmpresa.adicionarVaga(vaga, cnpj);
    }
    public Vaga buscarVaga(String idVaga, String cnpj){
        return cadastroEmpresa.buscarVaga(idVaga, cnpj);
    }
    public void removerVaga(String idVaga, String cnpj){
        cadastroEmpresa.removerVaga(idVaga, cnpj);
    }

    public void enviarMensagem(String emailR, String emailD, String titulo, String mensagem){
        ISubSistemaEmail sistema = new ServicoEmail();
        sistema.enviarEmail(emailR, emailD, titulo, mensagem);
    }
}
