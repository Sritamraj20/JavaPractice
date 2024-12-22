import javax.swing.plaf.metal.MetalTabbedPaneUI;
import java.util.Scanner;

public class CallingMethods {

    static int add(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(rest(count,num));
        return num;
    }

    static int rest(int a,int num){

        int remainder=0;
        while(num>0){
            remainder=num%10;
            int po=(int)Math.pow(remainder,a);
            num=num/10;
        }
        return num;
    }




    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        //CallingMethods cm=new CallingMethods();

        System.out.println(add(a));


    }
}
