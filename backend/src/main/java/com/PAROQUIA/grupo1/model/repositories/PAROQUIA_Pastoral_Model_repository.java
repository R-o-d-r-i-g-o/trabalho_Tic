package com.PAROQUIA.grupo1.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PAROQUIA.grupo1.controller.PAROQUIA_Pastoral_Controller;
import com.PAROQUIA.grupo1.model.PAROQUIA_Pastoral_Model;

public interface PAROQUIA_Pastoral_Model_repository extends JpaRepository<PAROQUIA_Pastoral_Model, Long> {

	PAROQUIA_Pastoral_Controller save(PAROQUIA_Pastoral_Controller pastoral);

}

