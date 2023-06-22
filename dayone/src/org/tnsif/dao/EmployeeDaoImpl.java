package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entites.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private EntityManager em;
	
	
	
	public EmployeeDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

	//create or add
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
		
		
	}

	//retrive
	@Override
	public Employee getEmployee(int id) {
		Employee emp=em.find(Employee.class, id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);	
	}

	@Override
	public void deleteEmployee(Employee emp) {
		em.remove(emp);
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		
		em.getTransaction().commit();
	}

}
