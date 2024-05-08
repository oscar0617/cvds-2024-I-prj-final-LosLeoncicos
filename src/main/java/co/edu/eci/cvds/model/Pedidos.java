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
public class Pedidos {
    @Id
    @Column(name = "NUMPEDIDO")
    private int numPedido;

    @ManyToOne
    @JoinColumn(name = "CEDULA", referencedColumnName = "CEDULA")
    private Clientes cliente;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @ManyToMany(mappedBy = "pedidos")
    private List<Servicios> servicios;

    public Pedidos() {
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

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicios> servicios) {
        this.servicios = servicios;
    }

}