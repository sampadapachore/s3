package com.testing;

public class qs {
	public static void main(String[] args) {
	String s="madam";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev)) {
		System.out.println("y");
	}
	else {
		System.out.println("n");
	}
	}
		
	}