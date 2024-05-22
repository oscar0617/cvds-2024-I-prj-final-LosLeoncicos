package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Cotizacion;
import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.repository.CotizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CotizacionService {
    private final CotizacionRepository cotizacionRepository;
    private final ProductoService productoService;

    @Autowired
    public CotizacionService(CotizacionRepository cotizacionRepository, ProductoService productoService) {
        this.cotizacionRepository = cotizacionRepository;
        this.productoService = productoService;
    }

    public List<Cotizacion> getAllCotizacion() {
        return cotizacionRepository.findAll();
    }

    public Cotizacion updateCotizacion(Cotizacion cotizacion) {
        if (cotizacionRepository.findByNumCotizacion(cotizacion.getNumCotizacion()).size() == 0) {
            return cotizacionRepository.save(cotizacion);
        }
        return null;
    }

    public void deleteCotizacion(int numCotizacion) {
        cotizacionRepository.deleteById(numCotizacion);
    }

    public void agregarProducto(String nombreProducto){
        Cotizacion cotizacion = getCotizacion();
        Producto producto = productoService.getProducto(nombreProducto);
        if(cotizacion != null){
            cotizacion.addProduct(producto);
            cotizacionRepository.save(cotizacion);
        }

    }

    public void saveCotizacion(Cotizacion cotizacion){
        cotizacionRepository.save(cotizacion);
    }

    public Cotizacion getCotizacion(){
        Cotizacion cotizacion = null;
        Optional<Cotizacion> opCotizacion = cotizacionRepository.findById(1);
        if(opCotizacion.isPresent()){
            cotizacion = opCotizacion.get();
        }
        return cotizacion;
    }
}
