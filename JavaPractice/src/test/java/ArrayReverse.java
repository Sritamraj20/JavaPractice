import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        String name="I am an automation tester";
        String[] splitedString=name.split(" ");
        String reverse="";
        for(int i=0;i<splitedString.length;i++){
            String word=splitedString[i];
            reverse=word+" "+reverse;
        }
        System.out.println(reverse);
    }
}
