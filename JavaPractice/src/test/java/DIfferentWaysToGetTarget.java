public class DIfferentWaysToGetTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=3;
        int count=0;
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]!=arr[j]){
                  sum=arr[i]+arr[j];
                  if(sum==target){
                      count++;
                  }
                }
            }
        }
        System.out.println(count);
    }
}
