package com.testing;

public class armstrongno {
	public static void main(String[] args) {
	int a=153;
	int b=a;
	int r;
	int sum=0;
	
	while(a>0) {
		r=a%10;//3,5,1
		a=a/10;//150%10=15,15%10=1;
		sum=sum+r*r*r;//0+3*3*3=27
		//27=0+5*5*5=125
		//150=0+1*1*1=153
	}
	
	
	if(sum==b) 
	{	
	        System.out.println("AN AMSTRONG NUMBER");	
	}	
	else 
	{	
		     System.out.println("NOT A AMSTRONG NUMBER");	
	}
	}
}
	
//	        153 = 1       5        3

//	         1^3         5^3      3^3

//	          3    +     125   +    27    = 153
	//


