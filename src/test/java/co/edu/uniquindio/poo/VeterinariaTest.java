package co.edu.uniquindio.poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.logging.Logger;



class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
    public void testAssertTrue() {
        LOG.info("Inicio Test AssertTrue");
        Mascota mascota = new Mascota("Firulais","perro","Husky", "2", "1113618192", "Oscar","3242305570");
        assertTrue(mascota.getNombre().equals("Firulais"));
        LOG.info("Fin test assertTrue");
    }

    @Test
    public void testAssertNotEquals(){
        LOG.info("Inicio Test NotEquals");
        Mascota mascota = new Mascota("Firulais","perro","Husky", "2", "1113618192", "Oscar","3242305570");
        assertNotEquals("999", mascota.getIdentificacion() );
        LOG.info("Fin test NotEquals");
    }
}






