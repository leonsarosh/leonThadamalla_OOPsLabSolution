package com.greatlearing.OOPsLabSolution.EmployeeModel;

public class NewEmployee {
	
	private String firstName;
	private String lastName;
	private String department;
	
	
	public NewEmployee(String firstName, String lastName){
		this.lastName=lastName;
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setDepartment(String department) {
		this.department=department;
	}
	
	public String getDepartmentName() {
		return department;
	}

}
