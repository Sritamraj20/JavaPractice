import java.util.ArrayList;

public class SubArraysWithOddSum {
    public static void main(String[] args){
        int arr[]={1,3,5};
        //return the number of subarrays with odd sum

        int sum=0;
        ArrayList<Integer> ar=new ArrayList<>();

        for(int i=0;i<arr.length+1;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum%2!=0){
                    ar.add(sum);
                }

            }

        }
        System.out.println(ar);



    }
}
