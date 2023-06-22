package org.tnsif.service;

import org.tnsif.entites.Employee;

public interface EmployeeService {

	//user defined method
	void addEmployee(Employee emp);//create
	Employee getEmployee(int id);//retrive
	void updateEmployee(Employee emp);//update
	void deleteEmployee(Employee emp);//delete
	
}
