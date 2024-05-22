package co.edu.eci.cvds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.edu.eci.cvds.model.Producto;
import co.edu.eci.cvds.service.ProductoService;

@Controller
public class CotizacionController {

    @Autowired
    ProductoService productoService;

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

}
