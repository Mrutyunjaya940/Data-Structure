package String;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String word="Java@123";
        int VowelCount=0;
        int ConsCount=0;
        countVowelsAndConsonants(word);

        for (int i=0;i<word.length();i++)
        {
            char[] ch=word.toCharArray();
            if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i'||
                    ch[i]=='o'||ch[i]=='u' ||ch[i]=='A'||
                    ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
            {
                VowelCount++;
            }
            else if (ch[i]>='a' && ch[i] <='z' || ch[i]>='A' && ch[i] <='Z')
            {
                ConsCount++;
            }
        }
        System.out.println(VowelCount);
        System.out.println(ConsCount);
    }
    
    
//      2nd Optimized Method
    public static void countVowelsAndConsonants(String s)
    {
        int Vowelcount=0;
        int Conscount=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u')
            {
                Vowelcount++;
            } else if (ch>='a' && ch<='z') {
                Conscount++;
            }
        }
        System.out.println("Vowel "+Vowelcount+"\nConsonant "+Conscount);
    }
}
