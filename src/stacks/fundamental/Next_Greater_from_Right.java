package stacks.fundamental;
import java.util.*;
/* input ::  1 3 2 4 
   output :: 3 4 4 -1
   
   Logic
   1.) if Stack is Empty : return -1;
   2.) if curr < st.peek() : st.peek() & Push(curr)
   3.) if curr > st.peek() : pop();
*/
public class Next_Greater_from_Right {

	public static int[] nextGreaterRight(int arr[]) {
		int len = arr.length;
		int ngr[] = new int[len];
		Stack<Integer> st = new Stack<>();
		for(int i=len-1; i>=0; i--) {
			int x = arr[i];
			if(st.empty()) {
				ngr[i] = -1;
				st.push(x);
			}
			else if(arr[i] < st.peek()) {
				ngr[i] = st.peek();
				st.push(x);
				
			}
			else {
				while(!st.empty() && arr[i] >= st.peek()) {
						st.pop();
					}
					if(st.empty())
						ngr[i] = -1;
					else
						ngr[i] = st.peek();
					
					st.push(arr[i]);
				}
		}
		return ngr;
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
		System.out.println("Enter the length of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values of Array");
		// input the array
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		if(sc!=null) {
			sc.close();
		}
		arr = nextGreaterRight(arr);
		printArr(arr);
	}

}
