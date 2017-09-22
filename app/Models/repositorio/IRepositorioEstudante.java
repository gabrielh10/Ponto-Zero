package Models.repositorio;
import Models.entidade.Estudante

import java.util.List;

public interface IRepositorioEstudante {
    void cadastrar(Estudante estudante);
    Estudante buscar(Estudante estudante);
    List<Estudante> mostrarTodos();
    Estudante atualizar (Estudante estudante);
    void remover(Estudante estudante);
}
