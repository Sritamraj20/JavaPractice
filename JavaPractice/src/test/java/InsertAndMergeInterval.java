import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAndMergeInterval {
    public static void main(String args[]){
        int arr[][]={{1, 3}, {4, 5}, {6, 7}, {8, 10}};

        int newinterval[]={5,6};

        int i=0;
        int cycle=arr.length;
        List<int[]> li=new ArrayList<>();

            while(i<cycle && arr[i][1]<newinterval[0]) {
                li.add(arr[i]);
                i++;
            }

            while(i<cycle && arr[i][0]<=newinterval[1]){
                newinterval[0]=Math.min(arr[i][0],newinterval[0]);
                newinterval[1]=Math.max(arr[i][1],newinterval[1]);
                i++;
            }
            li.add(newinterval);

        while (i < cycle) {
            li.add(arr[i]);
            i++;
        }

        // Properly print the merged intervals
        System.out.println(Arrays.deepToString(li.toArray(new int[li.size()][])));

        //deepToString is used to print multi-dimensional Array print without any error.







        



    }
}
