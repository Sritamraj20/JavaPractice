import java.util.Scanner;

public class NumberPalindrom {

    private static int isPalindrom(int num){
        int palindrom=0;
        int remainder=0;
        while(num>0){
            remainder=num%10;
            num=num/10;
            palindrom=palindrom*10+remainder;
        }
        return palindrom;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();

        int pal=isPalindrom(num);
        if(pal==num){
            System.out.println("isPalindrom");
        }else {
            System.out.println("not a palindrom");
        }
    }
}
