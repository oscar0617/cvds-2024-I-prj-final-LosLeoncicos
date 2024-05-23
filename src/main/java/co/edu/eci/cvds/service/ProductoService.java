package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.Cotizacion;
import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Producto addConfiguration(Producto Producto) {
        return productoRepository.save(Producto);
    }

    public Producto getConfiguration(String producto) {
        return productoRepository.findByproducto(producto).get(1);
    }

    public List<Producto> getAllProducto() {
        return productoRepository.findAll();
    }

    public void deleteProducto(String Producto) {
        productoRepository.deleteById(Producto);
    }

    public Producto getProducto(String nombre){
        Producto producto = null;
        Optional<Producto> opProducto = productoRepository.findById(nombre);
        if(opProducto.isPresent()){
            producto = opProducto.get();
    
        }
        return producto;
    }

    public void addProducto(String producto, String marca, String tipo, int precio) {
        Producto producto_ = new Producto(producto, marca, tipo, precio);
        productoRepository.save(producto_);
    }

    public void updateProducto(String producto, int precio){
        Producto producto_ = getProducto(producto);
        producto_.setPrecio(precio);
        productoRepository.save(producto_);
    }
}
