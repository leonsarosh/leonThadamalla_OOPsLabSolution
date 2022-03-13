package com.greatlearing.OOPsLabSolution.Utilities;

import java.util.Random;

public class PasswordGenerator {
	
	private String password;
	private char[] ca=new char[8];
	
	public String generatePassword() {
	
	String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789!@#$%^*+=-/"+ "abcdefghijklmnopqrstuvxyz";
	Random random=new Random();
	
	for (int i = 0; i < 8; i++) {
		ca[i]=AlphaNumericString.charAt(random.nextInt(AlphaNumericString.length()));
    }
	
	return password=new String(ca);
	
	}

}
