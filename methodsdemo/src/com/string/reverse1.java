package com.string;

public class reverse1 {
	public static void main(String[] args) {
		String S[]= { "velocity","katraj","pune"};	
		 String value=S[1];
		 
		 System.out.println(value);
	     
		 int len=value.length();
	
	     for(int i=len-1;i>=0;i--) {
		      System.out.print(value.charAt(i));
	} 
		
		
		}
	
	
}
