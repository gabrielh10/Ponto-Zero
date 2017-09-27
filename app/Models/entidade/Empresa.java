package Models.entidade;

import java.util.List;

public class Empresa {
    private String id;
    private String nome;
    private String ramo;
    private String cnpj;
    private String telefone;
    private String email;
    private String site;
    private Endereco endereco;
    private List<Vaga> vagas;

    public Empresa() {
    }

    public Empresa(String id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Empresa(String id, String nome, String ramo, String cnpj, String telefone, String email, String site) {
        this.id = id;
        this.nome = nome;
        this.ramo = ramo;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
    }

    public List<Vaga> getVagas(){
        return vagas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome =nome;
    }
    public void setRamo(String ramo){
        this.ramo = ramo;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }

    public String getRamo() {
        return ramo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSite() {
        return site;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
