import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};//1,2,3,5,6,7,8,9,10

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }
}
