package com.greatlearing.OOPsLabSolution.Services;

import com.greatlearing.OOPsLabSolution.Utilities.EmailGenerator;
import com.greatlearing.OOPsLabSolution.Utilities.PasswordGenerator;



public class CredentialsSerivce {
	
	public String generateEmailAddress(String firstName, String lastName, String departmentName) {
	
		EmailGenerator email_gen_obj=new EmailGenerator(firstName,lastName,departmentName);
		return email_gen_obj.getEmailId();	
	}
	
	public String generatePassword() {
		
		PasswordGenerator password_obj=new PasswordGenerator();
		return password_obj.generatePassword();
	}
	
	public void showCredentials(String firstName, String emailId, String password) {
		
		System.out.println("Dear "+firstName+" generated credentials are as follows: ");
		System.out.println("Email    ------> "+emailId);
		System.out.println("Password ------> "+password);
		
	}

}
