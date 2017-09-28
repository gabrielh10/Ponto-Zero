package Models.empresa;

import Models.empresa.Empresa;
import Models.empresa.Vaga;

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
