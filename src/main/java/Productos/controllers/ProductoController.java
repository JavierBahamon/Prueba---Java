package Productos.controllers;

import Productos.model.Producto;
import Productos.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/guardardb")
    public String guardardb () {
        productoService.guardarproducto();
        return "se ha guardado";
    };

    @GetMapping("/mostrar")
    public List<Producto> llamarproductos(){
        return productoService.mostrarProductos();

    };


}
