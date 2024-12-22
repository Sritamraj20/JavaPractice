public class SortWordsLexicographically {
    public static void main(String args[]) {
        String[] words = {"Ruby", "Rucy", "Rubz", "Rvc"};

        for (int i = 0; i < words.length - 1; ++i) {
            for (int j = i + 1; j < words.length; ++j) {

                if (words[j].compareTo(words[i]) > 0) {

                    // swap words[i] with words[j[
                    String temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");

        for (int i = 0; i < 4; i++) {
            System.out.println(words[i]);
        }
    }
}
