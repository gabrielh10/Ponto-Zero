package Models.controladores;

import Models.cadastros.CadastroEstudante;
import Models.entidade.Estudante;

import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class ControladorEstudante {
    private CadastroEstudante cadastroEstudante;

    public ControladorEstudante(){
      //  cadEstudate = new CadastroEstudante(new Rep...);
    }

    public void cadastrar(Estudante estudante){
        cadastroEstudante.cadastrar(estudante);
    }
    public Estudante buscar(String cnpj) {

        return cadastroEstudante.buscar(cnpj);
    }
    public List<Estudante> mostrarTodos(){

        return cadastroEstudante.mostrarTodos();
    }
    public Estudante atualizar(Estudante empresa){

        return cadastroEstudante.atualizar(empresa);
    }
    public void remover(Estudante empresa){
        cadastroEstudante.remover(empresa);
    }

}
