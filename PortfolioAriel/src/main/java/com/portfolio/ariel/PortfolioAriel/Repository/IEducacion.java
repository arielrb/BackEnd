package com.portfolio.ariel.PortfolioAriel.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.ariel.PortfolioAriel.Entity.Educacion;

@Repository
public interface IEducacion extends JpaRepository<Educacion, Integer>{
	
	public Optional<Educacion> FindByNombre(String nombre);
	public boolean ExistByNombre(String nombre);
}
