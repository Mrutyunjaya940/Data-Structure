package IBM;

public class StringCharNumCount {
    static void main(String[] args) {
        String str="ab12c5876BZ";
        int carcount=0;
        int numcount=0;

        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);

            if(ch >='A' && ch <='Z' || ch >='a' && ch<='z')
            {
                carcount++;
            }
            else
            {
                numcount++;
            }
        }
        System.out.println("character present in String is: "+carcount);
        System.out.println("Number Present in String is: "+numcount);
    }
}
