package com.portfolio.ariel.PortfolioAriel.Dto;

import javax.validation.constraints.NotBlank;

public class DtoHabilidades {
	
	@NotBlank
	private String nombreHabilidad;
	@NotBlank
	private int porcentaje;
	
	//Constructores
	public DtoHabilidades(@NotBlank String nombreHabilidad, @NotBlank int porcentaje) {
		this.nombreHabilidad = nombreHabilidad;
		this.porcentaje = porcentaje;
	}
	public DtoHabilidades() {
		
	}
	//Gett/Sett
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
