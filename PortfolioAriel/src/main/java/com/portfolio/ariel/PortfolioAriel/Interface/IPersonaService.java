package com.portfolio.ariel.PortfolioAriel.Interface;
import java.util.List;
import com.portfolio.ariel.PortfolioAriel.Entity.Persona;

//Acá creamos el CRUD/CLAB
public interface IPersonaService {
	//Traer una lista de personas al llamar al metodo getPersona
	public List<Persona> getPersona();
	
	//Guardamos el objeto persona
	public void savePersona(Persona persona);
	
	//Borramos elemento por id
	public void deletePersona(Long id);

	//Encontramos al elemento por id
	public Persona findPersona (Long id);
}
