package com.inheritance;
//instance block execute at the timre of obj creation
//constrctor mai initialize kr sktehai
//har class ka parent object hai
//static inheritance mai participatenhi kregi
public class finalvar {
	final float pi;//black instance final var
	{
		pi=3.14f;//initialized of instanceblock
	}
	public static void main(String[] args) {
		finalvar i=new finalvar();
		System.out.println(i.pi);
	}
	}


