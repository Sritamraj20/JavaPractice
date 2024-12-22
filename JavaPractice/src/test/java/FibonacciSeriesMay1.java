import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesMay1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();

        int arr[]=new int[num];
        int firstNum=0;
        int secondNum=1;
        arr[0]=firstNum;
        arr[1]=secondNum;
        int thirdNum=0;

        for(int i=2;i<num;i++){
            thirdNum=firstNum+secondNum;
            arr[i]=thirdNum;
            firstNum=secondNum;
            secondNum=thirdNum;
        }
        System.out.println(Arrays.toString(arr));

    }
}
