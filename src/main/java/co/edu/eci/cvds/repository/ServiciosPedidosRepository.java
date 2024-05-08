package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.ServiciosPedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiciosPedidosRepository extends JpaRepository<ServiciosPedidos, Integer> {
    public List<ServiciosPedidos> findByid(Integer id, Integer numPedido);

}