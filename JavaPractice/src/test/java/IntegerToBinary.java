public class IntegerToBinary {
    public static void main(String args[]){
        int a=10;
//        String binary=Integer.toBinaryString(a);
//        System.out.println(binary);

        int remainder=0;
        StringBuilder sb=new StringBuilder();
        while(a>0){
            remainder=a%2;
            a/=2;
            sb.append(remainder);
        }
        System.out.println(sb.reverse());

    }
}
