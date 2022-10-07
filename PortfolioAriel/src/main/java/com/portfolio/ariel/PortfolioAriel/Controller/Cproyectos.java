package com.portfolio.ariel.PortfolioAriel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.ariel.PortfolioAriel.Service.SProyectos;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Proyectos")
public class Cproyectos {

	@Autowired
	SProyectos Spro;
	
}
