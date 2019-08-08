package test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;


public class ExcelRead {
    public static void main(String[] args)throws Exception {

        //Creating a file
        //Import from java.oi
        File file = new File("src/SampleData.xlsx");
        //file.exists()method checks given file
        //return true if find
        System.out.println(file.exists());

        //loads our file in java memory so that can read and write
        FileInputStream fileInputStream = new FileInputStream(file);

        //Workbook >> sheet >> Rows >> Cells
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //passing the sheet name
        XSSFSheet sheet = workbook.getSheet("Employees");

        System.out.println(sheet.getRow(2).getCell(1));

        int usedRows = sheet.getPhysicalNumberOfRows();

        int lastUsedRow = sheet.getLastRowNum();

        System.out.println(usedRows);
        System.out.println(lastUsedRow);




        for(int rowNum = 0; rowNum < usedRows;rowNum++){

            if (sheet.getRow(rowNum).getCell(0).toString().equals("Neena")){
                System.out.println(sheet.getRow(rowNum).getCell(0));
                break;
            }
        }

for(int rowNum = 0; rowNum < usedRows; rowNum++){

    if(sheet.getRow(rowNum).getCell(0).toString().equals("Adam")){
        System.out.println(sheet.getRow(rowNum).getCell(2).toString());
        break;
    }
}
workbook.close();
fileInputStream.close();


    }
}
