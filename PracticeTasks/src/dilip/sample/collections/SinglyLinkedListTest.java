package dilip.sample.collections;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SinglyLinkedListTest {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } 
            else {
//            	System.out.println(">>> tail.next");
//            	System.out.println(">>> tail :::"+tail.data);
                this.tail.next = node;
 //               System.out.println(">>> tail.next val ::"+this.tail.next.data);
            }

            this.tail = node;
//            System.out.println(">>> head :::"+head.data);
//            if(head.next != null)
//            	System.out.println(">>> head next :::"+head.next.data);
//            if(head.next != null && head.next.next != null)
//            	System.out.println(">>> head next next:::"+head.next.next.data);
//            System.out.println(">>> tail :::"+tail.data);
//            System.out.println(">>> tail.next :::"+tail.next);
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
           // bufferedWriter.write(String.valueOf(node.data));
            System.out.println("print >>>"+String.valueOf(node.data));           
            
            node = node.next;

            if (node != null) {
               // bufferedWriter.write(sep);
            	System.out.println(sep);
            }
        }
    }



    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llistHead, int data, int position) {
    	
    	SinglyLinkedList llist = new SinglyLinkedList();   	
    	
    	System.out.println("pos >>>>>"+position);
    	
    	SinglyLinkedListNode insNode = new SinglyLinkedListNode(data);
    	SinglyLinkedListNode newNode = llistHead;
    	llist.head = newNode;
    	System.out.println("head >>>>>"+llist.head.data); 
    	System.out.println("ins >>>>>"+insNode.data); 
    	
    	int i = 0; 		
    	
    	while(newNode != null) {
    		
    		System.out.println("new node >>>>"+newNode.data);
    		
    		if(i == position - 1) {
    			/*Need to traverse the linklist by switching the new node pointer to next node.
    			Singly linkedlist travers only forward.*/
    			
    			insNode.next = newNode.next;    			
    			newNode.next = insNode;   
    			System.out.println( " ins - newNode.next >>>"+newNode.next.data);
    		}
    		else
    		newNode = newNode.next;
    		i++;
		}
	
    	return llist.head;
    } 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        SinglyLinkedList llist = new SinglyLinkedList();        

        System.out.println("\n list ::");
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");  
//        int llistCount = 4;    
//        int val = 0;
        

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            llist.insertNode(llistItem);
            
//        	val = val+10;
//        	llist.insertNode(val);
        }

        System.out.println("\n data ::");
        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("\n position ::");
        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        
        System.out.println();

        printSinglyLinkedList(llist_head, " ");
        System.out.println();

        scanner.close();
    }

}

