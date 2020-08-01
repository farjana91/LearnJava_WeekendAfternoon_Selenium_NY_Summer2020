package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {
    // File location
    // input steam
    public static final String fileName = System.getProperty("user.dir") + "/DataTest/sample.xlsx";
    public static void main(String[] args) {
        readExcelFile(fileName,0);
    }

    public static void readExcelFile(String fileName, int sheetNumber) {
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            Workbook workbook =new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet=workbook.getSheetAt(sheetNumber);
            // Row
            Iterator<Row> rowIterator=dataTypeSheet.iterator();
            while (rowIterator.hasNext()){
                Row currentRow=rowIterator.next();
                // Cell
                Iterator<Cell> cellIterator=currentRow.iterator();
                while (cellIterator.hasNext()){
                    Cell currentCell=cellIterator.next();

                    if (currentCell.getCellType()== CellType.STRING){
                        System.out.print(currentCell.getStringCellValue()+" ");
                    } else if (currentCell.getCellType()== CellType.NUMERIC){
                        System.out.print(currentCell.getNumericCellValue()+" ");
                    }else if (currentCell.getCellType()== CellType.BOOLEAN){
                        System.out.print(currentCell.getBooleanCellValue()+" ");
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found Exception");
        } catch (IOException e1){
            System.out.println("Reading Done");
        }
    }

}
