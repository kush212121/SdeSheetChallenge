package Heaps;

public class maxsumcombo {
    public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k) {
		// Array to store all the possible sum combinations.
		ArrayList<Integer>tempArray = new ArrayList<Integer>();

		// Loop to traverse the array 'A".
		for (int i = 0; i < n; i++) {
			// Loop to traverse the array 'B'.
			for (int j = 0; j < n; j++) {
				int currentSum = a.get(i) + b.get(j);
				// Add the sum of current combination.
				tempArray.add(currentSum);
			}
		}
		// Sort the array in descending order.
		Collections.sort(tempArray, Collections.reverseOrder());

		// Return the first 'K' values.
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.addAll(tempArray.subList(0, k));

		return result;
	}
}
