import java.util.*;

public class PracticePag {

    public static void main(String[] args){
//        String name="sritam";
//        String[] arr=name.split("");
//        String newName="";
//        for (int i = 0; i < arr.length; i++) {
//            if(i%2==0){
//                newName=newName+arr[i].toUpperCase();
//            }else {
//                newName=newName+arr[i];
//            }
//        }
//        System.out.println(newName);
        Scanner scan=new Scanner(System.in);
        //System.out.println("Enter a string: ");
        //int num=scan.nextInt();
        //String name=scan.nextLine();
        int[] arr={3,6,19,8,1,2,40};

        
        int highest=arr[0];
        int secondHighest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>highest){
                secondHighest=highest;
                highest=arr[i];
            } else if (arr[i]>secondHighest && arr[i]<highest) {
                secondHighest=arr[i];
            }
        }
        System.out.println(secondHighest);









        }
    }
