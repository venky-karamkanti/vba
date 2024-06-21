package com.vba;

public class ComElemtsTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr={ {1,4,3,2,6,9,7},{10,5,1,4,3}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]);
			}
		}
	}

	}}
