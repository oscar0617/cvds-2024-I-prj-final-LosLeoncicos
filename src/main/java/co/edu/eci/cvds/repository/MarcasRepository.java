package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Marcas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcasRepository extends JpaRepository<Marcas, Integer> {
    public List<Marcas> findByid(Integer id);

}