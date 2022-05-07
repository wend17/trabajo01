package com.wendy.app.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.wendy.app.model.Vacante;
import com.wendy.app.service.IVacantesService;

@Controller
public class HomeController {

	@Autowired
	private IVacantesService servicesVacantes;

	@GetMapping("/tabla")
	public String mostrarTabla(Model model) { //3 se crea el metodo tabla
	 List<Vacante> lista= servicesVacantes.buscarTodas();//getVacantes se cambia por serviceVacantes , el nombre de la instancia del autowired
	model.addAttribute("vacantes", lista);
	return "tabla";
	}
	

	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) { //2.se crea u nnuevo metodo
		Vacante vacante = new Vacante(); //se crea u de tipo Vacante, se encuentra e importa del áquete model
		vacante.setNombre("Ingeniero de Comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);
		model.addAttribute("Vacante", vacante); //se agrega al modelo
		return "detalle";

	}

	@GetMapping("/listado")
	public String mostrarListado(Model model) { //1. metodo mostrar listado
		List<String> lista = new LinkedList<String>(); //cramos el arreglo llamado lista
		lista.add("Ingeniro de Sistemas");
		lista.add("Auxiliar de contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		model.addAttribute("empleos", lista); // agregamos la lista al modelo
		return "listado"; // se crea el arcvhivo html
	}

	

}
