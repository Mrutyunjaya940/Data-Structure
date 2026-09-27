package String;

import java.util.HashSet;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String word="programming";
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                System.out.print(ch);
            }

        }

    }
}
