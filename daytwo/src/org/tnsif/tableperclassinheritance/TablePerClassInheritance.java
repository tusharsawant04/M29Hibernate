package org.tnsif.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class TablePerClassInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create citizen
		Citizen c=new Citizen();
		c.setAadharNo(23456789L);
		c.setCity("pune");
		c.setArea("cra");
		em.persist(c);
		
		//create citizen1
				Citizen c1=new Citizen();
				c1.setAadharNo(23412367389L);
				c1.setCity("mumbai");
				c1.setArea("virar");
				em.persist(c1);
		
		//create person
				Person p=new Person();
				p.setAadharNo(234567389L);
				p.setCity("mumbai");
				p.setArea("virar");
				p.setName("tushar");
				p.setContactNo(12345678L);
				em.persist(p);
		
		
		em.getTransaction().commit();
		System.out.println("data added successfully");
		em.close();
		factory.close();
		

	}

}
