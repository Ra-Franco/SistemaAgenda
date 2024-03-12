package org.example.model;

public class Usuario {
    private String nome;
    private String password;

    public Usuario(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verificaSenha(String senha){
        if (this.password != senha ){
            return false;
        }
        return true;
    }
}
