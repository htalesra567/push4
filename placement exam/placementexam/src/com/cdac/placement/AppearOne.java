package com.cdac.placement;

public class AppearOne {

		public static int uniqueNo(int arr[]) {
			int count =0;
			for(int i=0;i<arr.length;i++) {
				count=0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				}
				if(count ==1) {
					return i;
				}
			}
			return 0;
		}
		
		public static void main(String args[]) {
			 
			int arr[]= {1,1,2,2,3,4,4,5,5};
			
			System.out.println(uniqueNo(arr));
		}
}
