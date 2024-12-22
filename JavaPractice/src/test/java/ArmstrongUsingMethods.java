public class ArmstrongUsingMethods {
    public static int getCount(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static int getSum(int i){
        int remainder=0;
        int sum=0;
        int count=getCount(i);
        while(i>0){
            remainder=i%10;
            i=i/10;

            int arm=(int)Math.pow(remainder,count);
            sum=sum+arm;
        }
        return sum;
    }

    public static void main(String args[]){
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num=scan.nextInt();




        for(int i=1;i<=1000;i++){


            int sum=getSum(i);
            if(i==sum){
                System.out.println(String.format("The armstrong number is: %s",i));
            }


        }


    }
}
