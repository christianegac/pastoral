package com.cgac.pastoral.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class ProjetosController {
   
	@GetMapping("/convidados") 
    public String listar() { 
    	return "REST ok";
    }
     
}
    