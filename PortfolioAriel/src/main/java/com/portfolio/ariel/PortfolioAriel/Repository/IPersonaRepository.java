package com.portfolio.ariel.PortfolioAriel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.ariel.PortfolioAriel.Entity.Persona;

@Repository
//Se declara la interfaz que extiende de los metodos de JPA repository, donde sus parámetros son la entidad y el tipo de su ID
//Lo que creamos en esta interfaz 
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
	

}
