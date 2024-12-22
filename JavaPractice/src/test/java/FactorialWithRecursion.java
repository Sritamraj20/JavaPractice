import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class FactorialWithRecursion {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num=scan.nextInt();
//        System.out.println(factorial(num));
//    }
//    private static long factorial(int fact){
//        if(fact==0 || fact==1){
//            return 1;
//        } else if (fact<0) {
//            return 0;
//        }
//        else {
//            return fact*factorial(fact-1);
//        }
//    }
public static void main(String[] args){
    int num=4;
    int fact=1;
    for (int i = 1; i <= num; i++) {
        fact=fact*i;
    }
    System.out.println(fact);
}
}
