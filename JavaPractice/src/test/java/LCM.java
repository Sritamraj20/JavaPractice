public class LCM {
    static int gcd(int a,int b){
        int temp=0;

        while(b>0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args){

        int a=15;
        int b=25;



        int lcm=(a*b)/gcd(a,b);

        System.out.println(lcm);






    }
}
