package co.edu.uniquindio;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    @Test
    public void CompararNotNullTest(){
        LOG.info("Inicio de test CompararNotNull");
        Veterinaria veterinaria1 = new Veterinaria("Dogs lifes", "108553");
        Mascota mascota1 = new Mascota("Rokyy", "10933", 2, "Perro");
        assertNotNull(mascota1);
        LOG.info("Fin de test CompararNotNull");
    }
    @Test
    public void CompararNullTest(){
        LOG.info("Inicio de test CompararNull");
        Veterinaria veterinaria2 = new Veterinaria("Animal Medical", "1114");
        Propietario propietario1 = null;
        assertNull(propietario1);
        LOG.info("Fin de test CompararNull");
    }
    @Test
    public void CompararNombreTest(){
        LOG.info("Inicio de test CompararNombre");
        Veterinaria veterinaria3 = new Veterinaria("Snoopys", "16546");
        Mascota mascota3 = new Mascota("Rodrigo", "22234", 4, "perro");
        assertFalse(veterinaria3.verificarNombre("Rodrigo"));
        LOG.info("Fin de test CompararNombre");
    }

    @Test
    public void testFiltrarPorEspecie() {
        LOG.info("Inicio de test FiltrarPorEspecie");
        Veterinaria vet = new Veterinaria("Animal Medical", "1114");

        Mascota m1 = new Mascota("Firulais", "001", 4, "perro");
        Mascota m2 = new Mascota("Michi", "002", 2, "gato");
        Mascota m3 = new Mascota("Rocky", "003", 6, "perro");


        vet.getListMascotas()[0] = m1;
        vet.getListMascotas()[1] = m2;
        vet.getListMascotas()[2] = m3;


        ArrayList<Mascota> perros = vet.filtrarPorEspecie("Perro");

        assertEquals(2, perros.size());
        LOG.info("Fin de test FiltrarPorEspecie");
    }
}
