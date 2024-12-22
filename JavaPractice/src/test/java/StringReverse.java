public class StringReverse {
    public static void main(String[] args){
        String name="sritam";
        String newName="";
        for(int i=0;i<name.length();i++){
            newName=name.charAt(i)+newName;
        }
        System.out.println(newName);
    }
}
