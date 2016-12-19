package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="diferenciada_01")
@Entity
public class Diferenciada1 {
	private int id;
	private int prazo;
	private double taxa;
	private String coefDescricao;
	private double coefValor;
	private int percEntrada;
	private double normal;
	private double plus;
	private String tabDescricao;
	private double tac;
	private double parcela;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	
	
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	@Column(name="coeficiente_descricao")
	public String getCoefDescricao() {
		return coefDescricao;
	}
	public void setCoefDescricao(String coefDescricao) {
		this.coefDescricao = coefDescricao;
	}
	
	@Column(name="coeficiente_valor")
	public double getCoefValor() {
		return coefValor;
	}
	public void setCoefValor(double coefValor) {
		this.coefValor = coefValor;
	}
	
	@Column(name="percentual_entrada")
	public int getPercEntrada() {
		return percEntrada;
	}
	public void setPercEntrada(int percEntrada) {
		this.percEntrada = percEntrada;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getPlus() {
		return plus;
	}
	public void setPlus(double plus) {
		this.plus = plus;
	}
	
	@Column(name="tabela_descricao")
	public String getTabDescricao() {
		return tabDescricao;
	}
	public void setTabDescricao(String tabDescricao) {
		this.tabDescricao = tabDescricao;
	}
	public double getTac() {
		return tac;
	}
	public void setTac(double tac) {
		this.tac = tac;
	}
	
	@Transient
	public double getParcela() {
		return parcela;
	}
	public void setParcela(double parcela) {
		this.parcela = parcela;
	}
	
	
	
}
