package com.greatlearing.OOPsLabSolution.Utilities;

public class ToLowerCaseCustom {

	public String covertToLowerCase (String str) {
		
		StringBuilder strBuffer=new StringBuilder(str);
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isUpperCase(str.charAt(i))) {
				
				strBuffer.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
			
		}
		
		return strBuffer.toString();
	}
	
	
}
