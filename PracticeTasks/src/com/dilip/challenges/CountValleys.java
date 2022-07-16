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

class ValleyResult {

	/*
	 * Complete the 'countingValleys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER steps 2. STRING path
	 */

	public static int countingValleys(int steps, String path) {
		int prevLevel = 0;
		int seaLevel = 0;

		System.out.println("prevL1 :: "+prevLevel);
		System.out.println("seaL1 :: "+seaLevel);
		
		List<Integer> valleys = new ArrayList<>();
		char[] step = path.toCharArray();

		for (char dir : step) {
			prevLevel = seaLevel;			
			if (dir == 'U') {
				seaLevel = seaLevel + 1;
			} else if (dir == 'D') {
				seaLevel = seaLevel - 1;
			}
			
			if (prevLevel < 0 && seaLevel == 0) {
				valleys.add(1);
			}
			
			System.out.println("\n prevL2 :: "+prevLevel);
	        System.out.println("seaL2 :: "+seaLevel);
		}
        
        // seaLevel = currLevel;
        
        System.out.println("\n prevL3 :: "+prevLevel);
        System.out.println("seaL3 :: "+seaLevel);
        
		int noOfValleys = valleys.size();
		return noOfValleys;
	}
	
}

public class CountValleys {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of steps :: ");
		int steps = Integer.parseInt(bufferedReader.readLine().trim());
		System.out.println("number of steps is :: " + steps);

		/* path should be entered in a sequence in 'U' and 'D' */
		System.out.println("Enter path :: ");
		String path = bufferedReader.readLine();
		System.out.println("path is :: " + path);

		int result = ValleyResult.countingValleys(steps, path);
		System.out.println(result);

	}
}
