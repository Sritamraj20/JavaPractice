public class ConsecutiveSequenceMay1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        int count=1;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                count++;
            }else {
                System.out.println("The last consecutive number is: "+arr[i]);
            }
        }
        System.out.println(count);
    }
}
