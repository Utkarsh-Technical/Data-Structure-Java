package hashing.fundamental;
import java.util.*;

/*
 * 
 * */

public class unionArray {

	public static void unquieValue(int arr1[], int l1, int arr2[], int l2) {
		//HashSet 
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<l1; i++) {
			set.add(arr1[i]);
		}
		for(int i=0; i<l2; i++) {
			set.add(arr2[i]);
		}
		System.out.println("Number of Unique Values : " + set.size());
		System.out.println("======================\n"+set);
		return ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Input for First Array
		System.out.println("Enter the Length of Array1 :: ");
		int l1 = sc.nextInt();
		int arr1[] = new int[l1];
		System.out.println("Enter the Values for Array1 :: ");
		for(int i = 0; i<l1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		// Input for Second Array
		System.out.println("Enter the Length of Array1 :: ");
		int l2 = sc.nextInt();
		int arr2[] = new int[l2];
		System.out.println("Enter the Values for Array1 :: ");
		for(int i = 0; i<l2; i++) {
			arr2[i] = sc.nextInt();
		}
		if(sc != null)
			sc.close();
		unquieValue(arr1,l1,arr2,l2);
	}

}
