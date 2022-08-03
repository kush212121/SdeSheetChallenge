
/*
Time complexity: O(n*2^n)
Space complexity: O(n^2)

Where 'n' is the length of the string
*/
public class Solution {
	// Function to check if string str[i..j] is a palindrome or not
	private static boolean isPalindrome(String str, int i, int j) {
	    while (i <= j) {
	        if (str.charAt(i++) != str.charAt(j--)) {
	            return false;
	        }
	    }
	    return true;
	}

	/* Recursive function to find the minimum cuts needed in a string
	   such that each partition is a palindrome */
	private static int minPalinPartition(String str, int i, int j) {
	    /* Base case: if starting index i and ending index j are equal
	       or str[i..j] is already a palindrome. */

	    if (i == j || isPalindrome(str, i, j)) {
	        return 0;
	    }

	    // Stores minimum number cuts needed to partition str[i..j] intitally its infinite

	    int min = Integer.MAX_VALUE;

	    // Take the minimum over each possible position at which the String can be cut

	    for (int k = i; k <= j - 1; k++) {
	        // Recur to get minimum cuts required in str[i..k] and str[k+1..j]
	        int count = 1 + minPalinPartition(str, i, k) + minPalinPartition(str, k + 1, j);
	        // Update the min
	        if (count < min) {
	            min = count;
	        }
	    }

	    // Return the minimum cuts required
	    return min;
	}

	public static int palindromePartitioning(String str) {
	    int n = str.length();
	    return minPalinPartition(str, 0, n - 1);
	}

}
