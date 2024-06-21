package com.vba;

import java.util.Arrays;
import java.util.Scanner;

public class PrintSumofNegNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size=sc.nextInt();
		int[]arr= new int [size];
		int sum=0;
		System.out.println("Enter  " +size+"  Elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			}
	  
		for(int v:arr) {
			if(v<0) {
				sum=sum+v;}}
		
			System.out.println("Sum of negative numbers: "+sum);
		
		
	}
		}
