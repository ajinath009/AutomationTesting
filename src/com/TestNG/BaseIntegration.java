package com.TestNG;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class BaseIntegration

{
@DataProvider
    public Iterator<Object[]> getloginData() throws IOException, BiffException
{
    FileInputStream fis= new FileInputStream("C:/Users/admin/IdeaProjects/Automationtesting/ReadData.xls");
    Workbook book = Workbook.getWorkbook(fis);
    Sheet sheet= book.getSheet("TestData");

    int rows = sheet.getRows();
    int coloums= sheet.getColumns();

    String testData[][]= new String[rows-1][coloums];
    int count= 0;
     for ( int i=0;i<rows; i++)
     {
         for (int j=0; j<coloums;j++)
         {
             Cell cell= sheet.getCell(j,i);
             testData[count][j]= cell.getContents();
         }
         count++;
     }
     fis.close();
    return null;
}


}
