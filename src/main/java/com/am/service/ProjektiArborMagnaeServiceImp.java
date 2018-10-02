package com.am.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.am.dao.ProjektiArborMagnaeDao;
import com.am.model.ProjektiArborMagnae;
@Transactional
@Service
public class ProjektiArborMagnaeServiceImp implements ProjektiArborMagnaeService{
	
	@Autowired
	private ProjektiArborMagnaeDao projektiArborMagnaeDao;
	
	@Override
	public  List<ProjektiArborMagnae> getProjektiAM() {
		 
		return  projektiArborMagnaeDao.findAll();
	}

	@Override
	public ProjektiArborMagnae findByNaziv(String nazivProjekta) {
		// TODO Auto-generated method stub
		return projektiArborMagnaeDao.findByNaziv(nazivProjekta); 
	}

}
