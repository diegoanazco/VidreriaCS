package com.construccion.uls.controllers;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.construccion.uls.configuration.Paginas;
import com.construccion.uls.model.Post;

@Controller
@RequestMapping("/home")
public class ControladorBasico {
	
	public List<Post> getPost(){
		ArrayList<Post> post = new ArrayList<>();
		
		post.add(new Post(1,new Date(),"http://localhost/home/productos"));
		return post;
	}
	
	@GetMapping(path = {"/principal" , "/"})
	public String saludar() {
		return "index";
	}
	
	@GetMapping(path = {"/post"})
	public ModelAndView getPostIndividual(
			@RequestParam(defaultValue = "1", name = "id", required = false) int id 
			) {
		ModelAndView modelAndView = new ModelAndView(Paginas.PRODUCTOS);
		
		List<Post> postFiltrado = this.getPost().stream().filter((p) -> {
								return p.getId() == id;
								}).collect(Collectors.toList());
		modelAndView.addObject("post", postFiltrado.get(0));
		
		
		return modelAndView;	
	}
}
