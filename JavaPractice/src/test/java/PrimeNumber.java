import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        int half=num/2;
        int count=0;
        for(int i=1;i<=half;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("not a prime number");
        }else {
            System.out.println("is a prime number");
        }

    }
}
