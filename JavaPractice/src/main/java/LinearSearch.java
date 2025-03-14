import java.util.Scanner;

public class LinearSearch {

    //The array should be sorted before writing the logic about the index finding.

    public static int getNumberIndex(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void  main(String args[]){

        int arr[]={1,2,3,4,5};

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a targeted number: ");
        int target=scan.nextInt();


        int num=getNumberIndex(arr,target);

        if(num!=-1){
            System.out.println(String.format("number found at index : %s",num));
        }else {
            System.out.println("There is no such element present in this array");
        }



    }
}
