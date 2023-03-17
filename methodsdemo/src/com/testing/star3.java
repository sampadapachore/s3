package com.testing;

public class star3 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {                 
			for(int p=4;p>=i;p--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				}
			for(int k=2;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
	
}
