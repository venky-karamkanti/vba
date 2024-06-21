package com.vba;

import java.util.Arrays;
import java.util.Scanner;

public class DescOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" Enter size of array :");
int size=sc.nextInt();
int[] arr=new int[size];
//Arrays.sort(arr);
System.out.println("Enter "+size+ " Elements");
for(int i=0;i<size;i++) {
	arr[i]=sc.nextInt();
}
	Arrays.sort(arr);
	System.out.println("Sorted enements "+ Arrays.toString(arr));
 
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print('\n'+" " +arr[i]);}
	}
	}



