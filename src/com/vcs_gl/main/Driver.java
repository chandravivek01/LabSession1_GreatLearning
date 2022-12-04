package com.vcs_gl.main;

import java.util.Scanner;

import com.vcs_gl.credentialInterface.CredentialInterface;
import com.vcs_gl.model.Employee;
import com.vcs_gl.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Vivek", "Chandra");
		CredentialInterface ci = new CredentialService();
		
		String generatedEmail=null;
		String generatedPassword=null;
		
		System.out.println("Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
			case 1:{
					generatedEmail=ci.generateEmail(employee.getFirstName().toLowerCase(), 
							employee.getLastName().toLowerCase(), "technical");
					employee.setEmail(generatedEmail);
					generatedPassword = ci.generatePassword(8).toString();
					employee.setPassword(generatedPassword);
					ci.showCredentials(employee);
				break;
			}
			case 2: {
				generatedEmail=ci.generateEmail(employee.getFirstName().toLowerCase(), 
						employee.getLastName().toLowerCase(), "admin");
				employee.setEmail(generatedEmail);
				generatedPassword = ci.generatePassword(8).toString();
				employee.setPassword(generatedPassword);
				ci.showCredentials(employee);
			}
			case 3: {
				generatedEmail=ci.generateEmail(employee.getFirstName().toLowerCase(), 
						employee.getLastName().toLowerCase(), "humanresource");
				employee.setEmail(generatedEmail);
				generatedPassword = ci.generatePassword(8).toString();
				employee.setPassword(generatedPassword);
				ci.showCredentials(employee);
			}
			case 4:{
				generatedEmail=ci.generateEmail(employee.getFirstName().toLowerCase(), 
						employee.getLastName().toLowerCase(), "legal");
				employee.setEmail(generatedEmail);
				generatedPassword = ci.generatePassword(8).toString();
				employee.setPassword(generatedPassword);
				ci.showCredentials(employee);
			}
			default:{
				System.out.println("Enter a valid option !!!");
				break;
			}
				
		}
		System.out.println("Program terminated successfully ...");
		sc.close();
		
	}

}
