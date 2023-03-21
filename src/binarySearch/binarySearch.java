package binarySearch;
import java.util.*;

public class binarySearch {

	public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
	public static void main(String[] args) {
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
		sc.close();
		int found = -1;
		try {
			found = search(arr,target);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(found>=0) {
			System.out.println("Element Found at index : "+(found+1));
		} else {
			System.out.println("Element Not Found");
		}
	}

}
