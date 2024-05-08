package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiciosRepository extends JpaRepository<Servicios, String> {
    public List<Servicios> findByservicio(String servicio);

}