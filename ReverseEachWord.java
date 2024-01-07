package com.nit.Reverse;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "Welcome To Java";
		String revstr = "";
		String[] words = str.split(" ");
		for (String word : words) {
			String revword = "";

			for (int i = word.length()-1; i >= 0; i--) {

				revword = revword + word.charAt(i);

			}
			revstr = revstr + revword + " ";

		}
		System.out.println("String Reverse : " + revstr);
	}

}
