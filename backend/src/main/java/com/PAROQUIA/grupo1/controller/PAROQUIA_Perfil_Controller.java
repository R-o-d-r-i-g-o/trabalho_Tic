package com.PAROQUIA.grupo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.PAROQUIA.grupo1.model.repositories.PAROQUIA_Perfil_Model_repository;

@RestController
public class PAROQUIA_Perfil_Controller {

	@Autowired
	PAROQUIA_Perfil_Model_repository injection;
	
	
}
