package co.edu.eci.cvds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.eci.cvds.service.CarritoService;
import co.edu.eci.cvds.service.CotizacionService;
import co.edu.eci.cvds.service.ProductoService;

@Controller
public class CarritoContoller {
    @Autowired
    CarritoService carritoService;

    @GetMapping("/carrito/borrarProducto")
    public String borrarProducto(@RequestParam String nombreProducto, Model model){
        carritoService.borrarProducto(nombreProducto);
        System.out.println("Hola");
        return "redirect:/carritoCompras";
    }

    @GetMapping("/asesorwp")
    public String getXd(){
        return "asesorwp";
    }
}
