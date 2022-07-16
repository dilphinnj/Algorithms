package com.dilip.challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
       Map<Integer,Integer> sockMap = new HashMap<Integer,Integer>();
       Integer val = 0;
       int noOfPairs = 0;
       
       for (Integer sockNo : ar) {
    	   val = sockMap.get(sockNo);
    	   if(val == null) {
    		   val = 0;
    		   System.out.println("sock No ::"+val);
    	   }
    	   sockMap.put(sockNo, val+1);  
       }
       
       
	   for (Map.Entry<Integer,Integer> entry : sockMap.entrySet()) {
           System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
           int div = entry.getValue()/2;
           noOfPairs = noOfPairs + div;
	   }
	   
	   System.out.println(" no of pairs  ::"+noOfPairs);
       
	return noOfPairs;

    }

}

public class CountSockPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("number of socks :: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("enter sock no :: ");
        /* ar => Enter id of the sock with a space (ex: 1 2 1 3 .... ) */ 
        
        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);
        System.out.println(result);

    }
}

