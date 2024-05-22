package co.edu.eci.cvds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.eci.cvds.model.Producto;
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

    @GetMapping("/usuario")
    public String getUsuario(Model model){
        return "usuario";
    }

    @GetMapping("/resumencotizaciones")
    public String getCotizaciones(Model model){
        return "resumencotizaciones";
    }

    @GetMapping("/crearCotizacion")
    public String newCotizaciones(Model model){
        return "crearCotizacion";
    }
    @PostMapping("/crearCotizacion/confirm")
    public String addCotizacion(@RequestParam int numCotizacion, String cedula,String description){
        cotizacionService.addCotizacion(numCotizacion, cedula, description);
        return "redirect:/resumencotizaciones";
    }
}
