package Models.fachada;

import Models.abstractfactory.RepositorioAbstractFactory;
import Models.abstractfactory.RepositorioBDRFactory;
import Models.controladores.ControladorEmpresa;
import Models.controladores.ControladorEstudante;
import Models.entidade.Empresa;
import Models.entidade.Estudante;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class Fachada {
    private static Fachada fachada;
    private ControladorEmpresa controladorEmpresa;
    private ControladorEstudante controladorEstudante;

    private Fachada() throws IOException {
        fachada.getInstance();
        String conf = choseRep();
        controladorEmpresa = new ControladorEmpresa(conf);
        controladorEstudante = new ControladorEstudante(conf);
    }

    public static Fachada getInstance() throws IOException {               // singleton pattern
        if(fachada == null){
            fachada = new Fachada();
        }
        return fachada;
    }

    public String choseRep(){             //lembrar de ajustar onde vai ficar e como passar o parametro de escolha
       //     BufferedReader buffer = new BufferedReader(new FileReader("arq.txt" ));
      //      String conf = buffer.readLine();
            return "array";
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
