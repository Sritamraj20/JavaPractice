import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class ProductofArrayExceptItself {
    public static void main(String args[]) throws IOException, AWTException {

        int arr[]={10, 3, 5, 6, 2};


        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int mult=1;
            int second=0;
            for(int j=0;j<arr.length;j++){

                if(arr[i]!=arr[j]){
                    second=arr[j];
                    mult= mult*second;
                }
            }
            arr1[i]=mult;
        }
        System.out.println(Arrays.toString(arr1));











    }
}
