package com.vba;

import java.util.Scanner;

public class CubicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter size of the Array");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("Enter "+size+"  Elements");
for(int i=0;i<size;i++) {
	arr[i]=sc.nextInt();
}
System.out.println("+Print cubical array......:");
for(int v :arr) {
	System.out.println(v*v*v);
	
}
	}

}
