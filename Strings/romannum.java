/*
    Time Complexity     :   O(N)
    Space Complexity    :   O(N)

    Where 'N' is the length of the string.
*/

import java.util.HashMap;

public class Solution {
    public static int romanToIntHelper(String s, HashMap<String, Integer> conv) {

        // If single character, return the integer value of that character.
        if (s.length() <= 1) {
            return conv.get(s);
        }

        // Take first 2 characters.
        String first_two = s.substring(0, 2);

        // If the first 2 characters are in the map, add their value and check rest of the string.
        if (conv.containsKey(first_two)) {
            return conv.get(first_two) + romanToIntHelper(s.substring(2), conv);
        }

        // Otherwise take one character and check its value.
        else {
            return conv.get(s.substring(0, 1)) + romanToIntHelper(s.substring(1), conv);
        }
    }

    public static int romanToInt(String s) {
        HashMap<String, Integer> conv = new HashMap<>();
        conv.put("M", 1000);
        conv.put("D", 500);
        conv.put("C", 100);
        conv.put("L", 50);
        conv.put("X", 10);
        conv.put("V", 5);
        conv.put("I", 1);
        conv.put("IV", 4);
        conv.put("IX", 9);
        conv.put("XL", 40);
        conv.put("XC", 90);
        conv.put("CD", 400);
        conv.put("CM", 900);
        conv.put("", 0);
        
        return romanToIntHelper(s, conv);
    }
}