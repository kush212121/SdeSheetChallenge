/*
	Time Complexity: O(N * log(N))
	Space Complexity: O(1)

	where 'N' is the size of the array.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		Collections.sort(arr, Collections.reverseOrder());
		return arr.get(K - 1);
	}

}
