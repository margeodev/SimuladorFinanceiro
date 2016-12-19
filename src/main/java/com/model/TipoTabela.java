package com.model;

public enum TipoTabela {
	DIFERENCIADA_SEMI_01("Diferenciada Semi I"),
	DIFERENCIADA_SEMI_02("Diferenciada Semi II"),
	DIFERENCIADA_SEMI_03("Diferenciada Semi III"),
	DIFERENCIADA_USADOS("Diferenciada Usados");
	
	
	private String descricao;
	
	TipoTabela(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	
}
