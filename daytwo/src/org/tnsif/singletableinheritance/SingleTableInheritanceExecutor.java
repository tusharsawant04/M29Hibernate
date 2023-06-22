package org.tnsif.singletableinheritance;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class SingleTableInheritanceExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create emp
		Employee emp=new Employee();
		emp.setEmpName("manoj sawant");
		emp.setSalary(1234567.4f);
		em.persist(emp);
		
		//create emp
		Employee emp1=new Employee();
		emp1.setEmpName("aryan sawant");
		emp1.setSalary(1234567.4f);
		em.persist(emp1);
		
		//create manager
		Manager m=new Manager();
		m.setEmpName("tuhsar sawant");
		m.setSalary(12345.4f);
		m.setDeptName("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("data added successfully");
		em.close();
		factory.close();	
	}
}
