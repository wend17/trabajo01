package com.wendy.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/vacantes") //a nivel de la clase
public class VacantesController {
	
	
	
	
	@GetMapping("/delete") //2 se crea el segundo metoodo
	public String eliminar(@RequestParam("id")int idVacante, Model model) {
		System.out.println("Borrando vacante con id:"+idVacante);
		model.addAttribute("id",idVacante);
        return"mensaje"; // para el boton borrar, en tabla se hace el seg html ,se crea la interface
	
	@GetMapping("/view/{id}") //1 se crea el metodo
	public String verDetalle(@PathVariable("id") int idVacante, Model model) {
		System.out.println("idVacante:"+idVacante);
		model.addAttribute("idVacante",idVacante);
		return "vacantes/detalle"; //para el boton detalle
		
	}

}
