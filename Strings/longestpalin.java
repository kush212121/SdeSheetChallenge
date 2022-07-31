/*
    Time Complexity = O(N ^ 3)
    Space Complexity = O(N)
    
    Where N is the length of the string.
*/

public class Solution {

	private static boolean isPalindrome(String sub) {
		int n = sub.length();

		int i = 0, j = n - 1;

		while (i < j) {
			if (sub.charAt(i) != sub.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

	public static String longestPalinSubstring(String str) {

		int n = str.length();

		// Start finding palindrome having maximum length.
		for (int len = n; len >= 1; len--) {
			for (int j = 0; j + len <= n; j++) {

				// Get the input starting from j and having length len.
				String input = str.substring(j, j + len);

				if (isPalindrome(input)) {
					return input;
				}
			}
		}

		return "";
	}
}
