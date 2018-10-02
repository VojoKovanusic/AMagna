package com.am.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.am.model.ProjektiArborMagnae;
@Repository
public interface ProjektiArborMagnaeDao extends JpaRepository<ProjektiArborMagnae, Long> {

	ProjektiArborMagnae findByNaziv(String nazivProjekta);

}
