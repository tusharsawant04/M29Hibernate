package org.tnsif.service;

import org.tnsif.dao.EmployeeDao;
import org.tnsif.dao.EmployeeDaoImpl;
import org.tnsif.entites.Employee;

public class EmployeeServiceImpl  implements EmployeeService{

	private  EmployeeDao dao;
	
	
	public EmployeeServiceImpl() {
		dao=new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
		
	}

	@Override
	public Employee getEmployee(int id) {
		Employee emp=dao.getEmployee(id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
	    dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
	}

}
