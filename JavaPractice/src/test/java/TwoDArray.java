public class TwoDArray {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6}};
        int target=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    System.out.println("number is present");
                }else {
                    System.out.println("not present");
                }
            }
            System.out.println("not present");
        }

    }
}
