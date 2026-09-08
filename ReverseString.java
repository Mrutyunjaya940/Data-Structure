public class ReversString {
    public static void main(String[] args) {
        String name="Mrutyunjaya";
        char[] chars=name.toCharArray();
        int first=0;
        int last=chars.length-1;
        while(first<last)
        {
            char temp=chars[first];
            chars[first]=chars[last];
            chars[last]=temp;
            first++;
            last--;
        }
        String reverse =new String(chars);
        System.out.println(reverse);
    }
}
