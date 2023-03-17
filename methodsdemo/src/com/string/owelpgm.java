package com.string;

public class owelpgm {
	public static void main(String[] args) {
		
		String str ="Hi Welcome to my world!";
	    
		int count; 
		
	    for(int i=0; i<str.length(); i++) {
	      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| //index no find charat
	          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
	          str.charAt(i) == 'u')
	    	 
	        System.out.println("Given string contains " + 
	            str.charAt(i)+" at the index " + i);
	  
	    }
	}

	}

