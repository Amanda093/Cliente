package model;

public class Cliente {
    // protected é um nível de acesso que permite o acesso dentro do mesmo pacote ou por subclasses em pacotes diferentes.
    protected String cod;
    protected String nome;
    protected String rg;
    protected String email;
    protected String telefone;
    protected String endereco;

    // constructor
    public Cliente(String cod, String nome, String rg, String email, String telefone, String endereco) {
        this.cod = cod;
        this.nome = nome;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // getters & setters
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
