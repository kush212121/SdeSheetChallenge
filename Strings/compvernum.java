/*
    Time Complexity: O(N + M)
    Space complexity: O(1)
  
    where N and M are lengths of string A and B respectively
*/

public class Solution 
{
    public static int compareVersions(String a, String b) 
    {

        // Removing zeros from end of both strings
        a = removeZerosFromEnd(a);
        b = removeZerosFromEnd(b);

        // Initialising the four pointers
        int start1 = 0, start2 = 0, end1 = 0, end2 = 0;

        // Traversing both strings
        while (true) 
        {

            // Finding first dot to the right of start1 in string a
            while (end1 < a.length() && a.charAt(end1) != '.')
            {
                end1++;

            }

            // Finding first dot to the right of start2 in string b
            while (end2 < b.length() && b.charAt(end2) != '.') 
            {
                end2++;
            }

            // Finding the greater one among end1 and end2
            if (end1 > end2) 
            {
                return 1;
            } 
            else if (end1 < end2) 
            {
                return -1;
            }

            // Comparing both the strings character by character
            for (int i = start1; i < end1; i++) 
            {
                if (a.charAt(i) > b.charAt(i)) 
                {
                    return 1;
                } 
                else if (b.charAt(i) > a.charAt(i))
                {
                    return -1;
                }

            }

            // Check if we reached end of both strings
            if (end1 == a.length() && end2 == b.length()) 
            {
                return 0;
            }

            // Check if we reached end of string a
            if (end1 == a.length()) 
            {
                return -1;
            }

            // Check if we reached end of string b
            if (end2 == b.length()) 
            {
                return 1;
            }
            
            // Updating values of all the four pointers
            start1 = end1;
            start2 = end2;
            end1++;
            end2++;

        }
    }

    // Function to remove zeros from end
    private static String removeZerosFromEnd(String a) 
    {

        // First initialising answer as complete string then removing zeros from end
        int p = a.length() - 1;

        // Traversing the string backwards
        for (int i = a.length() - 1; i >= 1; i -= 2) 
        {

            // Checking if the current character is 0 and there is dot to the left of it
            // If yes, then decreasing length of desired string
            if (a.charAt(i) == '0' && a.charAt(i - 1) == '.') 
            {
                p -= 2;
            }

            // Otherwise ending the loop
            else 
            {
                break;
            }

        }

        // Returning the final string
        return a.substring(0, p + 1);
    }
}