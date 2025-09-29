package org.boardgame;


import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<BoardGame> jogos = new ArrayList<>();

    public void adicionar(BoardGame jogo) {
        jogos.add(jogo);
    }

    public List<BoardGame> listar() {
        return jogos;
    }
}
