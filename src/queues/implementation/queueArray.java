package queues.implementation;

public class queueArray {

	static class Queues{
		static int arr[];
		static int size;
		
		// Introducing to Array with size.
		Queues(int size){
			arr = new int[size];
			Queues.size = size;
		}
		
		static int front = 0;
		static int rear = -1;
		
		// Is the array empty ? ---> O(1)
		public static boolean isEmpty() {
			return rear==-1;
		}
		
		// Is the array full ? ---> O(1)
		public static boolean isFull() {
			return rear == size-1;
		}
		
		// Enqueue : add element to the queue. ---> O(1)
		public static void add(int n) {
			if(isFull()) {
				System.out.println("Queue is full");
				return ;
			}
			else {
				// adding number to queue
				arr[++rear] = n;
				System.out.println(n +" is added into queue");
				return ;
			}
		}
		
		// Dequeue : remove element from the queue. ---> O(n)
		public static void remove() {
			if(isEmpty()) {
				System.out.println("Can't remove, because queues is empty.");
				return ;
			} 
			else {
				System.out.println(arr[front] + " is removed from queue.");
				// Shift all the element to the front.
				for(int i=0; i<rear; i++) {
					arr[i] = arr[i+1];
				}
				rear = rear-1;
				return ; 
			}
		}
		
		// Peek element from the queue  ---> O(1)
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[front];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues q = new Queues(3);
		Queues.add(1);
		Queues.add(2);
		Queues.add(3);
		q.remove();
		q.remove();
		q.remove();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(3);
		System.out.println(q.peek());
	}

}
