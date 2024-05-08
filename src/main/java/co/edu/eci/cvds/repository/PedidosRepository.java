package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {
    public List<Pedidos> findByNumPedido(Integer numPedido);

}