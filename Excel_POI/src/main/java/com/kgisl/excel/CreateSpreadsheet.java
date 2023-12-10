package com.kgisl.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * CreateSpreadsheet
 */
public class CreateSpreadsheet 
{
    public static void main(String[] args) 
    {   int i=1; double temp=0;
        // Blank workbook 
        XSSFWorkbook workbook = new XSSFWorkbook(); 
  
        // Create a blank sheet 
        XSSFSheet sheet = workbook.createSheet("student Details"); 
  
        // This data needs to be written (Object[]) 
        Map<String, Object[]> data = new TreeMap<String, Object[]>(); 
        data.put("1", new Object[]{ "Id", "Name", "Last Name","Sub1","Sub2","Sub3","Total" }); 
        data.put("2", new Object[]{ 1, "Pankaj", "Kumar",50,60,50 }); 
        data.put("3", new Object[]{ 2, "Prakashni", "Yadav",60,60,60 }); 
        data.put("4", new Object[]{ 3, "Ayan", "Mondal",70,70,70 }); 
        data.put("5", new Object[]{ 4, "Virat", "kohli",100,100,100 }); 
  
        // Iterate over data and write to sheet 
        Set<String> keyset = data.keySet(); 
        int rownum = 0; 
        for (String key : keyset)
         { 
            // this creates a new row in the sheet 
            Row row = sheet.createRow(rownum++); 
            Object[] objArr = data.get(key); 
            int cellnum = 0; 
              for (Object obj : objArr) 
              { 
                // this line creates a cell in the next column of that row 
                Cell cell = row.createCell(cellnum++); 
                if (obj instanceof String) 
                    cell.setCellValue((String)obj); 
                else if (obj instanceof Integer) 
                {
                    //if(cellnum==1)
                    cell.setCellValue((Integer)obj);
                   // System.out.println(cellnum);
                    int d=(Integer)obj;
                    if(cellnum==4 || cellnum==5 || cellnum==6)
                    {
                    temp=temp+d;++i;
                    }
                    if(i==4)
                    {
                                     
                    Cell cell1Cell = row.createCell(cellnum++);
                    cell1Cell.setCellValue(temp);
                    temp=0;i=1;
                    }
                }
              } 
        } 
        try
        { 
            // this Writes the workbook gfgcontribute 
            FileOutputStream out = new FileOutputStream(new File("Student.xlsx")); 
            workbook.write(out); 
            out.close(); 
            System.out.println(".xlsx written successfully on disk."); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 

        //******************************* *//
        try { 
            FileInputStream file = new FileInputStream(new File("STUDENT.xlsx")); 
        
            // Create Workbook instance holding reference to .xlsx file 
            XSSFWorkbook workbook1 = new XSSFWorkbook(file); 
        
            // Get first/desired sheet from the workbook 
            XSSFSheet sheet1 = workbook1.getSheetAt(0); 
        
            // Iterate through each rows one by one 
            Iterator<Row> rowIterator = sheet1.iterator(); 
            while (rowIterator.hasNext()) { 
                Row row = rowIterator.next(); 
                // For each row, iterate through all the columns 
                Iterator<Cell> cellIterator = row.cellIterator(); 
        
                while (cellIterator.hasNext()) { 
                    Cell cell = cellIterator.next(); 
                    // Check the cell type and format accordingly 
                    switch (cell.getCellType()) { 
                    case Cell.CELL_TYPE_NUMERIC: 
                        System.out.print(cell.getNumericCellValue() + " "); 
                        break; 
                    case Cell.CELL_TYPE_STRING: 
                        System.out.print(cell.getStringCellValue() + " "); 
                        break; 
                    } 
                } 
                System.out.println(""); 
            } 
            file.close(); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        } 

    } 

    
}