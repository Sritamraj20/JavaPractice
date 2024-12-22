import java.util.Scanner;

public class GreatestOfThreeMay1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a>b && a>c){
            System.out.println("a is greatest");
        } else if (b>c && b>a) {
            System.out.println("b is greatest");
        }else if(c>a && c>b){
            System.out.println("c is greatest");
        }
    }
}
