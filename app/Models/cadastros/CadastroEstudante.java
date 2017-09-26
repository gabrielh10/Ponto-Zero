package Models.cadastros;

import Models.abstractfactory.RepositorioAbstractFactory;
import Models.entidade.Estudante;
import Models.repositorio.IRepositorioEstudante;

import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class CadastroEstudante {
    private IRepositorioEstudante repositorio;

    public CadastroEstudante(RepositorioAbstractFactory abstractFactory){
        repositorio = abstractFactory.criarRepositoriosEstudante();
    }

    public void cadastrar(Estudante estudante){
        repositorio.cadastrar(estudante);
    }
    public Estudante buscar(String cpf) {
        return repositorio.buscar(cpf);
    }
    public List<Estudante> mostrarTodos(){return repositorio.mostrarTodos();}
    public Estudante atualizar(Estudante empresa){
        return repositorio.atualizar(empresa);
    }
    public void remover(Estudante empresa){
        repositorio.remover(empresa);
    }
}



