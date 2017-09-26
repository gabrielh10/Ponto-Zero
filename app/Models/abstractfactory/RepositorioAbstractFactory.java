package Models.abstractfactory;

import Models.repositorio.IRepositorioEmpresa;
import Models.repositorio.IRepositorioEstudante;

/**
 * Created by ghds on 25/09/2017.
 */
public abstract class RepositorioAbstractFactory {
    public abstract IRepositorioEmpresa criarRepositoriosEmpresa();
    public abstract IRepositorioEstudante criarRepositoriosEstudante();
}
