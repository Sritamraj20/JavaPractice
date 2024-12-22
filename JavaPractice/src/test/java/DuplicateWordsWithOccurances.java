import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicateWordsWithOccurances {
    public static void main(String args[]){
        String str="I am a hero and I am a human";

        String splitedarr[]=str.split(" ");

        HashMap<String,Integer> hm=new LinkedHashMap<>();

        for(int i=0;i<splitedarr.length;i++){
            if(hm.containsKey(splitedarr[i])){
                int incre=hm.get(splitedarr[i]);
                hm.put(splitedarr[i],++incre);
            }else {
                hm.put(splitedarr[i],1);
            }
        }
        System.out.println(hm);


        int count=0;
        for(int i=0;i<splitedarr.length;i++){
            count=1;
            for(int j=i+1;j<splitedarr.length;j++){
                if(splitedarr[i].equals(splitedarr[j])){
                    count++;
                    splitedarr[j]="0";
                }
            }
            if(count>1 && splitedarr[i]!="0"){
                System.out.println(splitedarr[i]);
            }
        }




    }
}
