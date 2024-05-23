package co.edu.eci.cvds.service;

import java.util.List;

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

    public int calcularSubtotal(List<Producto> productos){
        int costo = 0;
        for(int i=0;i< productos.size(); i++){
            costo += productos.get(i).getPrecio();
        }
        return costo;
    }

    public int calcularTotal(List<Producto> productos){
        int costo = 0;
        double iva = 1.19;
        for(int i=0;i< productos.size(); i++){
            costo += productos.get(i).getPrecio();
        }
        costo = (int) (costo * iva);
        return costo;
    }


}
