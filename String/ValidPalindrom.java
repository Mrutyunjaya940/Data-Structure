package IBM;

public class ValidPalindrom {
    public static void main(String[] args) {
        String word="A man, a plan, a canal: Panama";
        word=word.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i=0;
        int j=word.length()-1;
        while(i<=j)
        {
            if(word.charAt(i) == word.charAt(j))
            {
                System.out.println(" This word is A Palindrome Number");
                break;
            }
            else
                System.out.println("It's not");
        }
    }
}
