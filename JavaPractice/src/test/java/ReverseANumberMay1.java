public class ReverseANumberMay1 {
    public static void main(String[] args){
        int num=123321;
        int remainder=0;
        int reverseNumber=0;
        while(num>0){
            remainder=num%10;
            num=num/10;
            reverseNumber=reverseNumber*10+remainder;
        }
        System.out.println(reverseNumber);
    }
}
