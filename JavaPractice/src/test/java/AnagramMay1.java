import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AnagramMay1 {
    public static void main(String[] args){
        String name="sritam";
        String name1="rstami";
        char[] arr=name.toCharArray();
        char[] arr1=name1.toCharArray();

        String arr3[]=name.split("");
        System.out.println(Arrays.toString(arr3));

//        Arrays.sort(arr);
//        Arrays.sort(arr1);
//
//        if(Arrays.equals(arr,arr1)){
//            System.out.println("Is anagram");
//        }else {
//            System.out.println("! an anagram");
//        }
        String temp="";
        for(int i=0;i<arr3.length;i++){

            for(int j=i+1;j<arr3.length;j++){
                if(arr3[i].compareTo(arr3[j])>0){
                   temp=arr3[j];
                   arr3[j]=arr3[i];
                   arr3[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
