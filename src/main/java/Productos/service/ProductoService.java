package Productos.service;

import Productos.dao.ProductoRepository;
import Productos.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoService {

    private final ProductoRepository productoRepository;


    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;

    }

    public Producto guardarproducto(Producto producto) {
       return productoRepository.save(producto);
    }

    public Producto modificarproducto(Producto producto ) {
        return productoRepository.save(producto);
    }

    public Optional<Producto> mostrarProductos(int id) {
        return productoRepository.findById(id);
    }

    public List<Producto> mostrartodos() {
        return productoRepository.findAll();
    }


}
