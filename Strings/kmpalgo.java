/*
    Time complexity: O((N - M) * M)
    Space complexity: O(1)

    Where N is the length of string s and M is length of string p.
*/

public class Solution {
    public static boolean findPattern(String p, String s) {
        int m = p.length();
        int n = s.length();

        for (int i = 0; i <= n - m; i++) {

            int j;
            for (j = 0; j < m; j++) {
                if (p.charAt(j) == s.charAt(i + j)) {
                    continue;
                }
                // If there is a mismatch, we do not check furthur.
                else {
                    break;
                }
            }

            // If j is equal to m then it means p is present in s.
            if (j == m) {
                return true;
            }
        }

        return false;
    }
}