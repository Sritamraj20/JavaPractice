public class Operation{
    public static void main(String[] args){
        int arr[]={10,2,8,4,5,9};
        int largest=0;
        int secondLargest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]!=largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}