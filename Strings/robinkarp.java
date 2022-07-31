/*
    Time Complexity: O(N*M)
    Space Complexity: O(N)

    Where 'N' is the length of the string 'str' and 'M' is the length of 'pat'
*/

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> stringMatch(String str, String pat) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		// Iterate through all possible starting indices
		for (int i = 0; i <= str.length() - pat.length(); i++) {

			boolean flag = true;

			for (int j = 0; j < pat.length(); j++) {
				// If a character mismatch occurs
				if (str.charAt(i + j) != pat.charAt(j)) {
					flag = false;
				}
			}

			if (flag) {
				result.add(i);
			}
		}

		return result;
	}
}