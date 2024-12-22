import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinMay1 {
    public static void main(String[] args){

//        int largestNum=0;
//        int smallestNum=arr[0];

//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>largestNum){
//                largestNum=arr[i];
//            }else if(arr[i]<smallestNum){
//                smallestNum=arr[i];
//            }
//        }
//        System.out.println(largestNum+" "+smallestNum);
        int[] arr={18,15,300,7000,19};
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
