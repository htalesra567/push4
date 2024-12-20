package com.cdac.placement;

import java.util.HashSet;
import java.util.Set;

public class NonRepeating {
	
	public static int NonRepeating(String s) {
		
		int count =0;
		for(int i=0;i<s.length();i++) {
			count =0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if(count ==1) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String string = "leeltcode";
	System.out.println(NonRepeating(string));
		
	}

}
