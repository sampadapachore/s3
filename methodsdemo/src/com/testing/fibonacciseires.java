package com.testing;

public class fibonacciseires {
	public static void main(String[] args) {
		int t=0;
		int a=1;
		int c;
		for(int i=0;i<=10;i++) {
	
	 c=t+a;
		System.out.println(c);
		t=a;
		a=c;
		
		}
		}
		}

	//   t    +    a    =   c
	//   0         1         1
	//   1         1         2
	//   1         2         3
	//   2         3         5   
	//   3         5         8
	//   4         8         11
	// fibonace - it is sum of privious two digits