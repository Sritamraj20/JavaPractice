import java.util.LinkedHashSet;
import java.util.*;

public class RemoveCharacterFromString {

    public static void main(String args[]){
        String str="sritamsz";

        int count=0;
        Set<Character> se=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            if(se.contains(str.charAt(i))){
                count++;
            }else {
                se.add(str.charAt(i));
            }
        }
        //System.out.println(se);
        for(char s:se){
            System.out.println(s);
        }
    }
}
