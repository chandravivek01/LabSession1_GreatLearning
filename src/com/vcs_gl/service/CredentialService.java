package com.vcs_gl.service;

import java.util.Random;

import com.vcs_gl.credentialInterface.CredentialInterface;
import com.vcs_gl.model.Employee;

public class CredentialService implements CredentialInterface {

	// Block for Generating Random Password. 
	@Override
	public char[] generatePassword(int length) {
		// TODO Auto-generated method stub
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		// Ensuring that the Password conatins Atleast 1 Uppercase, 1 Lowercase, 1 Number & 1 Special Character.
		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));
		
		// Iteration to fill the rest 4 characters for the Password.
		for(int i = 4; i< length ; i++) {
		password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}
	
	// Block to Generate Email in the format firstNameLastName@department.company.com .
	@Override
	public String generateEmail(String firstName, String lastName, String department) {
		// Using String concatenation to get the Required Format and returning the same.
		return firstName+lastName+"@"+department+".gl.in";
	}

	// Block to display the Credentials of the Employee. 
	@Override
	public void showCredentials(Employee employee) {
	
		System.out.println("Dear "+employee.getFirstName()+" ,your credentials are as follow:");
		System.out.println("Email:"+employee.getEmail());
		System.out.println("Password:"+employee.getPassword());
	}

}
