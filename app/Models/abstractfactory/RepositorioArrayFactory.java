package Models.abstractfactory;

import Models.empresa.IRepositorioEmpresa;
import Models.estudante.IRepositorioEstudante;
import Models.empresa.RepositorioEmpresaArray;
import Models.estudante.RepositorioEstudanteArray;

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
