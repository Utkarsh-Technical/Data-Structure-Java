package queues.implementation;

public class queue_CircularArray {

	static class Queues{ 
		static int arr[];
		static int size;
		static int front = -1;
		static int rear = -1;
		
		Queues(int size){
			arr = new int[size];
			this.size =size; 
		}
		
		// Queue is empty ---> O(1)
		public static boolean isEmpty() {
			return (front==-1 && rear==-1);
		}
		
		// Queue is Full ---> O(1)
		public static boolean isFull() {
			return ((rear+1)%size)==front;
		}
		
		// Enqueue : Add element into queue. ---> O(1)
		public static void add(int n) {
			if(isFull()) {
				System.out.println("Queue is Full.");
				return;
			}
			// For first element
			if(front== -1)
				front++;
			
			rear = (rear+1)%size;
			arr[rear] = n;
			System.out.println(n + " added into queue.");
			return;
			
		}
		
		// Dequeue : Remove element into queue. ---> O(1)
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty.");
				return -1;
			}
			int idx = arr[front];
			//single element
			if(front == rear) {
				front = -1;
				rear =  -1;
			}
			else 
				front = (front+1)%size;
			return idx;
		}
		
		// Peek element from the queue  ---> O(1)
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty.");
				return -1;
			}
			return arr[front];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues q = new Queues(4);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		q.add(5);
		q.add(6);
		q.add(7);
		
		System.out.println(q.peek());
		q.remove();
		
		System.out.println(q.peek());
		q.remove();
		
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		
	}

}
