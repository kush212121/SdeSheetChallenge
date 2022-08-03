/*
    Time Complexity  : O(2 ^ N)
    Space Complexity : O(N)

    Where N is the length of target string.
*/

import java.util.HashSet;

public class Solution {

    // Declare a hash map.
    static HashSet < String > hashMap = new HashSet < > ();

    public static boolean wordBreakHelper(String s) {

        // Len denotes size of current string.
        int len = s.length();

        // Base case.
        if (len == 0) {
            return true;
        }

        // Run a loop from 1 to length of target string.
        for (int i = 1; i <= len; i++) {
            /*
              If substring from 0 to i exist in hash map 
              and remaining string recurs true then return true.
            */
            if (hashMap.contains(s.substring(0, i)) && wordBreakHelper(s.substring(i, len))) {
                return true;
            }
        }

        // If no solution exist then return false.
        return false;
    }

    public static boolean wordBreak(String[] arr, int n, String target) {
        // Clear hash map for current test case.
        hashMap.clear();

        // Insert all strings of a into hashmap.
        for (String s: arr) {
            hashMap.add(s);
        }

        // Call wordBreakHelper to return answer.
        return wordBreakHelper(target);
    }
}