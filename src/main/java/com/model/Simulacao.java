package com.model;

import java.io.Serializable;


public class Simulacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private double entrada;
	private double valor;
	private String coeficiente;
	private String tabelaDescricao;
	
	public double getDiferenca() {
		return valor-entrada;
	}	
	
	public double getPercentual(){		
		double tmpValor = 0;
		double tmpEntrada = 0;
		double perc = 0;
		tmpValor = valor;
		tmpEntrada = entrada;
		tmpEntrada = tmpEntrada*100;	
		if (tmpValor>0) {
			perc = tmpEntrada/tmpValor;
		}		
		return perc;
	}

	public int getEscala(){
		int valorFinal = 0;
		double valor = this.getPercentual();
		if (valor>=40) {
			valorFinal = 40;
		} else if (valor>=30){
			valorFinal = 30;
		} else if (valor>=20){
			valorFinal = 20;
		}		
		return valorFinal;
	}	
	
	public double getVinte(){
		double valorTmp = valor;
		return (valorTmp*20)/100;		
	}
	public double getTrinta(){
		double valorTmp = valor;
		return (valorTmp*30)/100;		
	}
	public double getQuarenta(){
		double valorTmp = valor;
		return (valorTmp*40)/100;		
	}
	
	
	public double getEntrada() {
		return entrada;
	}

	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	

	public String getTabelaDescricao() {
		return tabelaDescricao;
	}

	public void setTabelaDescricao(String tabelaDescricao) {
		this.tabelaDescricao = tabelaDescricao;
	}

	public String getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(String coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	
	
}
