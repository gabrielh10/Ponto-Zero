package Models.estudante;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghds on 25/09/2017.
 */
public class RepositorioEstudanteBDR implements IRepositorioEstudante {
    public void cadastrar(Estudante estudante){

    }
    public Estudante buscar(String cpf){
        return new Estudante();
    }
    public List<Estudante> mostrarTodos(){
        return new ArrayList<Estudante>();
    }
    public Estudante atualizar (Estudante estudante){
        return new Estudante();
    }
    public void remover(Estudante estudante){

    }
}
