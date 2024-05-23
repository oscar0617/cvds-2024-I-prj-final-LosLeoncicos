package co.edu.eci.cvds;

import co.edu.eci.cvds.model.Cotizacion;
import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.repository.CotizacionRepository;
import co.edu.eci.cvds.repository.ProductoRepository;
import co.edu.eci.cvds.service.CarritoService;
import co.edu.eci.cvds.service.CotizacionService;
import co.edu.eci.cvds.service.ProductoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarritoServiceTest{
    @Autowired
    private CarritoService carritoService;

    @Autowired
    private CotizacionService cotizacionService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CotizacionRepository cotizacionRepository;

    @Autowired
    private CotizacionRepository productoRepository;

    @BeforeEach
    void setUp() {
        cotizacionRepository.deleteAll();
        productoRepository.deleteAll();
    }

    @Test
    void testBorrarProducto() {
        productoService.addProducto("Nuevo Producto", "Marca", "Tipo", 1500);
        Cotizacion cotizacion = cotizacionService.getCotizacion();
        Producto producto = productoService.getProducto("Nuevo Producto");
        carritoService.borrarProducto("Nuevo Producto");
        assertNull(cotizacion);
    }

    @Test
    void testCalcularSubtotal() {
        // Crear una lista de productos
        List<Producto> productos = Arrays.asList(
            new Producto("Producto1", "Marca1", "Tipo1", 1000),
            new Producto("Producto2", "Marca2", "Tipo2", 2000)
        );

        // Calcular el subtotal
        int subtotal = carritoService.calcularSubtotal(productos);

        // Verificar el subtotal
        assertEquals(3000, subtotal, "El subtotal no es el esperado");
    }

    @Test
    void testCalcularTotal() {
        // Crear una lista de productos
        List<Producto> productos = Arrays.asList(
            new Producto("Producto1", "Marca1", "Tipo1", 1000),
            new Producto("Producto2", "Marca2", "Tipo2", 2000)
        );

        // Calcular el total
        int total = carritoService.calcularTotal(productos);

        // Verificar el total
        int expectedTotal = (int) (3000 * 1.19);
        assertEquals(expectedTotal, total, "El total no es el esperado");
    }
    

}