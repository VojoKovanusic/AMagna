package com.am.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjektiArborMagnae {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String naziv;
	private	String opis;
	private	String godinaIzradeProjekta;
	private	String ucesnici;
	private	String napomena;
	private String finansijer;
	private String putanjaSlike;
	private String putanjaPDFaProjekta;
	 
	 
	public ProjektiArborMagnae( ) {
		 
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public String getGodinaIzradeProjekta() {
		return godinaIzradeProjekta;
	}
	public void setGodinaIzradeProjekta(String godinaIzradeProjekta) {
		this.godinaIzradeProjekta = godinaIzradeProjekta;
	}
	public String getUcesnici() {
		return ucesnici;
	}
	public void setUcesnici(String ucesnici) {
		this.ucesnici = ucesnici;
	}
	public String getNapomena() {
		return napomena;
	}
	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}
	public String getFinansijer() {
		return finansijer;
	}
	public void setFinansijer(String finansijer) {
		this.finansijer = finansijer;
	}
	public String getPutanjaSlike() {
		return putanjaSlike;
	}
	public void setPutanjaSlike(String putanjaSlike) {
		this.putanjaSlike = putanjaSlike;
	}
	public String getPutanjaPDFaProjekta() {
		return putanjaPDFaProjekta;
	}
	public void setPutanjaPDFaProjekta(String putanjaPDFaProjekta) {
		this.putanjaPDFaProjekta = putanjaPDFaProjekta;
	}
}

