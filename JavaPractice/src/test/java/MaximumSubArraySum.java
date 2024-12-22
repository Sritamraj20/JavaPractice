import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaximumSubArraySum {
    public static void main(String args[]) throws IOException, AWTException {

        int arr[]={2, 3, -8, 7, -1, 2, 3};

        int target=11;



        for(int i=0;i<arr.length;i++){
            int sum=0;
            int add=0;
            List<Integer> li=new ArrayList<>();
            for(int j=i;j<arr.length;j++){
                if(sum!=target){
                    add=arr[j];
                    sum=sum+add;
                    li.add(arr[j]);
                }
                if (sum==target) {
                    System.out.println(li);
                    break;
                }
            }

        }













    }
}
