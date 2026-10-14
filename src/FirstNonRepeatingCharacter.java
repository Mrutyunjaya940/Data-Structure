
package Pratice;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String s = "loveleetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first non-repeating character
        int result = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                result = i;
                break;
            }
        }

        // Step 3: Print the result
        System.out.println(result);
    }
}
