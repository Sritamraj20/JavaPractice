import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]){
        int arr[]={1,4,3,2};

        //Bubble Sort is a sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order, pushing the largest element to the end in each pass until the array is sorted.

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));







    }


}
