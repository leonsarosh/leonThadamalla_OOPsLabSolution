package com.greatlearing.OOPsLabSolution.DriverPackage;

import java.util.Scanner;

import com.greatlearing.OOPsLabSolution.EmployeeModel.NewEmployee;
import com.greatlearing.OOPsLabSolution.Services.CredentialsSerivce;
import com.greatlearing.OOPsLabSolution.Utilities.CheckForString;


public class MainDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int input1;
		
		do {
			
		System.out.println("Please choose an option from below:");
		System.out.println("0. Exit");
		System.out.println("1. Create new credentials");
		
		while(!sc.hasNextInt()) {
			System.out.println("Please enter values from 0 / 1 only");
			String temp=sc.next();
		}
	
		input1=sc.nextInt();

		switch (input1) {
		
		case 0: 
			break;	
		case 1: {
			
			Scanner sc1=new Scanner(System.in);
			
			String firstName;
			String lastName;
			
			CheckForString stringcheck=new CheckForString();
			
			System.out.print("Please enter first name: ");
			
			firstName=sc1.nextLine();
			
			if (stringcheck.isLetters(firstName)==false) {
				do {
					System.out.println("Please enter only string values. Try again.");
					firstName=sc1.nextLine();
				} while (stringcheck.isLetters(firstName)==false);
				
			}
			 
			System.out.print("Please enter last name: ");
			
			lastName=sc1.nextLine();
			
			if (stringcheck.isLetters(lastName)==false) {
				do {
					System.out.println("Please enter only string values. Try again.");
					lastName=sc.nextLine();
				} while (stringcheck.isLetters(lastName)==false);
				
			}
			
			System.out.println();
			
			NewEmployee newEmployee=new NewEmployee(firstName,lastName );
			
			System.out.println("Please select an option for department from below: ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resources");
			System.out.println("4. Legal");
			
			int input2;
			
			while(!sc1.hasNextInt()) {
				System.out.println("Please enter values from 0 / 1 / 2 / 3 / 4 only");
				String temp=sc1.next();
			}
				
			
			input2=sc1.nextInt();
			
				switch (input2) {
				
				case 1: {
					newEmployee.setDepartment("tech");
					break;
				}
				
				case 2: {
					newEmployee.setDepartment("admn");
					break;
				}
				
				case 3: {
					newEmployee.setDepartment("hr");
					break;
				}
				
				case 4: {
					newEmployee.setDepartment("legal");
					break;
				}
				
				}

			CredentialsSerivce cred1=new CredentialsSerivce();
			String emailId=cred1.generateEmailAddress(newEmployee.getFirstName(),newEmployee.getLastName(),newEmployee.getDepartmentName());
			String password=cred1.generatePassword();
			cred1.showCredentials(newEmployee.getFirstName(),emailId,password);
			System.out.println();
			break;	
		}
		}
		} while(input1!=0);
		
		System.out.println("Exit Successfull");
		
		sc.close();

	}

}
