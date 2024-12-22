import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutDuplicates {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();

        if(str.length()==0){
            System.out.println("please re-type the string again");
        }

        int maxans=Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) // outer loop for traversing the string
        {
            Set<Character> se = new HashSet<>();
            for (int j = i; j < str.length(); j++) // nested loop for getting different string starting with str[i]
            {
                if (se.contains(str.charAt(j))) // if element if found so mark it as ans and break from the loop
                {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
            System.out.println(se);
        }
        System.out.println("The longest Substring without duplicates character: "+maxans);






    }

}
