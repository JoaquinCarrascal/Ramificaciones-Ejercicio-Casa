package com.salesianostriana.dam.ejerciciocasaramas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {

	@GetMapping("/")
	public String holaMundo(Model model) {
		model.addAttribute("saludo","Hasta la vista baby.");
		return "index";
	}
	
	
}
