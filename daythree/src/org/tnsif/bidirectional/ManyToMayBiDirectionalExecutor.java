package org.tnsif.bidirectional;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ManyToMayBiDirectionalExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
	Product p=new Product();
	p.setProductid(234);
	p.setProductname("sanitizer");
	p.setPrice(60.0f);
	
	Order o=new Order();
	o.setOrderid(12);
	o.setPurchasedate(new Date());
	
	o.addOrder(p);
	
	em.persist(o);
		
		
		em.getTransaction().commit();
		System.out.println("data added successfully");
		em.close();
		factory.close();


	}

}
