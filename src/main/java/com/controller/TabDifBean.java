package com.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.model.Diferenciada1;
import com.model.Simulacao;
import com.repository.Tabelas;



@Named
@ViewScoped
public class TabDifBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Tabelas tabelasRep;	
	private int perc;
	private Simulacao simulacao;
	
	private List<Diferenciada1> diferenciada1 = new ArrayList<Diferenciada1>();
	
	
	public TabDifBean(){
		simulacao = new Simulacao();
	}
	
	public void porEntrada(){
		diferenciada1 = tabelasRep.porEntrada(this.simulacao);
	}
	
	
	public List<Diferenciada1> getDiferenciada1() {
		return diferenciada1;
	}


	public int getPerc() {
		return perc;
	}


	public void setPerc(int perc) {
		this.perc = perc;
	}


	public Simulacao getSimulacao() {
		return simulacao;
	}
			
	
}
