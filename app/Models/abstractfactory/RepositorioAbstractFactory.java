package Models.abstractfactory;

import Models.empresa.IRepositorioEmpresa;
import Models.estudante.IRepositorioEstudante;

/**
 * Created by ghds on 25/09/2017.
 */
public abstract class RepositorioAbstractFactory {
    public abstract IRepositorioEmpresa criarRepositoriosEmpresa();
    public abstract IRepositorioEstudante criarRepositoriosEstudante();
}
