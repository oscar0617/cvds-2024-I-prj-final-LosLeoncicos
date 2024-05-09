package co.edu.eci.cvds.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SERVICIOS")
public class Servicio {
    @Id
    @Column(name = "SERVICIO")
    private String servicio;

    /*@JoinColumn(name = "MARCAS", referencedColumnName = "MARCA")*/
    @Column(name = "MARCA")
    private Marca marca;

    @Column(name = "PRECIO")
    private int precio;

    /*@ManyToMany
    @JoinTable(
        name = "SERVICIOS_PEDIDOS",
        joinColumns = @JoinColumn(name = "SERVICIO"),
        inverseJoinColumns = @JoinColumn(name = "NUMPEDIDO")
    )*/
    @Column(name = "PEDIDO")
    private List<Pedido> pedidos;

    public Servicio() {
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}