package com.dilip.challenges;

public class Combine2Strings {

	static String b = "abcdcefgh";
	static String a = "1234";
	static StringBuilder newpass = new StringBuilder();
	
	/*merge the 2 strings picking a character at a time from each string*/

	public static void main(String[] args) {
		String maxStr = "";
		
		if (a.length() > b.length()) {
			maxStr = a;
		}
		else {
			maxStr = b;
		}

		for (int i = 0; i < maxStr.length(); i++) {
			if (a.length() > b.length()) {
				if(i < b.length()) {
					char ch1 = a.charAt(i);
					char ch2 = b.charAt(i);
					newpass.append(ch1);
					newpass.append(ch2);
				}
				else {
					char ch1 = a.charAt(i);
					newpass.append(ch1);
				}
			}
			else if (b.length() > a.length()) {
				if(i < a.length()) {
					char ch1 = a.charAt(i);
					char ch2 = b.charAt(i);
					newpass.append(ch1);
					newpass.append(ch2);
				}
				else {
					char ch1 = b.charAt(i);
					newpass.append(ch1);
				}
			}
		}
		System.out.println(newpass.toString());
	}
}
