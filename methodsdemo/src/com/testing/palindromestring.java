package com.testing;

public class palindromestring {
	
	public static void main(String[] args) {
		String s="madam";	
		String rev="";
		for(int j=s.length()-1;j>=0;j--) {
		     rev=rev+s.charAt(j);
		}
		if(s.equals(rev)) {
		System.out.println("pallandrom string");
		}
		else {
		System.out.println("not a pallandrom");
		}
		
		
		
	}

}
