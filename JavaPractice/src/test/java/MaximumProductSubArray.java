public class MaximumProductSubArray {
    public static void main(String[] args){
        int arr[]={-2, 6, -3, -10, 0, 2};

        int maxns=0;
        for(int i=0;i<arr.length;i++){
            int mul=1;
            for(int j=i;j< arr.length;j++){
                mul=mul*arr[j];
                maxns=Math.max(maxns,mul);
            }
        }
        System.out.println(maxns);


    }
}
