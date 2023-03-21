package slidingWindow.fixSizeWindow;

import java.util.Scanner;

public class first_neg_Integer_everyWindow_K {

	public static int[] negInteger(int arr[], int k) {
		int n=arr.length;
		int res[] = new int[n-k+1];
		for(int i=0; i<k; i++) {
			if(arr[i]<0)
				res[0]= arr[i];
		}
		return res;
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
		negInteger(arr, k);
	}

}
