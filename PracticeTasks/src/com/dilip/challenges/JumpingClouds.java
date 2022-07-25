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

class CloudJumpResult {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
    	int oneJumps = 0; 
        int twoJumps = 0; 
        int j = 2;
         
        for(int i =1; i < c.size(); i++){
            System.out.println("\n c ->"+c.get(i));
            if(c.get(i) == 0){
                oneJumps = oneJumps + 1;
                System.out.println("1 jump");
            }
            
            if(j < c.size() && c.get(j) != null){
                if(c.get(j) == 0) {
                	twoJumps = twoJumps + 1;
                	System.out.println("j = 0 ->"+j);
                	j = j + 2;
                	System.out.println("2 jump ="+twoJumps);
                	System.out.println("next j = 0 ->"+j);
                }
                else {
                //	twoJumps = twoJumps + 1;
                	System.out.println("2 jump"+twoJumps);
                	System.out.println("j = 0 ->"+j);
                	if (j != 0)
                		j = j - 1;
                	else
                		j = j+1;
                	System.out.println("next j = 1 ->"+j);
                }                
            }
            else if(j == c.size() && c.get(j-1) != null){
            	System.out.println("2 jump extra"+twoJumps);
            	System.out.println("j = 0 ->"+(j-1));
            	twoJumps = twoJumps + 1;
            	j = j+1;
            }
        }
        System.out.println("1 jumps =>"+oneJumps);
        System.out.println("2 jumps =>"+twoJumps);
        
        if (oneJumps > twoJumps)
        	return twoJumps;
        else
        	return oneJumps;
    }

}

public class JumpingClouds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    //    int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(" enter array of clouds (in 0's and 1's with spaces)::");
//        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
        
        List<Integer> c = new ArrayList<Integer>();
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(0);
        c.add(0);

        for (Integer i : c) {
			System.out.print(" "+i);
		}
        
        int result = CloudJumpResult.jumpingOnClouds(c);

    //    bufferedWriter.write(String.valueOf(result));
        System.out.println(result +" <- result ");
   //     bufferedWriter.newLine();

        bufferedReader.close();
    //    bufferedWriter.close();
    }
}

