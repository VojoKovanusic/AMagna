package com.am.service;

import java.util.List;

import com.am.model.ProjektiArborMagnae;

public interface  ProjektiArborMagnaeService {
 
	public  List<ProjektiArborMagnae> getProjektiAM();

	public ProjektiArborMagnae findByNaziv(String naziProjekta);
	
}
