import java.util.Scanner;

public class BinarySearch {
        public static void  main(String args[]){

            //The array should be sorted before writing the logic about the index finding.

            int arr[]={1,2,3,4,5};

            Scanner scan=new Scanner(System.in);
            System.out.print("Enter a targeted number: ");
            int target=scan.nextInt();

            int start=0;
            int end=arr.length-1;
            int mid=(start+end)/2;

            while(start<=end){
                if(arr[mid]<target){
                    start=start+1;
                } else if (arr[mid]==target) {
                    System.out.println("The number found at index: "+mid);
                    break;
                }else {
                    end=end-1;
                }
                mid=(start+end)/2;
            }
            if(start>end){
                System.out.println("There is no such number present");
            }


        }
    }
