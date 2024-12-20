package com.cdac.placement;

import java.util.ArrayList;
import java.util.List;

public class HashsetImplementation {
		int arr[] = new int[10];
		int index=0;
		
		public void add(int key) {
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return;
			}
		}	
		arr[index] = key;
		index++;
	
			
		}
		
		public boolean containsKey(int key) {
			for(int i=0;i<index;i++) {
				if(arr[i] == key) {
					return true;
				}
			}
			return false;
		}
		
		public void removeKey(int key) {
			for(int i=0;i<index;i++) {
				if(arr[i] == key) {
					for(int j=i;j<index;j++) {
					arr[i] = arr[j+1];
					}
				}
				
			}
		}
		public void printData() {
			for(int i=0;i<index;i++) {
				System.out.println(arr[i]);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashsetImplementation h = new HashsetImplementation();
		
		h.add(10);
		h.add(10);
		h.add(10);
		h.add(20);
		h.add(30);
		
		h.printData();
		
		System.out.println(h.containsKey(20));
		
		h.removeKey(10);
		h.printData();
		
	}

}
