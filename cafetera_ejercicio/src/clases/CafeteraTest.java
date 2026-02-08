package clases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CafeteraTest {

    // ---------- CONSTRUCTOR ----------

    @Test
    void testConstructorCorrecto() throws Exception {
        Cafetera c = new Cafetera(1000, 500, 100, 200, true);
        assertEquals(1000, c.getCapacidadTotal());
        assertEquals(500, c.getCapacidadRestante());
        assertTrue(c.getEstadoCafetera());
    }

    @Test
    void testConstructorCapacidadRestanteMayor() {
        assertThrows(Exception.class, () -> {
            new Cafetera(1000, 1200, 100, 200, true);
        });
    }

    // ---------- SERVIR TAZA ----------

    @Test
    void testServirTazaCorrecto() throws Exception {
        Cafetera c = new Cafetera(1000, 500, 100, 200, true);
        String resultado = c.servirTaza();

        assertEquals("Taza servida", resultado);
        assertEquals(400, c.getCapacidadRestante());
    }

    @Test
    void testServirTazaSinAgua() throws Exception {
        Cafetera c = new Cafetera(1000, 50, 100, 200, true);

        assertThrows(Exception.class, () -> {
            c.servirTaza();
        });
    }

    @Test
    void testServirTazaApagada() throws Exception {
        Cafetera c = new Cafetera(1000, 500, 100, 200, false);

        assertThrows(Exception.class, () -> {
            c.servirTaza();
        });
    }

    // ---------- SERVIR VASO ----------

    @Test
    void testServirVasoCorrecto() throws Exception {
        Cafetera c = new Cafetera(1000, 500, 100, 200, true);
        String resultado = c.servirVaso();

        assertEquals("Vaso servido", resultado);
        assertEquals(300, c.getCapacidadRestante());
    }

    @Test
    void testServirVasoSinAgua() throws Exception {
        Cafetera c = new Cafetera(1000, 100, 100, 200, true);

        assertThrows(Exception.class, () -> {
            c.servirVaso();
        });
    }

    @Test
    void testServirVasoApagada() throws Exception {
        Cafetera c = new Cafetera(1000, 500, 100, 200, false);

        assertThrows(Exception.class, () -> {
            c.servirVaso();
        });
    }

    // ---------- ENCENDER Y APAGAR ----------

    @Test
    void testEncender() {
        Cafetera c = new Cafetera();
        c.Encender();
        assertTrue(c.getEstadoCafetera());
    }

    @Test
    void testApagar() {
        Cafetera c = new Cafetera();
        c.Encender();
        c.Apagar();
        assertFalse(c.getEstadoCafetera());
    }

    // ---------- RELLENAR ----------

    @Test
    void testRellenar() throws Exception {
        Cafetera c = new Cafetera(1000, 200, 100, 200, true);
        c.Rellenar();
        assertEquals(1000, c.getCapacidadRestante());
    }

    // ---------- SETTER CAPACIDAD RESTANTE ----------

    @Test
    void testSetCapacidadRestanteCorrecto() throws Exception {
        Cafetera c = new Cafetera(1000, 500, 100, 200, true);
        c.setCapacidadRestante(800);
        assertEquals(800, c.getCapacidadRestante());
    }

    @Test
    void testSetCapacidadRestanteIncorrecto() throws Exception {
        Cafetera c = new Cafetera(1000, 500, 100, 200, true);

        assertThrows(Exception.class, () -> {
            c.setCapacidadRestante(1200);
        });
    }
}

