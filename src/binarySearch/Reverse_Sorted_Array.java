package binarySearch;
import java.util.*;

public class Reverse_Sorted_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of Array");
		int len = sc.nextInt();
		System.out.println("Enter the Reverse Sorted Array :");
		int arr[] = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Target Element:");
		int target = sc.nextInt();
		sc.close();
	}

}
