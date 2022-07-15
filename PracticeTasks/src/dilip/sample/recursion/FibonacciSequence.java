package dilip.sample.recursion;

import java.io.*;
import java.util.*;

public class FibonacciSequence {

	// find the value of Nth number in sequence
    public static void main(String[] args) throws Exception {
    	System.out.println("Enter the position of the sequence for the required value?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        
        int val = getFiboValue(n);            
        System.out.println(val);
    }
    
    public static int getFiboValue(int n){
        int value = 0;
        Integer[] memo = new Integer[50];
        
        if ( memo[n] != null){
            return memo[n];
        }
        else if (n == 0 ){
            memo[0] = 0;
            return 0;
        }
        else if (n == 1){
            memo[1] = 1;
            return 1;
        }
        else if (2 <= n ){           
            value = getFiboValue(n-1) + getFiboValue(n-2); 
            memo[n] = value;
        }
        return value;
    }
}