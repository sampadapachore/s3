package com.testing;

public class ascendingorder {
	public static void main(String[] args) {
		int [] x= {13,9,11,18,21,7,25};
		int temp=0;
		for(int i=0;i<x.length;i++) {
			for(int j=1;j<x.length;j++) {
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int a:x) {
			System.out.println(a);
		}

	}
}
