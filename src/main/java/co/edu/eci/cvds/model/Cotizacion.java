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
import lombok.Getter;

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

    @Column(name = "SUBTOTAL")
    private int subtotal;

    @Column(name = "TOTAL")
    private int total;

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

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    

}