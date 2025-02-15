package com.cdac.placement;

public class Palindrome {
	
	public static boolean palindromeCheck(String s) {
		
		StringBuilder sb = new StringBuilder(s);

		int n = sb.length()-1;
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i) != sb.charAt(n-i) && i<n/2) {
				sb.deleteCharAt(i);
				break;
			}
		}
		
		
		if(sb == sb.reverse()) {
			return true;
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		
		String string= "abcda";
		System.out.println(palindromeCheck(string));
	}

}
