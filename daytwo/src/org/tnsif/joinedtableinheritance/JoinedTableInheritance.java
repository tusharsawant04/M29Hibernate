package org.tnsif.joinedtableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.tableperclassinheritance.Citizen;
import org.tnsif.tableperclassinheritance.Person;

public class JoinedTableInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//vehicle 1
		Vehicale v=new Vehicale();
		v.setVehicleNo(123);
		v.setSpeed(120);
		v.setPrice(7890000.00f);
		v.setType("Four-Wheeler");
		em.persist(v);
		//create citizen1
		Vehicale v1=new Vehicale();
		v1.setVehicleNo(12);
		v1.setSpeed(120);
		v1.setPrice(7890000.00f);
		v1.setType("Four-Wheeler");
		em.persist(v1);
		//car 1
				Car c=new Car();
				c.setBrandName("mercedes");
				c.setPrice(57000000.0f);
				c.setSpeed(120);
				c.setType("Four Wheeler");
				c.setVehicleNo(919);
				em.persist(c);
		
		
		em.getTransaction().commit();
		System.out.println("data added successfully");
		em.close();
		factory.close();

	}

}
