import java.util.Scanner;

public class OddAndEvenNumber {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("is even");
        }else {
            System.out.println("is odd");
        }
    }

}
