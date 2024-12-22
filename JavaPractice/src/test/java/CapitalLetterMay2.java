import javax.swing.plaf.IconUIResource;

public class CapitalLetterMay2 {
    public static void main(String[] args) {
        String name="SritaM";
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>'A' && name.charAt(i)<'Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
