package iesb.br.escolas;



public class ModeloEscola {

    private String codEscola;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public String getCodEscola() {
        return codEscola;
    }

    public void setCodEscola(String codEscola) {
        this.codEscola = codEscola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
