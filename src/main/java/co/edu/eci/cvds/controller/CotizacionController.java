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
import co.edu.eci.cvds.service.CotizacionService;

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
    @GetMapping("/usuario")
    public String getUsuario(Model model){
        return "usuario";
    }

    @GetMapping("/resumencotizaciones")
    public String getCotizaciones(Model model){
        List<Cotizacion> cotizaciones = cotizacionService.getAllCotizacion();
        model.addAttribute("list", cotizaciones);
        return "resumencotizaciones";
    }

    @GetMapping("/crearCotizacion")
    public String newCotizaciones(Model model){
        return "crearCotizacion";
    }
    @PostMapping("/crearCotizacion/confirm")
    public String addCotizacion(@RequestParam int numCotizacion, String cedula,String description, String estado){
        cotizacionService.addCotizacion(numCotizacion, cedula, description, estado);
        return "redirect:/resumencotizaciones";
    }

    @PostMapping("/update")
    public String updateCotizacion(Model model, int numCotizacion){
        model.addAttribute("numCotizacion", numCotizacion);
        return "update";
    }

    @PostMapping("/update/confirm")
    public String updateEmployee(@RequestParam int numCotizacion, String estado) {
        cotizacionService.updateCotizacion(numCotizacion, estado);
        return "redirect:/resumencotizaciones";
    }


}
