package String;

public class CountFrequency {
    public static void main(String[] args) {
        String word="programming";
        char character='g';

        int  count=0;
        for (int i=0;i<word.length();i++)
        {
            char str=Character.toLowerCase(word.charAt(i));
            if(str ==character)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
