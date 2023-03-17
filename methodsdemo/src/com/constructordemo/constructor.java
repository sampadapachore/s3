package com.constructordemo;
//non static method call from same class
public class constructor {
	public static void main(String[] args) {
		constructor s1=new constructor ();
		s1.m1();
		constructor s2=new constructor();
		s2.m2(2,3);
	}
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("without parameter");
	}
	public void m2(int a,int b) {
		// TODO Auto-generated method stub
		int c;
		c=a+b;
		
		System.out.println("add:"+c);
		

	}

	}