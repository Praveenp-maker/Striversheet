package com.takeuforward.striver.array;

public class Barray1 {
	
	static void add(int a[], int k) {
		System.out.println(a.length);
		int n = a.length+1;
		int b[] = new int[n];   // 5
		
		for(int i=0;i<a.length;i++) {
			b[i]= a[i];
			System.out.println(b[i]+" "+ a[i]);
		}
		b[n-1] =k;
	
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
	
	
	static void sub(int a[], int k) {
		int n = a.length;
		int b[] = new int[n];
		int index = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=k) {
				b[index++] =a[i];
			}
			
		}
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

	
	public static void main(String args[]) {
		
		int a[] = {1,2,3,4};
		
		Barray1.sub(a, 3);
		
		Barray1.add(a,5);
	}
}
