public class CountOccuranceOfSumOfANum {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int target=10;

        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    sum=arr[i]+arr[j];
                    if(sum==target){
                        count++;

                        System.out.println(arr[i]+" "+arr[j]);
                        arr[i]=0;
                        arr[j]=0;
                    }
                }
            }
        }
        System.out.println("The number of times target found is "+count);
    }
}
