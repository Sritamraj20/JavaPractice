import java.util.Random;
import java.util.Scanner;

public class FirstChallenge {
    public static void main(String[] args){
        int[] arr={1120,300,480,200,570};
        int largestNum=0;
        int secondLargest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestNum){
                secondLargest=largestNum;
                largestNum=arr[i];
            } else if (arr[i]<largestNum && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }
        }
        System.out.println(largestNum+" "+secondLargest);
    }
}
