package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Cotizacion;
import co.edu.eci.cvds.repository.CotizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CotizacionService {
    private final CotizacionRepository cotizacionRepository;

    @Autowired
    public CotizacionService(CotizacionRepository cotizacionRepository) {
        this.cotizacionRepository = cotizacionRepository;
    }

    
    public void addCotizacion(int numPedido, String cedula, String description, String estado) {
        Cotizacion cotizacion = new Cotizacion(numPedido, cedula, description, estado);
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

}
