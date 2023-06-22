package org.tnsif.dao;

import org.tnsif.entites.Employee;

public interface EmployeeDao {

	//by default abstract method
	//User defined method for CRUD operation
	void addEmployee(Employee emp);
	Employee getEmployee(int id);
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	
	//JPA transaction
	void beginTransaction();//begin
	void commitTransaction();//close
	
}
