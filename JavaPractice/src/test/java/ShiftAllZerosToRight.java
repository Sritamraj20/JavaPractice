import java.util.Arrays;

public class ShiftAllZerosToRight {
    public static void main(String args[]){
        int[] arr = { 1, 0, 2, 0, 3, 0, 0, 0 };

        int newarr[]=new int[arr.length];

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                newarr[count]=arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
