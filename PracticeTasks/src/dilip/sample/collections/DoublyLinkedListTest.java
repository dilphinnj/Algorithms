package dilip.sample.collections;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DoublyLinkedListTest {

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	static class DoublyLinkedList {
		public DoublyLinkedListNode head;
		public DoublyLinkedListNode tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
				node.prev = this.tail;
			}

			this.tail = node;
		}
	}

	public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
		while (node != null) {
			// bufferedWriter.write(String.valueOf(node.data));
			System.out.println("print >>>" + String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				// bufferedWriter.write(sep);
				System.out.println(sep);
			}
		}
	}

// class Result {

	/*
	 * Complete the 'sortedInsert' function below.
	 *
	 * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST. The
	 * function accepts following parameters: 1. INTEGER_DOUBLY_LINKED_LIST llist 2.
	 * INTEGER data
	 */

	/*
	 * For your reference:
	 *
	 * DoublyLinkedListNode { int data; DoublyLinkedListNode next;
	 * DoublyLinkedListNode prev; }
	 *
	 */

	public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llistHead, int data) {

		DoublyLinkedList dl = new DoublyLinkedList();
		DoublyLinkedListNode headNode;	
		DoublyLinkedListNode currNode;

		DoublyLinkedListNode insNode = new DoublyLinkedListNode(data);
		
		
		insNode.next = llistHead;
		llistHead.prev = insNode;
		dl.head = insNode;
	//	dl.insertNode(data);
		
		currNode = dl.head;
				
		
			while(currNode != null) {
			//	System.out.println("currNode.data =>" + currNode.data);	
				if(currNode.prev != null && currNode.prev.data > currNode.data) {
					while(currNode.prev != null && currNode.prev.data > currNode.data) {
						DoublyLinkedListNode tempNode = new DoublyLinkedListNode(currNode.data);
						currNode.data = currNode.prev.data ;
						currNode.prev.data = tempNode.data ;
						currNode = currNode.prev;
					}
					// headNode = currNode;					
				}	
			//	System.out.println("sorted currNode.data =>" + currNode.data);	
				currNode = currNode.next;
			
			}
			
		return dl.head;	
}
	
	public static DoublyLinkedListNode reverseList(DoublyLinkedListNode llistHead) {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.tail = llistHead;
		
	//    DoublyLinkedListNode tailNode = new DoublyLinkedListNode(dl.tail.data);
		DoublyLinkedListNode curr = llistHead;
		DoublyLinkedListNode tl = new DoublyLinkedListNode(curr.data);
		
		// System.out.println("testing revers tail =>"+curr.data);
		
		DoublyLinkedListNode next = null;
		DoublyLinkedListNode prev = null;
		
		DoublyLinkedListNode node = null;
		
		while(curr != null) {
			System.out.println("curr =>"+curr.data);
			
			node = curr;
			
			next  = curr.next;
			curr.next = prev;
			prev = curr;
			
			curr = next;
		}
		
		dl.head = prev;
		return dl.head;
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int t = 1;
		System.out.println("\n t ::" + t);

		int llistCount = 5;
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			DoublyLinkedList llist = new DoublyLinkedList();

			System.out.println("\n list ::" + llistCount);
//            int llistCount = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//            for (int i = 0; i < llistCount; i++) {
//                int llistItem = scanner.nextInt();
//                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//                llist.insertNode(llistItem); 
//            }

			llist.insertNode(8);
			llist.insertNode(2);
			llist.insertNode(1);
			llist.insertNode(4);
			llist.insertNode(3);
			llist.insertNode(7);

			System.out.println("\n data ::");
			int data = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);
			DoublyLinkedListNode llist2 = reverseList(llist1);

			 printDoublyLinkedList(llist1, " ");
			 printDoublyLinkedList(llist2, " ");
			// bufferedWriter.newLine();
		}

		// bufferedWriter.close();

		scanner.close();
	}
}
