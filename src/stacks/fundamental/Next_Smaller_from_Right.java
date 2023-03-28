package stacks.fundamental;

import java.util.Scanner;
import java.util.Stack;

public class Next_Smaller_from_Right {

	public static int[] nextSmallerLeft(int arr[]) {
		int len = arr.length;
		int ngl[] = new int[len];
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i=len-1; i>=0; i--) {
			int x = arr[i];
			if(st.empty()) {
				ngl[i] = -1;
				st.push(x);
			}
			else if(x > st.peek()) {
				ngl[i] = st.peek();
				st.push(x);
			}
			else {
				while(!st.empty() && x < st.peek()) {
					st.pop();
				}
				if(st.empty())
					ngl[i] = -1;
				
				else if(x > st.peek())
					ngl[i] = st.peek();
				
				st.push(x);
			}
		}
		return ngl;
	}
	
	
	// Print all the Array
	public static void printArr(int arr[]) {
		System.out.println("=========================");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of array");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		if(sc != null) {
			sc.close();
		}
		arr = nextSmallerLeft(arr);
		printArr(arr);
	}
}
