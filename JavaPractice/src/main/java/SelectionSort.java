
import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]={4, 2, 5, 1};

        //Selection Sort is a sorting algorithm that repeatedly finds the smallest element from the unsorted part and swaps it with the first unsorted element, gradually sorting the array.

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
