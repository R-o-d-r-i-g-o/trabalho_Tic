package com.PAROQUIA.grupo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PAROQUIA.grupo1.model.PAROQUIA_Pastoral_Model;
import com.PAROQUIA.grupo1.model.repositories.PAROQUIA_Pastoral_Model_repository;

@RestController
public class PAROQUIA_Pastoral_Controller {

	@Autowired
	PAROQUIA_Pastoral_Model_repository inj;
	
	@GetMapping("/pastoral")
	public List<PAROQUIA_Pastoral_Model> get(){
		// mesma coisa que: select * from pastoral
		return inj.findAll();
	}
	
	@PostMapping("/pastoral")
	public PAROQUIA_Pastoral_Controller save(@RequestBody PAROQUIA_Pastoral_Controller pastoral) {
		PAROQUIA_Pastoral_Controller novo = inj.save(pastoral);
		return novo;
	}
	
	@PutMapping("/pastoral")
	public PAROQUIA_Pastoral_Controller update(@RequestBody PAROQUIA_Pastoral_Controller pastoral) {
		PAROQUIA_Pastoral_Controller novo = inj.save(pastoral);
		return novo;
	}
	
	@DeleteMapping("/pastoral/{id}")
	public String delete(@PathVariable Long id) {
		try {
			inj.deleteById(id);
			return "Remoção realizada com sucesso";
		}
		catch(Exception e) {
			return "Nenhum pastoral encontrado";
		}	
	}
}
