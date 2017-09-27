package Models.repositorio;

import Models.entidade.Empresa;
import Models.entidade.Vaga;

import java.util.List;

public interface IRepositorioEmpresa {
    void cadastrar(Empresa empresa);
    Empresa buscar(String cnpj);
    List<Empresa> mostrarTodas();
    Empresa atualizar(Empresa empresa);
    void remover(Empresa empresa);
    void adicionarVaga(Vaga vaga, String cnpjEmpresa);
    void removerVaga(String idVaga, String cnpjEmpresa);
    Vaga buscarVaga(String idVaga, String cnpjEmpresa);
}
