package controllers;

import Models.entidade.Empresa;
import Models.entidade.Vaga;
import Models.fachada.Fachada;

import play.*;
import play.data.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

import static Models.fachada.Fachada.*;

/**
 * Created by ghds on 26/09/2017.
 */
public class EmpresaController extends Controller {
    @Inject
    private FormFactory formFactory;

    public Result cadastrarVaga() throws IOException {
        Form<Vaga> productForm = formFactory.form(Vaga.class);
        return ok(vagaCadastro.render(productForm));
    }

    public Result listarVagas() throws IOException{
        Fachada fachada = getInstance();
        Empresa empresa = getInstance().buscarEmpresa("a");
        List<Vaga> vagas = empresa.getVagas();
        return ok(vagaList.render(vagas));
    }
    public Result recebeFormVaga() throws IOException{
        Form<Vaga> form = formFactory.form(Vaga.class).bindFromRequest();
        if(form.hasErrors()){
            return badRequest();
        }
        Vaga vaga = form.get();
        getInstance().adicionarVaga(vaga, "a" );
        Empresa empresa = getInstance().buscarEmpresa("a");
        List<Vaga> vagas = empresa.getVagas();
        return ok(vagaList.render(vagas));
    }

    public Result listarEmpresas() throws IOException {         //ajustar objeto sendo cadastro null
        Fachada fachada = getInstance();
        List<Empresa> empresas = fachada.mostrarTodasEmpresas();
        return ok(empresaList.render(empresas));
    }

    public Result mostrarEmpresa(String cnpj) throws IOException {
        Empresa empresa = getInstance().buscarEmpresa(cnpj);
        if (empresa == null) {
            return notFound("Empresa de "+cnpj+" does not exist.");
        }
        Form<Empresa> productForm = formFactory.form(Empresa.class);
        Form<Empresa> filledForm = productForm.fill(empresa);
        return ok(empresaCadastro.render(filledForm));
    }
    public Result cadastrarEmpresa(){
        Form<Empresa> productForm = formFactory.form(Empresa.class);
        return ok(empresaCadastro.render(productForm));
    }
    public Result recebeFormEmpresa() throws IOException {
        Form<Empresa> form = formFactory.form(Empresa.class).bindFromRequest();
        if(form.hasErrors()){
            return badRequest();
        }
        Empresa empresa = form.get();
        getInstance().cadastrarEmpresa(empresa);
        List<Empresa> todasEmpresas = getInstance().mostrarTodasEmpresas();
        return ok(empresaList.render(todasEmpresas));
    }
}
