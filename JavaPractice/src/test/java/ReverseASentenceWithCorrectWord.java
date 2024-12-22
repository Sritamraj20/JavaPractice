public class ReverseASentenceWithCorrectWord {
    public static void main(String[] args){
        String name="I am automation tester";
        String[] spitedName=name.split(" ");
        String reverseName="";
        for(int i=0;i< spitedName.length;i++){
            reverseName=spitedName[i]+" "+reverseName;

        }
        System.out.println(reverseName);
    }
}
