public class ReverseASentence {
    public static void main(String[] args) {
        String name="I am automation tester";
        String[] splitedName=name.split(" ");
        String reverse="";
        for(int i=0;i<splitedName.length;i++){
            String word=splitedName[i];
            String rev="";
            for(int j=0;j<word.length();j++){
                char letter=word.charAt(j);
                rev=letter+rev;
            }
            reverse=reverse+" "+rev;
        }
        System.out.println(reverse);
    }
}
