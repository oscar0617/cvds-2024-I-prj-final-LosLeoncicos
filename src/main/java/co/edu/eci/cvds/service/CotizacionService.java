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

    
    public void addCotizacion(int numPedido, String cedula, String estado) {
        Cotizacion cotizacion = new Cotizacion(numPedido, cedula, estado);
        cotizacionRepository.save(cotizacion);
    }

    public Cotizacion getCotizacion(int numCotizacion) {
        return cotizacionRepository.findByNumCotizacion(numCotizacion).get(0);
    }

    public List<Cotizacion> getAllCotizacion() {
        return cotizacionRepository.findAll();
    }

    public void updateCotizacion(int numCotizacion, String estado){
        Cotizacion cotizacion = getCotizacion(numCotizacion);
        cotizacion.setEstado(estado);
        cotizacionRepository.save(cotizacion);
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
