import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesMay3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5};
        Set<Integer> arrset= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            arrset.add(arr[i]);
        }
        System.out.println(arrset);
    }

    //This code is an alternative to the above logic.
//    int arr[]={1, 2, 3, 6, 3, 6, 1};
//
//    int count=0;
//        for(int i=0;i<arr.length-1;i++){
//        count=1;
//        for(int j=i+1;j<arr.length;j++){
//            if(arr[i]==arr[j]){
//
//                count++;
//                //System.out.println(arr[i]);
//                arr[j]=0;
//            }
//        }
//        if(arr[i]!=0 && count>1){
//            System.out.println(arr[i]);
//        }
//    }
}
