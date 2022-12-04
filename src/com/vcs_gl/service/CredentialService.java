package com.vcs_gl.service;

import java.util.Random;

import com.vcs_gl.credentialInterface.CredentialInterface;
import com.vcs_gl.model.Employee;

public class CredentialService implements CredentialInterface {

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

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));
	
		for(int i = 4; i< length ; i++) {
		password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}

	@Override
	public String generateEmail(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName+lastName+"@"+department+".gl.in";
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+employee.getFirstName()+" ,your credentials are as follow:");
		System.out.println("Email:"+employee.getEmail());
		System.out.println("Password:"+employee.getPassword());
	}

}
