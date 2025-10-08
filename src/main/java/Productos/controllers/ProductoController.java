package Productos.controllers;

import Productos.model.Producto;
import Productos.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/guardar")
    public  Producto guardar(@RequestBody Producto producto) {
        return productoService.guardarproducto(producto);
    };

    @PutMapping("/{id}")
    public  Producto modificar(@PathVariable int id, @RequestBody Producto producto) {
        return productoService.modificarproducto(producto);
    };

    @GetMapping("/mostrar/{id}")
    public Optional<Producto> llamarproductos(@PathVariable int id){
        return productoService.mostrarProductos(id);
    };

    @GetMapping("/mostrartodos")
    public List<Producto> mostrartodos() {
        return productoService.mostrartodos();
    };


}
