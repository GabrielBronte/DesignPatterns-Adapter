import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DinheiroTest {
    @Test
    void deveRetornarValorEmReal() {
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.setDinheiro(1);

        assertEquals(1, dinheiro.getDinheiro());
    }

    @Test
    void deveRetornarValorEmDolar() {
        Dinheiro escala = new Dinheiro();
        escala.setDinheiro((float)5.53);

        assertEquals(1, escala.getDolar());
    }
}