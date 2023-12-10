package com.kgisl.excel;

import java.io.FileInputStream;  
import java.io.InputStream;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.ss.usermodel.WorkbookFactory;  
public class sample {
    public static void main(String[] args) {  
        try (InputStream inp = new FileInputStream("D:\\Krishnan_Maven\\Excel_POI\\Student.xlsx")) 
        {  
                Workbook wb = WorkbookFactory.create(inp);  
                Sheet sheet = wb.getSheetAt(0);  
               for (int i = 1; i < 5; i++)
               {
                   for (int j = 3; j < 6; j++) 
                   {
                    Row row = sheet.getRow(i);  
                    Cell cell = row.getCell(j);  
                    if (cell != null)  
                        System.out.println("Data: "+j+"="+cell);  
                    else  
                        System.out.println("Cell is empty");  
                   }
                   
               }
                
        }catch(Exception e) {  
            System.out.println(e);  
        }  
    }  
}  