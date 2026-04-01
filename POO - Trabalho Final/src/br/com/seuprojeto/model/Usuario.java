package br.com.seuprojeto.model;

public abstract class Usuario {
    protected String nome;
    protected String telefone;

    public Usuario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}