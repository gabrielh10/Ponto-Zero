package Models.estudante;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ghds on 26/09/2017.
 */
public class RepositorioEstudanteArray implements IRepositorioEstudante {
    private ArrayList<Estudante> rep;

    public void cadastrar(Estudante estudante){
        rep.add(estudante);
    }
    public Estudante buscar(String cpf){
        for (Estudante estudante : rep) {
            if(estudante.getCpf().equals(cpf)){
                return estudante;
            }
        }
        return null;
    }
    public List<Estudante> mostrarTodos(){
        return rep;
    }
    public Estudante atualizar (Estudante estudante){
        return estudante;
    }
    public void remover(Estudante estudante){
        rep.remove(estudante);
    }

}
