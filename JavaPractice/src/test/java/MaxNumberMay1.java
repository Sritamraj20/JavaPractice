public class MaxNumberMay1 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int largest=0;
        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    largest=arr[i];
                }else {
                    largest=arr[j];
                }
            }
        }
        System.out.println(largest);

    }
}
