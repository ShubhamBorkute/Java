package com.nit.Leetcode58;

import java.util.Arrays;

public class ResLastWordString {

	public static void main(String[] args) {
		String str = "Welcome to Java";

		String arr[] = str.split(" ");
		int len = arr.length;

		String word[] = { arr[len - 1] };
		String res = " ";

		for (String wr : word) {
			for (int i = wr.length() - 1; i >= 0; i--) {
				res = res + wr.charAt(i);
			}
			System.out.println(res);
		}

		/*
		 * String s=word[0]; String[] str1=s.split(""); for(int
		 * i=str1.length-1;i>=0;i--) { System.out.print(str1[i]); }
		 */

		// System.out.println(res);
	}

}
