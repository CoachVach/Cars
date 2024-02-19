import org.junit.Test;
import static org.junit.Assert.*;

public class AutoTest {

    @Test
    public void testGetPrecio() {
        Auto auto = new Auto(20000, 50000, 50);
        assertEquals(20000, auto.getPrecio());
    }

    @Test
    public void testGetKilometros() {
        Auto auto = new Auto(20000, 50000, 50);
        assertEquals(50000, auto.getKilometros());
    }

    @Test
    public void testGetGasolina() {
        Auto auto = new Auto(20000, 50000, 50);
        assertEquals(50, auto.getGasolina());
    }

    @Test
    public void testGetCapacidad() {
        Auto auto = new Auto(20000, 50000, 50);
        assertEquals(50, auto.getCapacidad());
    }

    // You can add more tests as needed
}
