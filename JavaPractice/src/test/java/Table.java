public class Table {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(String.format("The multiply of %s and %s is: ",i,j)+i*j);
            }
        }
    }
}