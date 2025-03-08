//import java.awt.*;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.ss.util.CellRangeAddress;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SDETPractice{

    public static void main(String[] args) throws IOException {

        String str="geeksforgeeks";


        int maxs=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            Set<Character> se = new LinkedHashSet<>();
            count=0;
            for(int j=i;j<str.length();j++) {

                if (se.contains(str.charAt(j))) {
                    //count++;
                    maxs=Math.max(maxs,count);
                    break;
                } else {
                    se.add(str.charAt(j));
                    count++;
                }
            }

            System.out.println(se);
        }

        System.out.println(maxs);






    }


}
