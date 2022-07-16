package com.dilip.challenges;

import java.util.List;
import java.util.Arrays;

// find the sum of 2 max nums in the list

public class MaxSum {
	static int maxVal = 0;
	static int nextMaxVal = 0;

	public static int findMaxSum(List<Integer> list) {
		int sum = maxVal + nextMaxVal;
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 9, 15, 7, 11);

		maxVal = list.get(0);
		int oldMaxVal = 0;

		for (int i = 1; i < list.size(); i++) {

			oldMaxVal = maxVal;

			if (maxVal < list.get(i)) {
				maxVal = list.get(i);
			}

			if (maxVal > list.get(i) && nextMaxVal < list.get(i)) {
				nextMaxVal = list.get(i);
			}

			if (maxVal > oldMaxVal && oldMaxVal > nextMaxVal) {
				nextMaxVal = oldMaxVal;
			}
		}

		// Should return 20, since 9 and 11 are the largest elements
		// and their sum is 20
		System.out.println(findMaxSum(list));
	}
}