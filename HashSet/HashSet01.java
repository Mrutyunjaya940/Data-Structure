package IBM;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.add(50);
        set.add(60);
        set.add(70);

        set.contains(set);
        System.out.println("Hashset"+set);

        if(set.contains(20))
        {
            System.out.println("20 is present");
        }
        set.remove(30);
        System.out.println("After removing 30 "+set);

    }
}
