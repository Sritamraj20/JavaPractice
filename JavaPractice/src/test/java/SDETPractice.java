//import java.awt.*;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SDETPractice{
    public static void main(String[] args) throws IOException {

        String str="aabbbcccc";
        HashMap<Character,Integer> hmap=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(hmap.containsKey(str.charAt(i))){
                int count=hmap.get(str.charAt(i));
                hmap.put(str.charAt(i),++count);
            }else {
                hmap.put(str.charAt(i),1);
            }
        }
        System.out.println(hmap);

        Iterator<Integer> itr=hmap.values().iterator();

        int max=0;
        int seocndMax=0;
        while(itr.hasNext()){
            int a= itr.next();
            if(a>max){
                seocndMax=max;
                max=a;
            } else if (a>seocndMax && a<max) {
                seocndMax=a;
            }
        }
        System.out.println(seocndMax);

        for(Map.Entry<Character,Integer> map:hmap.entrySet()){
            if(seocndMax==map.getValue()){
                System.out.println(map.getKey());
            }
        }










    }


}
