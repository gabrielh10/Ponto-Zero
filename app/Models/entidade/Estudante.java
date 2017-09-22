package Models.entidade;

public class Estudante {
    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private Endereco endereco;
    private String email;
    private Curriculo curriculo;

    private Estudante(String id, String nome, String cpf, String dataNascimento, String telefone, Endereco endereco, String email, Curriculo curriculo){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.curriculo = curriculo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }

    public String getDataNascimento() {
        return dataNascimento;

    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public String getId() {
        return id;
    }


}
