package queues.implementation;

import queues.implementation.queue_CircularArray.Queues;

public class queue_LinkedList {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static class Queues {
		static Node head = null;
		static Node tail = null;
		
		public static boolean isEmpty() {
			return (head == null && tail==null);
		}
		
		public static void add(int data) {
			Node curr = new Node(data);
			if(tail == null) {
				tail = head = curr;
				return ;
			}
			tail.next = curr;
			tail = curr;
			return;
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			int front =  head.data;
			if(head == tail) {
				tail = head = null;
				return front;
			}
			head = head.next;
			return front;
			
		}
		
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Empty Queue");
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queues q = new Queues();
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
		System.out.println(q.peek());
		q.remove();
	}

}
