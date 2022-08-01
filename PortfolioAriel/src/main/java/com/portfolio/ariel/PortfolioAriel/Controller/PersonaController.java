package com.portfolio.ariel.PortfolioAriel.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.portfolio.ariel.PortfolioAriel.Interface.IPersonaService;
import com.portfolio.ariel.PortfolioAriel.Entity.*;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
	//Como el controller llama al servicio, hacemos el autowired al servicio
	@Autowired IPersonaService ipersonaService;
	//Defino el metodo del controlador que llama al servicio
	//Ademas defino la Anotation para el metodo para la URL 
	@GetMapping("/personas/traer")
	public List<Persona> getPersona(){
		return ipersonaService.getPersona();
	}
	//Para enivar la info y guardarla en la BBDD
	@PostMapping("/personas/crear")
	//El parámetro va a ser un paquete de info que va con la anotation RequestBody
	public String createPersona(@RequestBody Persona persona) {
		ipersonaService.savePersona(persona);
		return "Persona creada correctamente";
	}
	//Para borrar
	@DeleteMapping("personas/borrar/{id}")
	//El parametro es la id, es variable, entonces va la anotation PathVariable
	public String deletePersona(@PathVariable Long id) {
		ipersonaService.deletePersona(id);
		return "La persona {{id}} se elimino correctamente";
	}
	//Para edicion/actualizacion
	@PutMapping("/personas/editar/{id}")
	//En este caso pathvariable es el id que ubicamos y request param es lo que vamos a editar
	public Persona editarPersona(@PathVariable Long id, 
		@RequestParam("nombre") String nuevonombre,
		@RequestParam("apellido") String nuevoapellido,
		@RequestParam("img") String nuevaimg) {
		//Instancio el objeto que quiero editar
		Persona persona = ipersonaService.findPersona(id);
		//modifico sus atributos
		persona.setNombre(nuevonombre);
		persona.setApellido(nuevoapellido);
		persona.setImg(nuevaimg);
		//Lo guardo
		ipersonaService.savePersona(persona);
		
		//Y devuelvo la persona
		return persona;
	}
	
	@GetMapping("personas/traer/perfil")
	public Persona encontrarPersona() {
		return 	ipersonaService.findPersona((long)1);
	}
}
