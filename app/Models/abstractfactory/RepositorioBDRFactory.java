package Models.abstractfactory;

import Models.repositorio.IRepositorioEmpresa;
import Models.repositorio.IRepositorioEstudante;
import Models.repositorio.RepositorioEmpresaBDR;
import Models.repositorio.RepositorioEstudanteBDR;

/**
 * Created by ghds on 25/09/2017.
 */
public class RepositorioBDRFactory extends RepositorioAbstractFactory {
    public void criarRepositoriosBDR(){
       new RepositorioEmpresaBDR();
       new RepositorioEstudanteBDR();

    }
    public void criarRepositoriosArray(){

    }

}
