package com.util.jpa;



import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {
	
	private EntityManagerFactory factory;
	
	public EntityManagerProducer(){
		factory = Persistence.createEntityManagerFactory("Simulacao_PU");
	}
	
	@Produces @RequestScoped
	public EntityManager createEntityManager(){
		return factory.createEntityManager();
	}
	
	public void closeEM(@Disposes EntityManager em){
		em.close();
	}
}
