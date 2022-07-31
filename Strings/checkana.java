/*
    Time complexity: O(N * log(N))
    Space complexity: O(1)

    Where 'N' is the length of the strings.
*/

import java.util.Arrays;

public class Solution {
	public static boolean areAnagram(String str1, String str2) {
		// Get lengths of both strings.
		int n1 = str1.length();
		int n2 = str2.length();

		// If length of both strings is not same then they cannot be anagram.
		if (n1 != n2) {
			return false;
		}

		// Convert input string to char array.
		char tempArray1[] = str1.toCharArray();
		char tempArray2[] = str2.toCharArray();

		// Sort tempArray.
		Arrays.sort(tempArray1);
		Arrays.sort(tempArray2);

		// Compare sorted strings.
		for (int i = 0; i < n1; i++) {
			if (tempArray1[i] != tempArray2[i]) {
				return false;
			}
		}
		return true;
	}
}