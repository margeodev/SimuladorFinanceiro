import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Simulacao_PU");
		EntityManager em = factory.createEntityManager();
		
//		em.close();
		Dif1 d = em.find(Dif1.class, 1);
		
		System.out.println("Taxa: "+d.getComSpf());
		}
}
