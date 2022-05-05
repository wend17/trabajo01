package com.wendy.app.service;

import java.util.List;
import com.wendy.app.model.Vacante;

public interface IVacantesService {
 
	List<Vacante> buscarTodas(); //metodo
	Vacante buscarPorId(Integer idVacante); // metodo 2 regresa un objeto de tipo vacante
	
}
