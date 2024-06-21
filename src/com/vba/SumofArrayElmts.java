package com.vba;

import java.util.Scanner;

public class SumofArrayElmts {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Size of the Array:");
int size=sc.nextInt();
int[] array= new int[size];
System.out.println("Enter " + size +" Elements");
for(int i=0;i<size;i++) {
	
	array[i]=sc.nextInt();
	
	sum=sum+array[i];
	}
	System.out.println("sum of array Elements:  "+sum );
	
sc.close();

		
	}
	
}


