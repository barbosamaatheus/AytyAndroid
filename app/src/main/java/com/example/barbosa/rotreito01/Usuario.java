package com.example.barbosa.rotreito01;

/**
 * Created by barbosa on 06/08/16.
 */
public class Usuario {

    private String nome;
    private String sobrenome;
    private String user;
    private String senha;

    public Usuario(String nome, String sobrenome, String user, String senha){
        this.nome = nome;
        this.sobrenome =sobrenome;
        this.user=user;
        this.senha=senha;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
