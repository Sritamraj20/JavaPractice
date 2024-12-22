public class DSA1 {
    public static void main(String[] args){
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println(i);
            }
        }
    }
}
