import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class VowelCountInString {
    public static void main(String[] args){
//        String name="sritam";
//        HashMap<Character,Integer> hmap=new HashMap<>();
////        hmap.put('a',0);
////        hmap.put('e',0);
////        hmap.put('i',0);
////        hmap.put('o',0);
////        hmap.put('u',0);
//
//        for(int i=name.length()-1;i>0;i--){
//            if(hmap.containsKey(name.charAt(i))){
//                int count= hmap.get(name.charAt(i));
//            }
//        }
        {
            String str = "google";
//HashMap char as a key and occurrence as a value
            HashMap<Character, Integer> charCount = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                if (charCount.containsKey(str.charAt(i))) {
                    int count = charCount.get(str.charAt(i));
                    charCount.put(str.charAt(i), ++count);
                } else {
                    charCount.put(str.charAt(i), 1);
                }
            }
            System.out.println(charCount);
        }

        }
}

