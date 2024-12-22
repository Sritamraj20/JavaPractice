import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
               sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("is perfect num");
        }else {
            System.out.println("! a perfect num");
        }
    }
}
