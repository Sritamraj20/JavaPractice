import java.util.HashMap;

public class SmallestSubstringContainingAllCharacter {
        public static String smallestSubstring(String S, String P) {
            if (S.length() < P.length()) return "";

            // Store frequency of characters in P
            HashMap<Character, Integer> pMap = new HashMap<>();
            for (char c : P.toCharArray()) {
                pMap.put(c, pMap.getOrDefault(c, 0) + 1);
            }

            int start = 0, minStart = 0, minLen = Integer.MAX_VALUE, count = 0;
            HashMap<Character, Integer> sMap = new HashMap<>();

            // Expand the window using the end pointer
            for (int end = 0; end < S.length(); end++) {
                char c = S.charAt(end);
                sMap.put(c, sMap.getOrDefault (c, 0) + 1);

                if (pMap.containsKey(c) && sMap.get(c) <= pMap.get(c)) {
                    count++;
                }

                // If all characters are matched
                while (count == P.length()) {
                    if (end - start + 1 < minLen) {
                        minLen = end - start + 1;
                        minStart = start;
                    }

                    char leftChar = S.charAt(start);
                    sMap.put(leftChar, sMap.get(leftChar) - 1);
                    if (pMap.containsKey(leftChar) && sMap.get(leftChar) < pMap.get(leftChar)) {
                        count--;
                    }
                    start++; // Shrink window
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : S.substring(minStart, minStart + minLen);
        }

        public static void main(String[] args) {
            String S = "timetopractice";
            String P = "toc";
            System.out.println(smallestSubstring(S, P)); // Output: "toprac"
        }
    }
