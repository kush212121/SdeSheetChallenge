/*
    Time Complexity : O(N ^ N)
    Space Complexity : O(N)

     Where N is the number of dumbbells in RACK
*/

import java.util.ArrayList;

public class Solution {

	public static int totalWeight;

	public static int maxIncreasingDumbbellsSumUtil(ArrayList<Integer> rack, int n) {
		// Base case.
		if (n == 0) {
			return 0;
		}

		int currWeight = rack.get(n - 1);

		for (int i = 1 ; i < n ; i++) {
			int temp = maxIncreasingDumbbellsSumUtil(rack, i);

			// Choose element which is smaller than last element.
			if (rack.get(i - 1) < rack.get(n - 1) && temp + rack.get(n - 1) > currWeight) {
				currWeight = temp + rack.get(n - 1);
			}
		}

		// Store the maximum weigth in 'totalWeight'.
		if (currWeight > totalWeight) {
			totalWeight = currWeight;
		}

		return currWeight;
	}

	public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
		if (n == 1) {
			return rack.get(n - 1);
		}

		totalWeight = Integer.MIN_VALUE;

		maxIncreasingDumbbellsSumUtil(rack, n);

		return totalWeight;
	}
}