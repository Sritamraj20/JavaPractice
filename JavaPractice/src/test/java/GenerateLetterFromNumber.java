import java.util.Stack;

public class GenerateLetterFromNumber {
    public static void main(String[] args){
        String letter="a2b3c4";
        String name="";
        for(int i=0;i<letter.length();i++){
            //char iter=letter.charAt(i);
            if(Character.isAlphabetic(letter.charAt(i))){
                System.out.print(letter.charAt(i));
            } else {
                int num=Character.getNumericValue(letter.charAt(i));
                for(int j=1;j<num;j++){
                    System.out.print(letter.charAt(i-1));
                }
            }
        }

    }
}
