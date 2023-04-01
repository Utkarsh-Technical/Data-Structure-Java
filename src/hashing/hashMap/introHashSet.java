package hashing.hashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class introHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		System.out.println("Length of Element to be inserted");
		int len = sc.nextInt();
		// add all the element to HashSet.
		System.out.println("======= Insert element =======");
		for(int i=0; i<len; i++) {
			int element = sc.nextInt();
			// insertion/add() -- O(1)
			set.add(element);
		}
		
		// HashSet : Does Not include the repeating value in HashSet. Only Unique value is enter.
		// Search/Contains() -- O(1)
		System.out.println("Enter the element to be Searched");
		int searchValue = sc.nextInt();
		if(set.contains(searchValue)){
			System.out.println(searchValue + " is present");
		}else {
			System.out.println("Cannot be Searched... Sorry");
		}
		
		// Delete/Remove() -- O(1)
		System.out.println("Enter the element to be deleted");
		int del = sc.nextInt();
		if(set.contains(del)){
			set.remove(del);
			System.out.println(del + " is deleted");
		}else {
			System.out.println("Cannot be Deleted because element not found... Sorry");
		}
		
		// Close the resource
		if(sc != null) {
			sc.close();
		}
		
		// size of HashSet : size() -- O(1)
		System.out.println(set.size());
		
		// print all the element of HashSet
		System.out.println(set);
		
		//Iterator :: HashSet have a iterator if you want to iterator over all the HashSet.
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}
}
