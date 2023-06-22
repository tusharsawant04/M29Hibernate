package org.tnsif.client;

import java.util.Scanner;

import org.tnsif.entites.Employee;
import org.tnsif.service.EmployeeService;
import org.tnsif.service.EmployeeServiceImpl;

public class Client {

	
	public static void main(String[] args) {
		EmployeeService service =new EmployeeServiceImpl();
		Employee emp =new Employee();
		//create
		Scanner sc =new Scanner(System.in);
		String cont="yes",c;
		
		do {
			
			System.out.println("enter 1 for add Employee ");
			System.out.println("enter 2 for update Employee ");
			System.out.println("enter 3 for retrive Employee ");
			System.out.println("enter 4 for delete Employee ");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			
			
			switch (choice) {
			case 1://add student
				System.out.println("Enter Employee  id");
				int id=sc.nextInt();
				System.out.println("Enter Employee  name");
				String name=sc.next();
				emp.setId(id);
				emp.setName(name);
				service.addEmployee(emp);
				System.out.println("the data added successfully");
				break;
			case 2://
				//update
				System.out.println("Enter Employee  id");
				id=sc.nextInt();
				emp=service.getEmployee(id);
				System.out.println("Enter Employee  name");
				 name=sc.next();
				emp.setName(name);
				service.updateEmployee(emp);
		    	System.out.println("data updated successfully from the database");	
		    	break;
			case 3:
				//at this breakpoint, we have added one record to table
				// Retrieve Operation
				System.out.println("Enter Employee  id");
				id=sc.nextInt();
				emp = service.getEmployee(id);
				System.out.println(emp.getId());
				System.out.println(emp.getName());
				break;
			case 4:
				// Delete Operation
				System.out.println("Enter Employee  id");
				id=sc.nextInt();
				emp = service.getEmployee(id);
				service.deleteEmployee(emp);;
			default:
				break;
		}
			System.out.println("for exit type yes");
			 c=sc.next();
		}while(cont!=c);
		
		
		
	
		

	}
}
