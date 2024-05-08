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
public class Servicios {
    @Id
    @Column(name = "SERVICIO")
    private String servicio;

    @JoinColumn(name = "MARCAS", referencedColumnName = "MARCA")
    private Marcas marca;

    @Column(name = "PRECIO")
    private int precio;

    @ManyToMany
    @JoinTable(
        name = "SERVICIOS_PEDIDOS",
        joinColumns = @JoinColumn(name = "SERVICIO"),
        inverseJoinColumns = @JoinColumn(name = "NUMPEDIDO")
    )
    private List<Pedidos> pedidos;

    public Servicios() {
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

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }
}