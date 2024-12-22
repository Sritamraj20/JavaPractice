import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.Arrays;

public class DSA2Duplicate {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,5,6,6};
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    System.out.println(nums[j]);
                }
            }
        }
    }
}
