public class OddOrEvenInArray {
    public static void main(String[] args){
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("is even");
            }else {
                System.out.println("is odd");
            }
        }
    }
}
