public class ReverseWordsInString {
    public static void main(String[] args){
        String name="I am automation tester";
        String[] splitedString=name.split(" ");
        String reverseName="";
        for (int i = 0; i < splitedString.length; i++) {
            String word=splitedString[i];
            String reverseWord="";
            for (int j = 0; j < word.length(); j++) {
                reverseWord=word.charAt(j)+reverseWord;
            }
            reverseName=reverseWord+" "+reverseName;
        }
        System.out.println(reverseName);
    }
}
