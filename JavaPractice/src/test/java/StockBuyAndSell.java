import java.awt.*;
import java.io.IOException;

public class StockBuyAndSell {
    public static void main(String args[]) throws IOException, AWTException {

        //int arr[]={1,2,3,6,7,9,10};
        //int arr[]={1,2,3,4,5,6,7};
        int arr[]={7, 6, 4, 3, 1};
        int maxns=0;
        int first=0;
        int second=0;
        int third=0;
        for(int i=0;i<arr.length;i++){
            first=arr[i];
            for(int j=i+1;j<arr.length;j++){
                second=arr[j];
                maxns=Math.abs(Math.max(maxns,Math.abs(second-first)));
                if(maxns>third){
                    third=maxns;
                    maxns=0;
                }
            }
            first=0;
        }
        System.out.println(third);











    }
}
