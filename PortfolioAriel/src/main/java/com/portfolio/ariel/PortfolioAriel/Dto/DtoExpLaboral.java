package com.portfolio.ariel.PortfolioAriel.Dto;

import javax.validation.constraints.NotBlank;

public class DtoExpLaboral {
	@NotBlank
	private String nombreExp;
	@NotBlank
	private String descripcionExp;


	//Constructor
	public DtoExpLaboral() {}
	public DtoExpLaboral(@NotBlank String nombreExp, @NotBlank String descripcionExp) {
		this.nombreExp = nombreExp;
		this.descripcionExp = descripcionExp;
	}
	//GEtt/Sett
	public String getNombreExp() {
		return nombreExp;
	}
	public void setNombreExp(String nombreExp) {
		this.nombreExp = nombreExp;
	}
	public String getDescripcionExp() {
		return descripcionExp;
	}
	public void setDescripcionExp(String descripcionExp) {
		this.descripcionExp = descripcionExp;
	}
	
	
}
