package com.BasicSeleniumTest;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelSheetOperation
{

    public static void main(String[] args) throws  IOException
    {
        //XSSFWorkbook
        File file = new File("C:/Users/admin/IdeaProjects/Automationtesting/ReadData.xls");
      //  FileInputStream fis =new FileInputStream(file);
        //obtaining input bytes from a file
        FileInputStream fis=new FileInputStream(file);
//creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(fis);
//creating a Sheet object to retrieve the object
        XSSFSheet sheet=wb.getSheetAt(0);
//evaluating cell type
        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
        for(Row row: sheet)     //iteration over row using for each loop
        {
            for(Cell cell: row)    //iteration over cell using for each loop
            {
                switch(formulaEvaluator.evaluateInCell(cell).getCellType())
                {
                    case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type
//getting the value of the cell as a number
                        System.out.print(cell.getNumericCellValue()+ "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:    //field that represents string cell type
//getting the value of the cell as a string
                        System.out.print(cell.getStringCellValue()+ "\t\t");
                        break;
                }
            }
            System.out.println();
        }
    }

        /*

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");


         */



}
