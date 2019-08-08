package test;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelWrite {
    public static void main(String[] args)throws Exception {

        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        String path ="src/SampleData.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        //open and loading file in given path >>>> from java

        //loading workbook class
        workbook = new XSSFWorkbook(fileInputStream);

        //providing specific sheet that we want to work on
        sheet = workbook.getSheet("Employees");

        //selecting and saving the row
        row = sheet.getRow(1);

        //selecting the cell from the selected row
        cell = row.getCell(1);

        System.out.println("Steven's lastname "+ cell.toString());

        XSSFCell adamCell = sheet.getRow(2).getCell(0);
        System.out.println("BEFORE " + adamCell.toString());

        adamCell.setCellValue("Madam");

        System.out.println("AFTER " + adamCell.toString());

        //Examples:

        for(int rowNum = 0; rowNum < sheet.getLastRowNum();rowNum++ ){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Madam")){
                sheet.getRow(rowNum).getCell(2).setCellValue("President");
            }
        }

        //for when you are sending a value to a file
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //this is the line that is executing and writing to the file
        workbook.write(fileOutputStream);

        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
