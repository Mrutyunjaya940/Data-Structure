package String;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String word = "$Gee*k;s..fo, r'Ge^eks?";
        String newWord = "";

        for (int i=0; i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch >='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                newWord=newWord+ch;
            }
            else
            {
                System.out.print("");
            }
        }
        System.out.println(newWord);

    }
}
//Output ="GeeksforGeeks"
