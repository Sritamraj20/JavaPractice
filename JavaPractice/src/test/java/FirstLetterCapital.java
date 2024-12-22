public class FirstLetterCapital {

    public static void main(String args[]) {

        String str = "i am an automation tester";

        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            for (int j = 0; j < 1; j++) {
                System.out.print(Character.toUpperCase(word.charAt(j)));
            }
            for (int k = 1; k < word.length(); k++) {
                System.out.print(word.charAt(k));
            }
            System.out.print(" ");
        }

//        String str = "i am an automation tester";
//
//        String arr[]=str.split(" ");
//
//        for(int i=0;i<arr.length;i++){
//            String word=arr[i];
//            for(int j=0;j<word.length();j++){
//                if(j%2==0){
//                    System.out.print(Character.toUpperCase(word.charAt(j)));
//                }else {
//                    System.out.print(word.charAt(j));
//                }
//
//            }
//            System.out.print(" ");
  //  }



    }
}
