package com.portfolio.ariel.PortfolioAriel.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Habilidades {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreHabilidad;
	private int porcentaje;
	//Constructor

	public Habilidades() {
		
	}
	public Habilidades(String nombreHabilidad, int porcentaje) {
		this.nombreHabilidad = nombreHabilidad;
		this.porcentaje = porcentaje;
	}
	
	//Gett/Sett

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreHabilidad() {
		return nombreHabilidad;
	}
	public void setNombreHabilidad(String nombreHabilidad) {
		this.nombreHabilidad = nombreHabilidad;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	
	
	
	
}
