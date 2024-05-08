package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SERVICIOSPEDIDOS")
public class ServiciosPedidos {
    @Id
    @ManyToOne
    @JoinColumn(name = "SERVICIO", referencedColumnName = "SERVICIOS")
    private String servicio;

    @Id
    @ManyToOne
    @JoinColumn(name = "NUMPEDIDO", referencedColumnName = "PEDIDOS")
    private int numPedido;

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }



}
