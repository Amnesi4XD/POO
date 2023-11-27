package com.jogadores;

public class Jogador {
    private String nome;
    private String funcao;
    private String nomeTime;
    private String patente;

    public Jogador(String nome, String funcao, String nomeTime, String patente) {
        this.nome = nome;
        this.funcao = funcao;
        this.nomeTime = nomeTime;
        this.patente = patente;
    }

    public String getJogador() {
        return "Nome: " + this.nome + "\nFunção: " + this.funcao + "\nTime: " + this.nomeTime + "\nPatente: "
                + this.patente;
    }
}
