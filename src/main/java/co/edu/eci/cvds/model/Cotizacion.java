package co.edu.eci.cvds.model;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COTIZACIONES")
public class Cotizacion{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "NUMCOTIZACION")
    private int numCotizacion;


    @ManyToMany(targetEntity = Producto.class)
    @JoinTable(name = "PRODUCTOS_COTIZACIONES",
    joinColumns = @JoinColumn(name = "COTIZACION_ID"),
    inverseJoinColumns = @JoinColumn(name = "PRODUCTO_ID"))
    private List<Producto> productos;


    public Cotizacion(){
        
    }

    public int getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion= numCotizacion;
    }

    public void addProduct(Producto producto){
        productos.add(producto);
    }

    public void deleteProducto(Producto producto){
        productos.remove(producto);
    }

    public List<Producto> getProductos(){
        return productos;
    }

}