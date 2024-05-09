package co.edu.eci.cvds.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PEDIDOS")
public class Pedido {
    @Id
    @Column(name = "NUMPEDIDO")
    private int numPedido;

    /*@ManyToOne
    @JoinColumn(name = "CEDULA", referencedColumnName = "CEDULA")*/
    @Column(name = "CLIENTE")
    private Cliente cliente;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    /*@ManyToMany(mappedBy = "pedidos")
    private List<Servicio> servicios;*/
    @Column(name = "SERVICIOS")
    private String servicios;

    public Pedido() {
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }


}