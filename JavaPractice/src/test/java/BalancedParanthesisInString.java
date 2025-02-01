import java.util.Stack;

public class BalancedParanthesisInString {
    public static void main(String args[]){
        String s="((())";

        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.toString(s.charAt(i)).equals("(")) {
                st.push(Character.toString(s.charAt(i)));
                //System.out.println(st);
            }else {
                String n=st.get((st.size()-1));
                //System.out.println(i);
                if(n.equals("(") && Character.toString(s.charAt(i)).equals(")")){
                    st.pop();
                    //System.out.println(st);
                }
                //i--;
            }
        }
        if(st.isEmpty()){
            System.out.println("balanced String");
        }else {
            System.out.println("unbalanced String");
        }
    }
}
