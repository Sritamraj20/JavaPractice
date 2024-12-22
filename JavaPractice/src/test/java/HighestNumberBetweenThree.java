import java.util.Scanner;

public class HighestNumberBetweenThree {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=scan.nextInt();
        System.out.println("Enter second number: ");
        int b=scan.nextInt();
        System.out.println("Enter third number: ");
        int c=scan.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater");
        } else if (b>a && b>c) {
            System.out.println("b is greater");
        } else if (c>a && c>b) {
            System.out.println("c is greater");
        }

    }
}
