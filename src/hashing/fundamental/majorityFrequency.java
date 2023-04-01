package hashing.fundamental;
import java.util.*;


/* Majority of Frequency ==> Given an array of Size n, find all the elements appear more than n/3 times;
 *   I/P :: {1,3,2,5,1,3,1,5,1}
 *   O/P :: {1}
 * */
public class majorityFrequency {

	public static void Frequency(int arr[]) {
		// HashMap <Key:Value>
		HashMap<Integer, Integer> map = new HashMap<>();
		
		//Adding values to HashMap
		// Traversing on whole Array and storing the Value and frequency in HashMap.
		for(int i=0; i<arr.length; i++)	{
			if(map.containsKey(arr[i]))	{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		// Traverse whole HashMap and find the frequency greater than n/3 times.
		for(Integer key : map.keySet()) {
			if(map.get(key)>(arr.length/3)) {
				System.out.println(key +" :: "+map.get(key));
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array::");
		int n = sc.nextInt();
		//Array length.
		int arr[] = new int[n];
		// Array input for values.
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		if(sc != null)
			sc.close();
		
		Frequency(arr);
	}

}
