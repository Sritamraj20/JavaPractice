public class ReverseASentenceWithWordsReverse {
    public static void main(String[] args){
        String name="I am automation tester";
        String[] splitedName=name.split(" ");
        String reverseName="";
        for (int i = 0; i < splitedName.length; i++) {
            String word=splitedName[i];
            String reverseWord="";
            for (int j = 0; j < word.length(); j++) {
                reverseWord=word.charAt(j)+reverseWord;
            }
            reverseName=reverseName+" "+reverseWord;
        }
        System.out.println(reverseName);
    }
}
