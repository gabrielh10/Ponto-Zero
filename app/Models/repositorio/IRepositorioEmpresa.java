package Models.repositorio;

import Models.entidade.Empresa;

import java.util.List;

public interface IRepositorioEmpresa {
    void cadastrar(Empresa empresa);
    Empresa buscar(String cnpj);
    List<Empresa> mostrarTodas();
    Empresa atualizar(Empresa empresa);
    void remover(Empresa empresa);
}
