import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int num=scan.nextInt();

        int arr[]=new int[num];

        System.out.println("Enter"+num+"numbers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Enter the expected number: ");
        int item=scan.nextInt();


        int first=0;
        int last=arr.length;
        int middle=(first+last)/2;

        while(first<=last){
            if(arr[middle]<item){
                first=middle+1;
            } else if (arr[middle]==item) {

                System.out.println("The num"+item+"found on location"+middle);
                break;
            }else {
                last=middle-1;
            }
            middle=(first+last)/2;
        }

        if(first>last){
            System.out.println("The num"+item+"is not present");
        }
    }
}
