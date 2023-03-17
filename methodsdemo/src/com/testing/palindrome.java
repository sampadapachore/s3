package com.testing;

public class palindrome {
	public static void main(String[] args) {
		int actualno =121;
		int a=actualno;
		int rev=0;
		while(a>0) {
			int rem=a%10;  //1,2,
			a=a/10;        //12,0
			rev=rev*10+rem;//1,121
		}
		if(rev==actualno) {
			System.out.println("no is palindrome");
		}
		else {
			System.out.println("no is not palindrome");
		}
		
		}
		}
		
		