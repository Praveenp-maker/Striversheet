package com.takeuforward.striver.String;

public class Palindrome {
	
	
	static boolean stringPal(String str) {
	    str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
		
	}
	static boolean numPal(int num) {
		  int originalNum = num;
	        int reversedNum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        return originalNum == reversedNum;
		
	}

public static void main(String args[]) {
	
	String s1 ="hello";
	
	int a=143;
	System.out.println(Palindrome.stringPal(s1));
	System.out.println(Palindrome.numPal(a));
	
}
	
	
}
