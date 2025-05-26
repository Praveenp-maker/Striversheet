package com.takeuforward.striver.String;

public class CountVowelsConso {
	 public static void main(String[] args) {
	        String str = "Hello World!";
	        int vowels = 0;
	        int consonants = 0;

	        // Convert the string to lowercase for easier comparison
	        str = str.toLowerCase();

	        for (char ch : str.toCharArray()) {
	            if ((ch >= 'a' && ch <= 'z')) {  // Check if the character is a letter
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	        
//	        Time Complexity:
//
//	        	Again, iterates over each character once → O(n).
//
//	        	✅ Space Complexity:
//
//	        	Only uses a few integer counters (vowels, consonants) → O(1).
//
//	        	No extra data structures or arrays to store intermediate results.
//
//	        	Summary:
//
//	        	Time: O(n)
//
//	        	Space: O(1)
	    }
}
