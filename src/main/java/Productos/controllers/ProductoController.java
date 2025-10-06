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

    /**
     * 🔁 Endpoint para traer los productos desde la API y guardarlos en la BD.
     * URL: http://localhost:8080/productos/sincronizar
     */
    @GetMapping("/sincronizar")
    public String sincronizar() {
        productoService.sincronizarProductos();
        return "✅ Productos sincronizados exitosamente desde la API a la BD";
    }

    /**
     * 📄 Endpoint para ver los productos almacenados en la BD.
     * URL: http://localhost:8080/productos
     */
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.obtenerProductosDesdeBD();
    }
}
