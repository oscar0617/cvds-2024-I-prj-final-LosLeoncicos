package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    public List<Pedido> findByNumPedido(Integer numPedido);

}