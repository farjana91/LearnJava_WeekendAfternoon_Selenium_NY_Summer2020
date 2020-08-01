package excelreadandwrite;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    // Set the path of the Excel File
  public static final String filePath=System.getProperty("user.dir")+"/DataTest/myExcel.xlsx";

    static Object[][] stDetails={
            {"Sl","FirstName","LastName","Address","ContactNumber"},
            {1001,"Syed","Raza","Canada","9879879834"},
            {1002,"Jack","Cohen","NJ,USA","9979879834"},
            {1003,"Jony","Hossain","NY,USA","9779879834"},
            {1004,"Elhacen","Arib","FL,USA","9679879834"}
    };

    public static void main(String[] args) {
        //System.out.println(System.getProperty("user.dir"));
        writeExcel(filePath,stDetails,"Student Details");

    }

    public static void writeExcel(String filName,Object[][] arrayName,String sheetName){
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet(sheetName);
        int rowNum=0;
        System.out.println("Excel file Created");
        for (Object[] std:arrayName) {
            Row row=sheet.createRow(rowNum++);
            int colNum=0;
            for (Object field:std) {
                Cell cell=row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue((String) field);
                } else if(field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            //File output steam
            FileOutputStream out=new FileOutputStream(filName);
            workbook.write(out);
            workbook.close();
        } catch ( FileNotFoundException e){
            System.out.println("File not found  Exception");
        } catch (IOException e) {
            System.out.println("Done");
        }


    }



}
