package com.portfolio.ariel.PortfolioAriel.Dto;

import javax.validation.constraints.NotBlank;

public class DtoHabilidades {
	
	@NotBlank
	private String nombre;
	@NotBlank
	private int porcentaje;
	
	//Constructores
	public DtoHabilidades(@NotBlank String nombre, @NotBlank int porcentaje) {
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}
	public DtoHabilidades() {
		
	}
	//Gett/Sett
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	

}
