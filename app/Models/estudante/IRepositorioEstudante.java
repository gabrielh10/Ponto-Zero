package Models.estudante;
import Models.estudante.Estudante;

import java.util.List;

public interface IRepositorioEstudante {
    void cadastrar(Estudante estudante);
    Estudante buscar(String cpf);
    List<Estudante> mostrarTodos();
    Estudante atualizar (Estudante estudante);
    void remover(Estudante estudante);
}
