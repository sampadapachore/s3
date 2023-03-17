package com.testing;

public class addarray {
	public static void main(String[] args) {
		int [] x= {10,20,30,40,50};
		int sum=0;
		int result=0;
		int digit;
		for(int i=0;i<=4;i++) 
		{
			result=x[i]+result;
		}
		System.out.println("result:"+result);
		while(result>0) 
		{
			digit=result%10;
			result=result/10;
			sum=sum+digit;
		}
		System.out.println("sum:"+sum);
		}
		}
	