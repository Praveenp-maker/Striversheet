package com.takeuforward.striver.array;

public class LeftRightRotate2 {
	
	public static void leftRotate(int[] arr, int k) {
	    int n = arr.length;
	    k = k % n;   // 1/5 => 1
	    reverse(arr, 0, k - 1);
	    reverse(arr, k, n - 1);
	    reverse(arr, 0, n - 1);
	}

	public static void rightRotate(int[] arr, int k) {
	    int n = arr.length;
	    k = k % n;
	    reverse(arr, 0, n - 1);
	    reverse(arr, 0, k - 1);
	    reverse(arr, k, n - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
	    while (start < end) {
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	}


	public static void main(String args[]) {
		
		int a[] = {1,2,3,4,5};
		
		LeftRightRotate2.leftRotate(a,1);   //2 3 4 5 1		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	
//	     Example array: [1, 2, 3, 4, 5]
//	 		Rotate by k = 2
//
//			1️⃣ Left Rotation by 2
//			Goal: Move first 2 elements [1, 2] to the end.
//
//			Step 1: Reverse first k elements (0 to 1)
//			Original:
//			[1, 2, 3, 4, 5]
//
//			Reverse [1, 2] → [2, 1]
//
//			Array now:
//			[2, 1, 3, 4, 5]
//
//			Step 2: Reverse remaining elements (2 to 4)
//			Reverse [3, 4, 5] → [5, 4, 3]
//
//			Array now:
//			[2, 1, 5, 4, 3]
//
//			Step 3: Reverse the whole array (0 to 4)
//			Reverse entire array:
//			[2, 1, 5, 4, 3] → [3, 4, 5, 1, 2]
//
//			Result:
//			[3, 4, 5, 1, 2] ← Left rotated by 2
//
//			2️⃣ Right Rotation by 2
//			Goal: Move last 2 elements [4, 5] to the front.
//
//			Step 1: Reverse the whole array (0 to 4)
//			Original:
//			[1, 2, 3, 4, 5]
//
//			Reverse entire array:
//			[5, 4, 3, 2, 1]
//
//			Step 2: Reverse first k elements (0 to 1)
//			Reverse [5, 4] → [4, 5]
//
//			Array now:
//			[4, 5, 3, 2, 1]
//
//			Step 3: Reverse remaining elements (2 to 4)
//			Reverse [3, 2, 1] → [1, 2, 3]
//
//			Array now:
//			[4, 5, 1, 2, 3]
//
//			Result:
//			[4, 5, 1, 2, 3] ← Right rotated by 2
//
//			Summary table
//			Rotation Type	Step 1	Step 2	Step 3	Final Result
//			Left Rotate	Reverse first k	Reverse rest	Reverse whole	[3, 4, 5, 1, 2]
//			Right Rotate	Reverse whole	Reverse first k	Reverse rest	[4, 5, 1, 2, 3]


}
