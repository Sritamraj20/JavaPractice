public class ReverseLettersInWordButCorrectWay {
    public static void main(String[] args) {
        String name="I am automation tester";
        String[] splitedName=name.split(" ");
        String reveseName="";
        for (int i = 0; i < splitedName.length; i++) {
            String word=splitedName[i];
            String wordrev="";
            for (int j = 0; j < word.length(); j++) {
                char splitchar=word.charAt(j);
                wordrev=splitchar+wordrev;
            }
            reveseName=reveseName+" "+wordrev;
        }
        System.out.println(reveseName);
    }
}
