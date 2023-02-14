// Maximum Sum SubArray of Size 
package fixSizeWindow;

import java.util.*;

public class maxSum {

	public static void maxSum1(int arr[], int k) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of Array");
		int len = sc.nextInt();
		// Input for the Array
		System.out.println("Enter the Value of Array");
		int arr[] = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the window size");
		int k = sc.nextInt();
		sc.close();
		maxSum1(arr, k);
	}

}
