package binarySearch_tree;
	import java.util.Scanner;

	//How to build the Binary Search Tree (Left < Root < Right)

	public class buildTree {
		public class Node{
			int data;
			Node left;
			Node right;
			Node(int data){
				this.data = data;
			}
		}
		public static Node bst(Node root, int val) {
			if(root == null) {
				root = new Node(val);
				return root;
			}
			// Left Subtree if smaller
			if(root.data > val) {
				root.left = bst(root, val);
			}
			else if(root.data < val) {
				root.right = bst(root, val);
			}
			return root;
		}
		
		public static void inOrder(Node root) {
			if(root == null)
				return;
			
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Length of Array");
			int len = sc.nextInt();
			int values[] = new int[len];
			for(int i=0; i<len; i++) {
				values[i] = sc.nextInt();
			}
			Node root = null;
			for(int i=0; i<len; i++) {
				bst(root, values[i]);
			}
			inOrder(root);
			
		}
	}
