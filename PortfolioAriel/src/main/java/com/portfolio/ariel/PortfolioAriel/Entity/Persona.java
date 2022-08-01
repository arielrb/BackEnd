package com.portfolio.ariel.PortfolioAriel.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	//Auto generado porque no hay problema con la generacion de id
	private Long id;
	@NotNull
	@Column(name = "Nombre")
	@Size(min = 1,max = 50,message = "Longitud invalida")
	private String nombre;
	@NotNull
	@Size(min = 1,max = 50,message = "Longitud invalida")
	@Column(name = "Apellido")
	private String apellido;
	@Lob
	@Column(name = "Imagen")
	private String  img;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getImg() {
		return this.img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
}
