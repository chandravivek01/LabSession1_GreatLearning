package com.vcs_gl.credentialInterface;

import com.vcs_gl.model.Employee;

public interface CredentialInterface {

	public char[] generatePassword(int length);
	public String generateEmail(String firstName, String lastName, String department);
	public void showCredentials(Employee employee);
}
