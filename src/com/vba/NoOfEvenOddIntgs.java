package com.vba;

public class NoOfEvenOddIntgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int count =0,sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
	
				System.out.print(" " +  arr[i] );
		
				count ++;
				sum=sum+arr[i]; 
				}}
	
		System.out.print('\n' + "sum of odd integeres:  " +  sum);
				
		System.out.print('\n' + "Number of odd integers: " +count);
		
		
		

}}