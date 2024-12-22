import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FilterDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]!=arr[j]){

                    count++;

                }
            }

        }
        System.out.println(count);
    }
}
