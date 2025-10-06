package Productos.dao;



import Productos.model.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ProductoDAO {

    private final RestTemplate restTemplate;
    private final String URL = "https://fakestoreapi.com/products";


    public ProductoDAO(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public Producto[] consumoapi() {
        return restTemplate.getForObject( URL, Producto[].class);
    }




}
