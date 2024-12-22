import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
//        Scanner scan=new Scanner(new File("D:\\FileHandling\\hello.txt"));
//
//        while(scan.hasNextLine()){
//            System.out.println(scan.next());
//        }

        try{
            FileInputStream fis=new FileInputStream(new File("D:\\FileHandling\\sritam.xlsx"));

            XSSFWorkbook workbook=new XSSFWorkbook(fis);
            XSSFSheet sheet=workbook.getSheetAt(0);

            for(Row row:sheet){
                for(Cell cell:row){
                    switch(cell.getCellType()){
                        case STRING:
                            System.out.print(cell.getStringCellValue());
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue());
                            break;
                        default:
                            System.out.print("unknown");
                    }
                }
                System.out.println();
            }


        }catch (Exception e){
            e.printStackTrace();
        }





    }
}
