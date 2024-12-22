public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int highest=arr[0];
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    highest=arr[i];
                }
            }
        }
        System.out.println(highest);
    }
}
