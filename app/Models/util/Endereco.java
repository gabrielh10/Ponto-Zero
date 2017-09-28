package Models.util;

public class Endereco {
    private String cep;
    private String estado;
    private String cidade;

    private Endereco (String cep, String estado, String cidade){
        this.cep = cep;
        this.estado = cep;
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
