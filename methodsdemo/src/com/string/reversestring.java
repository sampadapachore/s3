package com.string;

public class reversestring {
	public static void main(String[] args) {
	      String s[]= { "velocity","katraj","pune"};	
		    
			int arraylen=s.length; //for whole string array we calculate length
		
		for(int j=0;j<=arraylen-1;j++) 
		{
			 String value=s[j];
		     
			 int len=value.length(); 
		
		     for(int i=len-1;i>=0;i--) //reverse
		 	{
		       System.out.print(value.charAt(i));
		    		
		 	}
		      System.out.println();
		 
		     
		
		
		}
		}
		
	}


