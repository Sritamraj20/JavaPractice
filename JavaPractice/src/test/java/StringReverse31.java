public class StringReverse31 {
    public static void main(String[] args) {
        String name="sritamraj mahakul";
        String[] splitedString=name.split(" ");
        String newString="";
        for (int i = 0; i < splitedString.length; i++) {
            String name1=splitedString[i];
            String name2="";
            for (int j = 0; j < name1.length(); j++) {
                name2=name1.charAt(j)+name2;
            }
            newString=newString+" "+name2;
        }
        System.out.println(newString);
    }
}
