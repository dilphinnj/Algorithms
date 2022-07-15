package dilip.sample.strings;

import java.util.Iterator;

/* The java String is immutable i.e. it cannot be changed. 
 * Whenever we change any string, a new instance is created. 
 * For mutable string, you can use StringBuffer and StringBuilder classes.
*/

public class StringTest {
	
	static char[] ch = {'d','i','l','i','p'};
	static String name = new String(ch);
	static String surname = "amaras";
	
	public static void main(String[] args) {
		
		// printing char array
		for (char ch : ch) {
			System.out.println(ch);
		}	
			
		System.out.println(name);
		System.out.println(surname);
		System.out.println("--------------------------------->");
		
		String test1 = "test";
		String test2 = "test"; // refers to the same instance created by test1 in the string constant pool
		String test3 = new String("test"); // will create a new object in heap
		char[] testch = {'t','e','s','t'};
		String test4 = new String(testch);
		

		// checking if strings instances are equal
		System.out.print("t1 eq t2 ::");
		System.out.print(test1 == test2); 
		System.out.print(" -> since it refers to same instance in string pool \n"); 
		System.out.print("t1 eq t3 ::");
		System.out.print(test1 == test3); 
		System.out.print(" -> since it will create a new object in heap \n"); 
		System.out.print("t1 eq t4 ::");
		System.out.print(test1 == test4); 
		System.out.print(" -> since will create a new object in heap \n\n"); 
		
		// checking if strings values are equal
		System.out.println("t1 eq t2 ::"+test1.equals(test2) + " -> since values are same "); 
		System.out.println("t1 eq t3 ::"+test1.equals(test3) + " -> since values are same "); 
		System.out.println("t1 eq t4 ::"+test1.equals(test4) + " -> since values are same "); 

	}

}
