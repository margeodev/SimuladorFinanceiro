package com.repository;



import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.model.Diferenciada1;
import com.model.Simulacao;



public class Tabelas implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject 
	private EntityManager em;
	
	public List<Diferenciada1> all() {
		return em.createQuery("from Diferenciada1", Diferenciada1.class).getResultList();
	}
	
//	public List<Diferenciada1> porEntrada(int perc) {
//		Session session = em.unwrap(Session.class);
//		Criteria criteria = session.createCriteria(Diferenciada1.class);
//		
//		criteria.add(Restrictions.eq("percEntrada", perc));
//		criteria.add(Restrictions.eq("semSpf", perc));
//		
//		return criteria.list();
//	}
	
	public double getTac(){
		Diferenciada1 dif = em.find(Diferenciada1.class, 1);
		return dif.getTac();
	}
	
	public List<Diferenciada1> porEntrada(Simulacao sim) {
		
		Session session = em.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Diferenciada1.class);
//		
		criteria.add(Restrictions.eq("percEntrada", sim.getEscala()));
		criteria.add(Restrictions.ilike("coefDescricao", sim.getCoeficiente(), MatchMode.EXACT));
		criteria.add(Restrictions.ilike("tabDescricao", sim.getTabelaDescricao(), MatchMode.EXACT));
		System.out.println(sim.getTabelaDescricao());
		return criteria.list();
//		return null;
	}
	
	
	
	Diferenciada1 d1 = new Diferenciada1();
	
	public Diferenciada1 uma(){
		return 	em.find(Diferenciada1.class, 1);
	}
	
}
