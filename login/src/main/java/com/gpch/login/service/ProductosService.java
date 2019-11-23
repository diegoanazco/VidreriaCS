package com.gpch.login.service;

import com.gpch.login.repository.ProductosRepository;
import com.gpch.login.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("productosService")
public class ProductosService {

    private ProductosRepository productosRepository;

    @Autowired
    public ProductosService(ProductosRepository productosRepository) 
    {
        this.productosRepository = productosRepository;
        
    }

    public Productos saveProducto(Productos producto)
    {
    	return productosRepository.save(producto);
    }
    
    public void deleteProducto( Long productoId) 
    {
    	Optional<Productos> producto = productosRepository.findById(productoId);
    	if(producto.isPresent())
    	{
    		productosRepository.deleteById(productoId);
    	}
    }
    
    public Productos getProducto(Long productoId)
    {
    	Optional<Productos> producto = productosRepository.findById(productoId);
    	if(producto.isPresent())
    	{
    		return producto.get();
    	}
    	return null;
    }
    
    public List<Productos> getAllProductos()
    {
    	List<Productos> productos = new ArrayList<Productos>();
    	productosRepository.findAll().forEach(producto -> productos.add(producto));
    	return productos;
    }
    
}
