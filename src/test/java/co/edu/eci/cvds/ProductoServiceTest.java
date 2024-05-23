package co.edu.eci.cvds;

import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.repository.ProductoRepository;
import co.edu.eci.cvds.service.ProductoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductoServiceTest {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private ProductoRepository productoRepository;
    
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    void setUp() {
        // Agregar algunos productos para las pruebas
        productoRepository.deleteAll();
        Producto producto1 = new Producto();
        producto1.setProducto("Producto1");
        producto1.setMarca("Marca1");
        producto1.setTipo("Tipo1");
        producto1.setPrecio(1000);
        productoRepository.save(producto1);

        Producto producto2 = new Producto();
        producto2.setProducto("Producto2");
        producto2.setMarca("Marca2");
        producto2.setTipo("Tipo2");
        producto2.setPrecio(2000);
        productoRepository.save(producto2);
        
    }

    @Test
    void testAddProducto() {
        productoService.addProducto("Nuevo Producto", "Marca", "Tipo", 1500);
        Producto producto = productoService.getProducto("Nuevo Producto");
        assertNotNull(producto, "El nuevo producto no se agregó correctamente");
    }


    @Test
    void testGetAllProducto() {
        productoService.addProducto("Nuevo Producto", "Marca", "Tipo", 1500);
        List<Producto> productos = productoService.getAllProducto();
        assertNotNull(productos);
        assertEquals(3, productos.size());
    }

    @Test
    void testDeleteProducto() {
        Producto producto = new Producto();
        producto.setProducto("ProductoBorrador");
        producto.setMarca("Marca1");
        producto.setTipo("Tipo1");
        producto.setPrecio(1000);
        productoRepository.save(producto);

        productoService.deleteProducto("ProductoBorrador");
        assertNull(productoService.getProducto("ProductoBorrador"));
    }

    @Test
    void testGetProducto() {
        Producto producto = productoService.getProducto("Producto2");
        assertNotNull(producto);
        assertEquals("Marca2", producto.getMarca());
        assertEquals("Tipo2", producto.getTipo());
        assertEquals(2000, producto.getPrecio());
    }
    @Test
    void testUpdateProducto() {
        productoService.updateProducto("Producto2", 2500);
        Producto producto = productoService.getProducto("Producto2");
        assertEquals(2500, producto.getPrecio(), "El precio del producto no se actualizó correctamente");
    }
}
