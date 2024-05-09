package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, String> {
    public List<Servicio> findByservicio(String servicio);

}