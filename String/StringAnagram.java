package IBM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        String[] words={"eat","tea","tan","nat","abc"};
        Map<String, ArrayList<String>>  map=new HashMap<>();

        for(String word:words)
        {
            char[] chars=word.toCharArray();
            Arrays.sort(chars);

            String key=new String(chars);
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        System.out.println(map.values());
    }
}
