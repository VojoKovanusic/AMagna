package com.am.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 
import com.am.dao.ProjektiArborMagnaeDao;
import com.am.model.ProjektiArborMagnae;
import com.am.service.ProjektiArborMagnaeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class MainController {
	
@Autowired
private ProjektiArborMagnaeService projektiArborMagnaeService ;
		




	@GetMapping(value ="/getProjekte")
	public List<ProjektiArborMagnae> getProjekte() {
		return projektiArborMagnaeService.getProjektiAM();
	}
	
	@GetMapping("getProjekat/{nazivProjekta:.+}")
	public  ProjektiArborMagnae getProjektArborMagnaePoNazivu(@PathVariable  String nazivProjekta) {
		
		return projektiArborMagnaeService.findByNaziv(nazivProjekta) ;

	}
	
 
}
