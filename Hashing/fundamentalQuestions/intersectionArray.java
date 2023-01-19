package fundamentalQuestions;
import java.util.*;

public class intersectionArray {
	
	public static void intersection(int arr1[], int arr2[]) {
		HashSet<Integer> union = new HashSet<>();
		HashSet<Integer> interSection = new HashSet<>();
		
		for(int i=0; i<arr1.length; i++) {
			union.add(arr1[i]);
		}
		for(int i=0; i<arr2.length; i++){
			if(union.contains(arr2[i])) {
				interSection.add(arr2[i]);
			}
		}
		System.out.println("Number of Common Values :: "+interSection.size()+"\n======================\n"+interSection);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Length of Array 1
		System.out.println("Enter the length of Array1 :: ");
		int l1 = sc.nextInt();
		System.out.println("Enter the Values for Array1 ::");
		int arr1[] = new int[l1];
		for(int i=0; i<l1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		// Length of Array 2
		System.out.println("Enter the length of Array2 :: ");
		int l2 = sc.nextInt();
		System.out.println("Enter the Values for Array2 ::");
		int arr2[] = new int[l2];
		for(int i=0; i<l2; i++) {
			arr2[i] = sc.nextInt();
		}
		// Close the Resources
		if(sc != null)
			sc.close();
		
		intersection(arr1,arr2);
	}

}
