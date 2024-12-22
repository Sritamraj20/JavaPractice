public class StringPalindrom {
    public static void main(String[] args){
       String name="abccba";
       String newName="";
        for (int i = 0; i < name.length(); i++) {
            newName=name.charAt(i)+newName;
        }
        //System.out.println(newName);
        if(name.equals(newName)){
            System.out.println("Is a palindrom");
        }else {
            System.out.println("! palindrom");
        }
    }
}
