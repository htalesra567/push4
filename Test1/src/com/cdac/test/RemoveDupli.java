package com.cdac.test;

public class RemoveDupli {
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,4,4,5,5,5,6};
		//int []arr = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		int key = 0;
		for(int i=1;i<n;i++) {
			if(arr[key] != arr[i]) {
				arr[++key] = arr[i]; 
			}
		}
		
		for(int i=0;i<key+1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nNo of unique elements: "+(key+1));
	}
}
