package com.gpch.login.controller;

import javax.validation.Valid;

import com.gpch.login.model.Productos;
import com.gpch.login.service.ProductosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductosController {

	@Autowired 
    private ProductosService productosService;

    @RequestMapping(value={ "/index"})
    public String index(Model model){
        model.addAttribute("list", productosService.getAllProductos());
        return "index";
    }

    @GetMapping("/save/{id}")
    public String showSave(@PathVariable("id") Long id, Model model)
    {
    	if(id != null && id != 0)
    	{
    		model.addAttribute("productos", productosService.getProducto(id));
    	}
    	else 
    	{
    		model.addAttribute("productos", new Productos());
    	}
    	
    	return "save";
    }
    
    @PostMapping("/save")
    public String save(Productos producto, Model model)
    {
    	productosService.saveProducto(producto);
    	return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model model)
    {
    	productosService.deleteProducto(id);
    	return "redirect:/";
    }
}
