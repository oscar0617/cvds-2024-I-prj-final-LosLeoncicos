package co.edu.eci.cvds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.eci.cvds.model.Cotizacion;
import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.service.CotizacionService;
import co.edu.eci.cvds.service.ProductoService;

@Controller
public class CotizacionController {

    @Autowired
    ProductoService productoService;

    @Autowired
    CotizacionService cotizacionService;

    @GetMapping("/cotizaciones")
    public String getProductos(Model model){
        List<Producto> productos = productoService.getAllProducto();
        model.addAttribute("productos", productos);
        return "cotizaciones";
    }

    @PostMapping("/cotizaciones/nueva")
    public String createCotizacion(){
        Cotizacion cotizacion = new Cotizacion();
        cotizacion.setNumCotizacion(1);
        cotizacionService.saveCotizacion(cotizacion);
        return "redirect:/cotizaciones";
    }

    @PostMapping("/cotizaciones/agregarProducto")
    public String addProducto(@RequestParam String nombreProducto){
        cotizacionService.agregarProducto(nombreProducto);
        return "redirect:/cotizaciones";
    }

    @GetMapping("/carritoCompras")
    public String getProductosCarrito(Model model){
        List<Producto> productos = cotizacionService.getCotizacion().getProductos();
        model.addAttribute("productosCarrito", productos);
        return "carrito";
    }
}
