package BasicStringsTUF;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sortcharsbyfreq {
    public static void main(String[] args) {
        
    }
    public static List<Character> frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a - b;
        });

        return list;
    }
}
