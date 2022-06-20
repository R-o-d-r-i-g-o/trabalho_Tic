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

import com.unifacef.model.Pastoral;
import com.unifacef.model.repositories.PastoralRepository;

@RestController
public class PAROQUIA_Pastoral_Controller {

	@Autowired
	PastoralRepository inj;
	
	@GetMapping("/pastoral")
	public List<Pastoral> get(){
		// mesma coisa que: select * from pastoral
		return inj.findAll();
	}
	
	@PostMapping("/pastoral")
	public Pastoral save(@RequestBody Pastoral pokemon) {
		Pastoral novo = inj.save(pokemon);
		return novo;
	}
	
	@PutMapping("/pastoral")
	public Pastoral update(@RequestBody Pastoral pastoral) {
		Pastoral novo = inj.save(pastoral);
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
