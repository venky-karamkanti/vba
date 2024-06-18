package com.vba;

public class IndexOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,6,7,2,8,9};
		int number=2;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				System.out.println("Find the index of number " + i);
			}
		}

	}

}
