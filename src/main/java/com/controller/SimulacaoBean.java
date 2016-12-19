package com.controller;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.model.Diferenciada1;
import com.model.Simulacao;
import com.model.TipoTabela;
import com.repository.Tabelas;



@Named
@ViewScoped
public class SimulacaoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Simulacao simulacao;	
	private String tabelaDescricao = "Tabela escolhida";
	@Inject
	private Tabelas tabelasRep;	
	private List<Diferenciada1> diferenciada1; // = new ArrayList<Diferenciada1>();
	
	
	public SimulacaoBean(){
		diferenciada1 = new ArrayList<Diferenciada1>();
		simulacao = new Simulacao();
	}
	
//	@PostConstruct
//	public void init(){
//		limpar();
//	}
	public void limpar(){
		simulacao = new Simulacao();
		tabelaDescricao = "Tabela escolhida";
		diferenciada1 = new ArrayList<Diferenciada1>();
	}	
		
	public void porEntrada(){
		if (this.simulacao.getTabelaDescricao() != null && this.simulacao.getCoeficiente()!=null) {
			this.diferenciada1 = new ArrayList<Diferenciada1>();
//			diferenciada1 = tabelasRep.porEntrada(this.simulacao);
			List <Diferenciada1> difTemp = tabelasRep.porEntrada(this.simulacao);
//			double diferenca_ = this.simulacao.getDiferenca();
//			double tac_ = this.getTac();
			for (Diferenciada1 dif: difTemp){
				double v = (this.simulacao.getDiferenca()+this.getTac())*dif.getCoefValor();
				dif.setParcela(v);
				diferenciada1.add(dif);
			}
			this.comparaEnum(simulacao.getTabelaDescricao());
		}
		
	}
	
	public double getTac(){
		return tabelasRep.getTac();
	}

	public String comparaEnum(String descricao){
		if ("DIFERENCIADA_SEMI_01".equals(descricao)){
			this.tabelaDescricao = "Diferenciada Semi 01";	
			System.out.println(1);
		}			
		else if ("DIFERENCIADA_SEMI_02".equals(descricao)){
			this.tabelaDescricao = "Diferenciada Semi 02";	
			System.out.println(2);
		}			
		else if ("DIFERENCIADA_SEMI_03".equals(descricao)){
			this.tabelaDescricao = "Diferenciada Semi 03";	
			System.out.println(3);
		}			
		else if ("DIFERENCIADA_USADOS".equals(descricao)){
			this.tabelaDescricao = "Diferenciada Usados";	
			System.out.println(4);
		}	
		return tabelaDescricao;
	}	
	
	public TipoTabela[] getTipoTabela(){
		return TipoTabela.values();
	}
	
	public Simulacao getSimulacao() {
		return simulacao;
	}

	public void setSimulacao(Simulacao simulacao) {
		this.simulacao = simulacao;
	}	
	
	public List<Diferenciada1> getDiferenciada1() {
		return diferenciada1;
	}

	public String getTabelaDescricao() {
		return tabelaDescricao;
	}
	
	
}
