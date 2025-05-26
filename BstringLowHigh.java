package com.takeuforward.striver.String;

public class BstringLowHigh {

	static void toUpperCase(String str) {

		StringBuilder result = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				result.append((char) (ch - 32));
			} else {
				result.append(ch);
			}
		}

		System.out.println("Uppercase: " + result.toString());
	}

	static void toLowerCase(String str) {
		StringBuilder result = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (ch >= 'A' && ch <= 'Z') {
				result.append((char) (ch + 32));
			} else {
				result.append(ch);
			}
		}

		System.out.println("Lowercase: " + result.toString());

	}

	public static void main(String args[]) {

		String str ="Hello WQorld";
		BstringLowHigh.toLowerCase(str);
		BstringLowHigh.toUpperCase(str);	
		
		
//		Explanation
//		ASCII code of 'A' is 65 and 'a' is 97 → difference is 32.
//
//		Adding or subtracting 32 converts between upper and lower case for standard Latin letters.

//		Time Complexity:
//
//			The program iterates through each character once.
//
//			If the length of the string is n, the loop runs O(n) times.
//
//			✅ Space Complexity:
//
//			It uses a StringBuilder to store the result, which takes O(n) space for the output string.
//
//			No other significant data structures.
//
//			Summary:
//
//			Time: O(n)
//
//			Space: O(n)
	
	}
}
