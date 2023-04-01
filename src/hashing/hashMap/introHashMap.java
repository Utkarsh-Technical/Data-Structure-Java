package hashing.hashMap;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class introHashMap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Length of Key-Value Pairs
		System.out.println("Enter the length");
		int len = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		
		// Insertion of Key-Pairs of Value
		System.out.println("Enter a Key-Value Pairs");
		for(int i=0; i<len; i++) {
			String abc = sc.next();
			int pop = sc.nextInt();
			map.put(abc, pop);
		}
		
		// Search of key
		System.out.println("Enter a Search Key :: ");
		String searchKey = sc.next();
		if(map.containsKey(searchKey)) {
			System.out.println(searchKey + " is found");
		}else {
			System.out.println(searchKey + " not found");
		}
		
		// Key Exists :: It also use to update the Value.
		System.out.println("Enter the Key ::");
		String key = sc.next();
		System.out.println("Value of "+key+" is "+map.get(key));
		
		// Iterator
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println("Key : " + e.getKey() +"\tValue : "+ e.getValue());
		}
		
		// Delete the Key
		System.out.println("Enter a Key to be Deleted :: ");
		String del = sc.next();
		if(map.containsKey(del)) {
			map.remove(key);
			System.out.println(del + " is deleted");
		}else {
			System.out.println(del + "not found");
		}
		
	}

}
