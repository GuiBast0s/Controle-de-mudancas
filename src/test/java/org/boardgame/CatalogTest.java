package org.boardgame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatalogTest {

    @Test
    void deveAdicionarEListarJogo() {
        Catalog catalogo = new Catalog();
        BoardGame jogo = new BoardGame("Catan", 3, 4);

        catalogo.adicionar(jogo);

        assertEquals(1, catalogo.listar().size());
        assertEquals("Catan", catalogo.listar().get(0).getNome());
    }
}
