

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Dif1 implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private int prazo;
	private double taxaCliente;
	private double semSpf;
	private double comSpf;
	private double normal;
	private double plus;
	private int percEntrada;
	
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
	
	@Column(name="taxa_cliente")
	public double getTaxaCliente() {
		return taxaCliente;
	}
	public void setTaxaCliente(double taxaCliente) {
		this.taxaCliente = taxaCliente;
	}
	
	@Column(name="sem_spf")
	public double getSemSpf() {
		return semSpf;
	}
	public void setSemSpf(double semSpf) {
		this.semSpf = semSpf;
	}
	
	@Column(name="com_spf")
	public double getComSpf() {
		return comSpf;
	}
	public void setComSpf(double comSpf) {
		this.comSpf = comSpf;
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
	
	@Column(name="percentual_entrada")
	public int getPercEntrada() {
		return percEntrada;
	}
	public void setPercEntrada(int percEntrada) {
		this.percEntrada = percEntrada;
	}
	
	
}
