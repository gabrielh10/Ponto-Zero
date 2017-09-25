package Models.fachada;

import Models.abstractfactory.RepositorioAbstractFactory;
import Models.abstractfactory.RepositorioBDRFactory;
import Models.controladores.ControladorEmpresa;
import Models.controladores.ControladorEstudante;
import Models.entidade.Empresa;
import Models.entidade.Estudante;

import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class Fachada {
    private static Fachada fachada;
    private ControladorEmpresa controladorEmpresa;
    private ControladorEstudante controladorEstudante;

    private Fachada(){}

    public static Fachada getInstance(){               // singleton pattern
        if(fachada == null){
            fachada = new Fachada();
        }
        return fachada;
    }

    public void choseRep(){             //lembrar de ajustar onde vai ficar e como passar o parametro de escolha
        RepositorioBDRFactory rep = new RepositorioBDRFactory();

    }

    public void cadastrarEmpresa(Empresa empresa){
        controladorEmpresa.cadastrar(empresa);
    }
    public Empresa buscarEmpresa(String cnpj) {

        return controladorEmpresa.buscar(cnpj);
    }
    public List<Empresa> mostrarTodasEmpresas(){

        return controladorEmpresa.mostrarTodas();
    }
    public Empresa atualizarEmpresa(Empresa empresa){

        return controladorEmpresa.atualizar(empresa);
    }
    public void removerEmpresa(Empresa empresa){

        controladorEmpresa.remover(empresa);
    }

    public void cadastrarEstudante(Estudante estudante)
    {
        controladorEstudante.cadastrar(estudante);
    }
    public Estudante buscarEstudante(String cnpj) {

        return controladorEstudante.buscar(cnpj);
    }
    public List<Estudante> mostrarTodosEstudantes(){

        return controladorEstudante.mostrarTodos();
    }
    public Estudante atualizarEstudante(Estudante empresa){

        return controladorEstudante.atualizar(empresa);
    }
    public void removerEstudante(Estudante empresa) {

        controladorEstudante.remover(empresa);
    }
}
