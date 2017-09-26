package Models.abstractfactory;

import Models.repositorio.IRepositorioEmpresa;
import Models.repositorio.IRepositorioEstudante;
import Models.repositorio.RepositorioEmpresaArray;
import Models.repositorio.RepositorioEstudanteArray;

/**
 * Created by ghds on 26/09/2017.
 */
public class RepositorioArrayFactory extends RepositorioAbstractFactory{
    @Override
    public IRepositorioEmpresa criarRepositoriosEmpresa() {
        return new RepositorioEmpresaArray();
    }

    @Override
    public IRepositorioEstudante criarRepositoriosEstudante() {
        return new RepositorioEstudanteArray();
    }
}
