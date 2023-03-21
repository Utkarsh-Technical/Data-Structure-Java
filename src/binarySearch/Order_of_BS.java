package binarySearch;

// Find the element in sorted array also identify the sorting is in ASC | DESC

import java.util.Scanner;

public class Order_of_BS {

	// Checking for array is Ascending or Descending
	static boolean isAscending(int arr[]) {
		if(arr[0] < arr[arr.length-1])
			return true;
		return false;
	}
	
	//find the element
	static int findElement(boolean isAscending, int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = -1;
		while(isAscending && start <= end) {
			mid = start +(end-start)/2;
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] > target) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		//Decending
		 // 10 9 8 7 6 5 
		while(!isAscending && start <= end) {
			mid = start +(end-start)/2;
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] > target) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of Array");
		int len = sc.nextInt();
		System.out.println("Enter the Sorted Array Values:");
		int arr[] = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Target Element:");
		int target = sc.nextInt();
		
		boolean isAscending = isAscending(arr);
		if(findElement(isAscending,arr,target)>0)
			System.out.println("Element found at index: "+findElement(isAscending,arr,target)+1);
		else {
			System.out.println("Not Found");
		}
		sc.close();
	}

}
