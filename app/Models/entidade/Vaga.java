package Models.entidade;

import java.util.Date;

public class Vaga {
    private String id;
    private String nome;
    private Date dataAbertura;
    private String setor;
    private String funcao;
    private String descricao;

    public Vaga(){}

    public Vaga(String id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Vaga(String id, String nome, String setor, String funcao, String descricao){
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
        this.descricao = descricao;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public String getSetor() {
        return setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getDescricao() {
        return descricao;
    }
}
