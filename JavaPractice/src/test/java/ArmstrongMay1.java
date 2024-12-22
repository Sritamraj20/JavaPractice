import java.util.Scanner;

public class ArmstrongMay1 {

    static int getCount(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scan.nextInt();

        int iter=getCount(num);

        int remainder=0;
        int armstrong=0;
        int sum=0;
        while(num>0){
            remainder=num%10;
            num=num/10;
            armstrong=(int)Math.pow(remainder,iter);
            sum=sum+armstrong;
        }
        System.out.println(sum);
    }
}

