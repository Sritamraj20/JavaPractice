import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestPresentCharacterInString {
    public static void main(String args[]){
        String str="geeekk";
//        //Without using hashmap.
        int maxs=0;
        char maxChar=str.charAt(0);
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>maxs){
                maxs=count;
                maxChar=str.charAt(i);
            }
        }
        System.out.println(String.format("The character %s present for maximum time is %s ",maxChar,maxs));
    }
}
