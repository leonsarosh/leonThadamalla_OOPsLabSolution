package com.greatlearing.OOPsLabSolution.Utilities;

public class CheckForString {
	
	public boolean isLetters(String str) {
		String regex="[a-zA-Z]+";
		return str.matches(regex);
	}

}
