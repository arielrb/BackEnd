package com.portfolio.ariel.PortfolioAriel.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.ariel.PortfolioAriel.Entity.Persona;
import com.portfolio.ariel.PortfolioAriel.Interface.IPersonaService;
import com.portfolio.ariel.PortfolioAriel.Repository.IPersonaRepository;

@Service
public class ImpPersonaService implements IPersonaService{
	//Traemos la dependencia repositorio que lee los campos y tiene los metodos, lo hacemos con @autowire
	@Autowired IPersonaRepository ipersonaRepository;
	
	
	@Override
	public List<Persona> getPersona() {
		// Lectura, Devuelve todos los items de persona
		List<Persona> personas = ipersonaRepository.findAll();
		return personas;
	}

	@Override
	public void savePersona(Persona persona) {
		// Update, guardamos el nuevo item persona,este es un procedure
		ipersonaRepository.save(persona);
	}

	@Override
	public void deletePersona(Long id) {
		//Delete, eliminacion de persona por id (que lo pasamos por parametro)
		ipersonaRepository.deleteById(id);;
	}

	@Override
	public Persona findPersona(Long id) {
		//Encuentra elemento por id (que lo pasamos por parametro) sino devuelve null
		return ipersonaRepository.findById(id).orElse(null);
	}

}
