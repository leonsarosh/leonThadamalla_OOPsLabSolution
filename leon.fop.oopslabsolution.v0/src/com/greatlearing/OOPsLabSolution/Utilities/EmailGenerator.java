package com.greatlearing.OOPsLabSolution.Utilities;

public class EmailGenerator {
	
	private String email;
	private String firstName;
	private String lastName;
	private String departmentName;
	
	public EmailGenerator (String firstName, String lastName, String departmentName){
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.departmentName=departmentName;
		
	}
	
	public String getEmailId() {
		
		ToLowerCaseCustom lowercase=new ToLowerCaseCustom();
		return email=lowercase.covertToLowerCase(firstName)+lowercase.covertToLowerCase(lastName)+"@"+departmentName+".abc.com";
	}

}
