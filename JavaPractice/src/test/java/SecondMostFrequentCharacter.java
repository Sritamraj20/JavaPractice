import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMostFrequentCharacter {
    public static void main(String args[]) {
        String str = "aabababa";

        HashMap<Character, Integer> hm = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                int count = hm.get(str.charAt(i));
                hm.put(str.charAt(i), ++count);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        System.out.println(hm);

        int max = 0;
        int secondMax = 0;

        Iterator<Integer> itr = hm.values().iterator();

        while (itr.hasNext()) {
            int max1 = itr.next();
            if (max1 > max) {
                max = max1;

            } else if (max1 > secondMax && max1 < max) {
                secondMax = max1;
            }
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if (entry.getValue() == secondMax) {
                System.out.println("The key for value " + secondMax + " is " + entry.getKey());
                break;
            }
        }
    }
}
