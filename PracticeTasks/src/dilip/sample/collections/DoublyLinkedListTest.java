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

		DoublyLinkedList llist = new DoublyLinkedList();

		DoublyLinkedListNode insNode = new DoublyLinkedListNode(data);
		DoublyLinkedListNode headNode = llistHead;
		DoublyLinkedListNode prevNode;
		DoublyLinkedListNode nextNode;
		DoublyLinkedListNode currNode;
		
		currNode = headNode;
		
		while (currNode != null) {			
			System.out.println("currNode.data =>" + currNode.data);
			llist.insertNode(currNode.data);
			currNode = currNode.next;		
		}
		
		try {
			printDoublyLinkedList(llist.head, " ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		while (currNode != null) {
//			System.out.println("\n start =>"+currNode.data);
//			
//		// assigning head to the minimum node	
//		   if(headNode.data > currNode.data) {
//			   nextNode = currNode.next;
//			   currNode.next = headNode;
//			   currNode.next.next = nextNode;
//			   currNode.next.prev = currNode;			   
//			   headNode = currNode;
//			   headNode.prev = null;
//		   }
//			
//		   else if(currNode.prev != null && currNode.data > currNode.next.data) {
//				DoublyLinkedListNode tempNode = currNode;
//				currNode = currNode.prev;
//				currNode.prev = tempNode;
//				currNode.next = tempNode.next;
//				currNode.prev.prev = null;
//				currNode.prev.next = currNode;
//			}		
//			
//			prevNode = currNode.prev;
//			nextNode = currNode.next;
//			
//			System.out.println("currNode.data =>" + currNode.data);
//			
//			currNode = currNode.next;
//		}
		
		

//		while (currNode != null) {
//			System.out.println("currNode.data 1 =>" + currNode.data);
//			
//			if (currNode.data > currNode.next.data) {					
//
//	//			System.out.println("<--------- currNode.data > currNode.next.data  ---------->");
//				nxtNode = currNode;
//				DoublyLinkedListNode nxtNxtNode = currNode.next.next;
//				currNode = currNode.next;
//				currNode.next = nxtNode;
//				currNode.next.prev = currNode;
//				currNode.next.next = nxtNxtNode;
//				
//			//	System.out.println("\n currNode.data 2 =>" + currNode.data);
//			//	System.out.println("currNode.next.data 2  =>" + currNode.next.data);
////				
////				System.out.println("NextcurrNode.data =>" + currNode.data);
////				System.out.println("currNode.next.data upd =>" + currNode.next.data);
////				
////				System.out.println("<--------- currNode.data > currNode.next.data  ---------->");
//				
////				tmpNode = currNode.next;				
////				currNode.next.prev = tmpNode;				
////				System.out.println("currNode.data upd =>" + currNode.data);
////				System.out.println("currNode.next.data upd =>" + currNode.next.data);
////				System.out.println("currNode.next.data.prev upd =>" + currNode.next.prev.data);
//				
////				currNode = currNode.next.next.next;
////				System.out.println("currNode -- upd =>" + currNode.data);
//			}
//			else {
//				currNode = currNode.next;
//			//	System.out.println("\n currNode.data 2 =>" + currNode.data);
//			// 	System.out.println("currNode.next.data 2  =>" + currNode.next.data);
//			}
//				
			
//		}
//    
		return llist.head;

	}

// }

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
			llist.insertNode(4);
			llist.insertNode(1);
		//	llist.insertNode(3);

			System.out.println("\n data ::");
			int data = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			DoublyLinkedListNode llist1 = sortedInsert(llist.head, data);

			// printDoublyLinkedList(llist1, " ");
			// bufferedWriter.newLine();
		}

		// bufferedWriter.close();

		scanner.close();
	}
}
