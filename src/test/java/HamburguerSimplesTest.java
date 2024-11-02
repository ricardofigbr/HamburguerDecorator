import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerSimplesTest {

    @Test
    void deveRetornarHamburguerSimplesComQueijoPresuntoTomate() {
        Hamburguer hamburguer = new Tomate(new Queijo(new Presunto((new HamburguerSimples(8.0f)))));

        assertEquals(9.5f, hamburguer.getPrice());
    }

}