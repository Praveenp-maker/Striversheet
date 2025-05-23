package com.takeuforward.striver.String;

import java.util.Arrays;

public class BString {

	public static void main(String[]args) {
		
		String s= "olleh";
		char ans[] =new char[s.length()];
		int i=0;
		for(char c: s.toCharArray()) {
			ans[i++] = c;
		}
		
		for(char c: ans) {
			System.out.print(c+" ");
		}
		
		char fin[] =new char[s.length()];
		
		int count =0;
		System.out.println(ans.length+" ");
		for(int j= ans.length-1;j>=0;j--) {
			fin[count++] = ans[j];
		}
		
		for(char c: fin) {
			System.out.print(c+" ");
		}
		
		String str = new String(fin);
		System.out.print(str);
	
		
		
		//--------------------------------------------------------
		
		
		String s1 = "olleh";
		char[] chars = s1.toCharArray();
		int left = 0, right = chars.length - 1;
		while (left < right) {
		    char temp = chars[left];
		    chars[left] = chars[right];
		    chars[right] = temp;
		    left++;
		    right--;
		}
		String reversed = new String(chars);
		System.out.println(reversed);  // Output: "hello"

	}
}
