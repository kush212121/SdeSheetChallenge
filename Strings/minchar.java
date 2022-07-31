/*
    Time complexity: O(N ^ 2)
    Space complexity: O(1)
    
    Where N is length of the string.    
*/

public class Solution {

    public static int minCharsforPalindrome(String str) {

        int count = 0;

        while (str.length() > 0) {

            // If current string is palindrome break the loop
            if (isPalindrome(str)) {
                break;
            }
            // Otherwise remove the last char and go to next iteration
            else {
                count++;
                str = str.substring(0, str.length() - 1);
            }
        }

        return count;
    }

    // Function for checking a string is palindrome or not
    public static boolean isPalindrome(String str) {

        int l = str.length();
        int i = 0;
        int j = l - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }

        return true;

    }

}