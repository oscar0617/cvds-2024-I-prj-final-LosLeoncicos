package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    public List<Clientes> findBycedula(Integer cedula);

}