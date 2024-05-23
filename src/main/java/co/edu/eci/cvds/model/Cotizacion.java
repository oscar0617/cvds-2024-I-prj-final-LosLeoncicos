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
@Table(name = "COTIZACIONES")
public class Cotizacion{
    @Id
    @Column(name = "NUMCOTIZACION")
    private int numCotizacion;

    @Column(name = "CEDULA")
    private String cedula;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "ESTADO")
    private String estado;

    @ManyToMany(targetEntity = Producto.class)
    @JoinTable(name = "PRODUCTOS_COTIZACIONES",
    joinColumns = @JoinColumn(name = "COTIZACION_ID"),
    inverseJoinColumns = @JoinColumn(name = "PRODUCTO_ID"))
    private List<Producto> productos;


    public Cotizacion(){
    }

    public Cotizacion(int numPedido, String cedula, String description, String estado) {
        this.numCotizacion = numPedido;
        this.cedula = cedula;
        this.descripcion = description;
        this.estado = estado;
        this.productos = null;
    }

    public int getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion= numCotizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}