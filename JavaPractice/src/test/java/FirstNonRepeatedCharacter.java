import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Input a String:");
        String word = s.next();

        for(char a:word.toCharArray()){
            if(word.indexOf(a)==word.lastIndexOf(a)){
                System.out.println(a);
            }
        }

    }
}
