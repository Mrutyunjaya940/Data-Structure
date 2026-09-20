import java.util.Locale;

public class ValidPalindrome {
    public static boolean ispalindrom(String s)
    {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i=0;
        int j=s.length()-1;
        while (i <= j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        String check="A man, a plan, a canal: Panama";
        System.out.println(ispalindrom(check));
    }
}
