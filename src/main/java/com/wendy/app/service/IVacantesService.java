package com.wendy.app.service;

import java.util.List;
import com.wendy.app.model.Vacante;

public interface IVacantesService {
 
	List<Vacante> buscarTodas(); //1metodo que regresa una lista de objetos de tipo vacante llamdo buscat todas
	Vacante buscarPorId(Integer idVacante); // metodo 2 regresa un objeto de tipo vacante
	
}
