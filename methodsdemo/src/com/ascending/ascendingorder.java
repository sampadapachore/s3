package com.ascending;

public class ascendingorder {
	public static void main(String[] args) {
		int [] x= {20,30,40,50};
		boolean isSorted=true;
		for(int i=0;i<x.length-1;i++) {
			if(x[i]>x[i+1]) {
				 isSorted=false;
			
			break;
			}}
		if(isSorted) {
			System.out.println("array is sorted");
		}
		else {
			System.out.println("array is not sorted");
				
			}
		}
		

}
