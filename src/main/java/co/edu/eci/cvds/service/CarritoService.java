package co.edu.eci.cvds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.eci.cvds.model.Cotizacion;
import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.repository.CotizacionRepository;

@Service
public class CarritoService {
    @Autowired
    CotizacionService cotizacionService;

    @Autowired
    CotizacionRepository cotizacionRepository;

    @Autowired
    ProductoService productoService;

    public void borrarProducto(String nombreProducto){
        Cotizacion cotizacion = cotizacionService.getCotizacion();
        Producto producto = productoService.getProducto(nombreProducto);
        if(cotizacion != null){
            cotizacion.deleteProducto(producto);
            cotizacionRepository.save(cotizacion);
        }
    }
}
