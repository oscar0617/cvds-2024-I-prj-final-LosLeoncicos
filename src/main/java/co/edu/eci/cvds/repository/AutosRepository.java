package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Autos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutosRepository extends JpaRepository<Autos, Integer> {
    public List<Autos> findByid(Integer id);

}