import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CartasControllerTest {
    @Test
    void convertePeso() {
        Item i = new Item();
        i.setPeso(1200);
        double total;
        total = i.getPeso()*1000;
        assertEquals(total, 1200000);
    }
}
