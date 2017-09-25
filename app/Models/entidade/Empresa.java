package Models.entidade;

public class Empresa {
    private String id;
    private String nome;
    private String ramo;
    private String cnpj;
    private String telefone;
    private String email;
    private String site;
    private Endereco endereco;

    public Empresa(){}
    public Empresa(String id, String nome, String ramo, String cnpj, String telefone, String email, String site, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.ramo = ramo;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setSite(String site) {
        this.site = site;
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
