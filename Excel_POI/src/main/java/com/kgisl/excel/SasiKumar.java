package com.kgisl.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * POIWrite
 */
public class SasiKumar {

    public static void main(String[] args) {
        // Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");

        // This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] { "ID", "NAME", "dept", "Mark1", "Mark2", "Mark3" });
        data.put("2", new Object[] { 1, "Amit", "it", 78, 56, 44 });
        data.put("3", new Object[] { 2, "Lokesh", "cs", 56, 77, 44 });
        data.put("4", new Object[] { 3, "John", "btech", 43, 67, 34 });
        data.put("5", new Object[] { 4, "Brian", "it", 34, 65, 33 });

        // Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
            // sheet.getRow(0).createCell(6).setCellValue("Total");
            // sheet.getRow(1).createCell(6).setCellFormula("(D2+E2+F2)");
            // sheet.getRow(2).createCell(6).setCellFormula("(D3+E3+F3)");
            // sheet.getRow(3).createCell(6).setCellFormula("(D4+E4+F4)");
            // sheet.getRow(4).createCell(6).setCellFormula("(D5+E5+F5)");
            
        }
        int t=2,i=1; String s1="SUM(D",s2=":F",s3=")",s4="";

        sheet.getRow(0).createCell(6).setCellValue("Total");//SUM(D2:F2)
        for ( i = 1; i <= 4; i++)
        {   s4=s1+t+s2+t+s3;
            sheet.getRow(i).createCell(6).setCellFormula(s4);
            System.out.println(s4);++t;
        }
      
        try 
        {
            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("D://howtodo_demo.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}