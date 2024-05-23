package co.edu.eci.cvds;

import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.model.Cotizacion;
import co.edu.eci.cvds.repository.CotizacionRepository;
import co.edu.eci.cvds.service.CotizacionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CotizacionServiceTest {

    @Autowired
    private CotizacionService cotizacionService;

    @Autowired
    private CotizacionRepository cotizacionRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testAddAndGetCotizacion() {
        int numCotizacion = 1;
        String cedula = "123456789";
        String estado = "Creado";
        int precio = 123;
        cotizacionService.addCotizacion(numCotizacion, cedula, estado, precio);
        Cotizacion cotizacion = cotizacionService.getCotizacion(numCotizacion);
        assertNotNull(cotizacion);
        assertEquals(numCotizacion, cotizacion.getNumCotizacion());
        assertEquals(cedula, cotizacion.getCedula());
        assertEquals(estado, cotizacion.getEstado());
    }

    @Test
    void testGetCotizacion() {
        int numCotizacion = 1;
        String cedula = "123456789";
        String estado = "Creado";
        int precio = 123;
        cotizacionService.addCotizacion(numCotizacion, cedula, estado, precio);
        Cotizacion cotizacionObtenida = cotizacionService.getCotizacion(numCotizacion);
        assertNotNull(cotizacionObtenida);
        assertEquals(numCotizacion, cotizacionObtenida.getNumCotizacion());
        assertEquals(cedula, cotizacionObtenida.getCedula());
        assertEquals(estado, cotizacionObtenida.getEstado());
    }

    @Test
    void testGetAllCotizacion() {
        List<Cotizacion> cotizacionesObtenidas = cotizacionService.getAllCotizacion();
        assertNotNull(cotizacionesObtenidas);
        assertEquals(1, cotizacionesObtenidas.size());
    }

    @Test
    void testUpdateCotizacion() {
        cotizacionService.addCotizacion(1, "123456789", "En Proceso", 123);
        cotizacionService.updateCotizacion(1, "Aprobada");
        Cotizacion cotizacionActualizada = cotizacionService.getCotizacion(1);
        assertNotNull(cotizacionActualizada);
        assertEquals("Aprobada", cotizacionActualizada.getEstado());
    }

    @Test
    void testSaveCotizacion() {
        Cotizacion cotizacion = new Cotizacion(1, "123456789", "En Proceso", 123);
        cotizacionRepository.save(cotizacion);
        cotizacion.setEstado("Completada");
        cotizacionService.saveCotizacion(cotizacion);
        Cotizacion cotizacionActualizada = cotizacionService.getCotizacion(1);
        assertNotNull(cotizacionActualizada);
        assertEquals("Completada", cotizacionActualizada.getEstado());
    }

}