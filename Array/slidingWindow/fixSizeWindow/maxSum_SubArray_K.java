package slidingWindow.fixSizeWindow;
import java.util.*;
public class maxSum_SubArray_K {

	public static void maxSum1(int arr[], int k) {
		int n = arr.length;
		if(n<k || k ==0) {
			System.out.println("Invalid");
			return;
		}
		int sum=0;
		for(int i=0 ; i<k; i++) {
			sum = sum + arr[i];
		}
		int maxSum = sum;
		int startIndex=0, endIndex=k;
		
		for(int j=k; j<n; j++) {
			sum = sum + arr[j] - arr[j-k];
			
			if(maxSum<sum) {
				maxSum = sum;
				startIndex = j-k+1;
				endIndex = j;
			}
		}
		
		
		System.out.println(maxSum+"\nStart Index:"+startIndex+"\nEnd Index:"+endIndex);
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