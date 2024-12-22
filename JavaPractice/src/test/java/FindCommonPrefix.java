public class FindCommonPrefix {
    public static void main(String args[]){
        String[] str = {"cardboard", "cart", "carrot", "carbon"};


        String prefix=str[0];
        for(int i=0;i< str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);




    }
}
