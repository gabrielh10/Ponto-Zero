package Models.abstractfactory;

import Models.empresa.IRepositorioEmpresa;
import Models.empresa.RepositorioEmpresaBDR;
import Models.estudante.IRepositorioEstudante;
import Models.estudante.RepositorioEstudanteBDR;

/**
 * Created by ghds on 25/09/2017.
 */
public class RepositorioBDRFactory extends RepositorioAbstractFactory {
 /*   public void criarRepositoriosBDR(){
       new RepositorioEmpresaBDR();
       new RepositorioEstudanteBDR();

    }
    public void criarRepositoriosArray(){
        new RepositorioEmpresaArray();
        new RepositorioEstudanteArray();
    }
*/
    @Override
    public IRepositorioEmpresa criarRepositoriosEmpresa() {
       return new RepositorioEmpresaBDR();
    }

    @Override
    public IRepositorioEstudante criarRepositoriosEstudante() {
       return new RepositorioEstudanteBDR();
    }
}
