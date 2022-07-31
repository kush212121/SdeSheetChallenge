/*
    Time Complexity: O(2 ^ N)
    Space Complexity: O(M),

    where N is the number of iterations and M is the length of the final string.
*/

import java.util.ArrayList;

public class Solution 
{

    public static String writeAsYouSpeak(int n) 
    {

        // We initialize our starting string s with "1".
        String s = "1";
        
        // We initialize the iterations with n-1.
        int iterations = n - 1;
        while (iterations-- > 0) 
        {
            // We will initialize temp with an empty string and we initialize count.
            String temp = "";
            ArrayList<Integer> count = new ArrayList<Integer>();
            
            // currentIndex will store the current position in string s, currentChar will store the current character that we will match with consecutive characters.
            // And currentCount will store the count of that character.
            int currentIndex = 0;
            
            // Now we will iterate through s and we will try to make temp and count.
            while (currentIndex < s.length()) 
            {
                char currentChar = s.charAt(currentIndex);
                int currentCount = 0;
                while ((currentIndex < s.length()) && (s.charAt(currentIndex) == currentChar)) 
                {
                    currentCount++;
                    currentIndex++;
                }

                temp += currentChar;
                count.add(currentCount);
            }

            // Now we will make string s for the next iteration.
            // We will add count[i] and temp[i] to s for each position of count.
            s = "";
            for (int i = 0; i < count.size(); i++) 
            {
                s += (char)('0' + count.get(i));
                s += temp.charAt(i);
            }
        }
        return s;
    }

}