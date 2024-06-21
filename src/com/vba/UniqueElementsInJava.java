package com.vba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueElementsInJava {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt();
	Integer[] arr=new Integer[size];
	System.out.println("Enter "+size+" Elements");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();}
	//Arrays.sort(arr);
	List<Integer> vk=Arrays.asList(arr);
	HashSet<Integer> ab=new HashSet<Integer>(vk);
	List<Integer> vd=new ArrayList<Integer>(ab);

	System.out.println(vd);
	
	sc.close();
	}
	
	
	
}


