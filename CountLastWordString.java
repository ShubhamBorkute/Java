package com.nit.Leetcode58;

public class CountLastWordString {
	
	    public static int lengthOfLastWord(String s) {
	        
	        
	        String arr[] = s.split(" ");
	        
	        int len = arr.length;

			String word[] = { arr[len - 1] };
			int count=0;

			for (String wr : word) {
				for (int i = wr.length() - 1; i >= 0; i--) {
					count++;
				}
				
			}
	        return count;
	        
	    }

	
	public static void main(String[] args) {

String s="Welcome Java";
System.out.println(CountLastWordString.lengthOfLastWord(s));

	}

}
