package org.boardgame;

public class BoardGame {
    private String nome;
    private int jogadoresMin;
    private int jogadoresMax;

    public BoardGame(String nome, int jogadoresMin, int jogadoresMax) {
        this.nome = nome;
        this.jogadoresMin = jogadoresMin;
        this.jogadoresMax = jogadoresMax;
    }

    public String getNome() {
        return nome;
    }

    public int getJogadoresMin() {
        return jogadoresMin;
    }

    public int getJogadoresMax() {
        return jogadoresMax;
    }
}

