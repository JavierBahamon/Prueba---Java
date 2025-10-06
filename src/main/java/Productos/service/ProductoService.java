package Productos.service;

import Productos.dao.ProductoDAO;
import Productos.dao.ProductoRepository;
import Productos.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoService {

    private final ProductoRepository productoRepository;
    private final ProductoDAO productoDAO;

    public ProductoService(ProductoRepository productoRepository, ProductoDAO productoDAO) {
        this.productoRepository = productoRepository;
        this.productoDAO = productoDAO;
    }

    public void guardarproducto() {
        Producto[] productos = productoDAO.consumoapi();

        for (Producto p : productos){
            productoRepository.save(p);
        }
    }

    public List<Producto> mostrarProductos() {
        return productoRepository.findAll();
    }


}
