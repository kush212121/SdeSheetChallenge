/*
    Time Complexity : O(2 ^ N)
    Space Complexity : O(N)

    Where N is the size of the array
*/

public class Solution 
{
	private static int longestIncreasingSubsequenceHelper(int arr[], int prevPosition, int curPosition, int n) 
    {
        // Base case
	    if (curPosition == n) 
        {
	        return 0;
	    }

	    int taken = 0;

        // Taking the current element
	    if (prevPosition < 0 || arr[curPosition] > arr[prevPosition]) 
        {
	        taken = 1 + longestIncreasingSubsequenceHelper(arr, curPosition, curPosition + 1, n);
	    }

        // Not Taking the current element
	    int notTaken = longestIncreasingSubsequenceHelper(arr, prevPosition, curPosition + 1, n);

	    return Math.max(taken, notTaken);
	}

	public static int longestIncreasingSubsequence(int arr[]) 
    {

		int n = arr.length;

	    int ans = longestIncreasingSubsequenceHelper(arr, -1, 0, n);

	    return ans;
	}

}