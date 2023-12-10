package com.kgisl.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ComparisonOperator;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * ReadAndWrite
 */
public class StudentExcelPoi 
{
    static FileInputStream file;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static List<Marks> markList = new ArrayList<>();
    static Map<String, Marks[]> data = new TreeMap<String, Marks[]>();

    public static void main(String[] args) {
        
        readExcelFile();
        writeExcelFile();
    }

    public static void readExcelFile() {
        try {
            file = new FileInputStream(new File("D:\\Krishnan_Maven\\Excel_POI\\excelsheetobject\\results.xlsx"));
            // Create Workbook instance holding reference to .xlsx file
            workbook = new XSSFWorkbook(file);

            // Get first/desired sheet from the workbook
            sheet = workbook.getSheetAt(1);

            int noOfRows = sheet.getLastRowNum();
            short noOfColumns = sheet.getRow(0).getLastCellNum();

            System.out.println("Rows in the Excel = "+noOfRows);
            System.out.println("Columns in the Excel = "+noOfColumns);

            //markList = new ArrayList<>();

            //data = new TreeMap<String, Marks[]>();
            // data.put("1", new Object[] { "ID", "NAME", "LASTNAME", "M1", "M2", "M3" });
            // data.put("2", new Object[] { 1, "Amit", "Shukla", 10, 20, 30 });

            for (int i = sheet.getFirstRowNum() + 1; i <= noOfRows; i++) 
            {
                // System.out.println(i);
                Row currentRow = sheet.getRow(i);
                Marks marks = new Marks();
                System.out.println("currentRow.getFirstCellNum() = "+currentRow.getFirstCellNum());
                for (int j = currentRow.getFirstCellNum(); j <= noOfColumns; j++) {
                    // Marks marks =new Marks(id, name, college, department, year, mark1, mark2,
                    // mark3)

                    Cell cell = currentRow.getCell(j);
                    System.out.println(" Cell cell = currentRow.getCell(j) "+" j ="+ j +" "+currentRow.getCell(j));
                    // id name college department year mark1 mark2 mark3
                    if (j == 0) {
                        // If you have Header in text It'll throw exception because it won't get
                        // NumericValue
                        System.out.println(cell.getNumericCellValue());
                        marks.setId((int) cell.getNumericCellValue());
                    }
                    if (j == 1) {
                        marks.setName(cell.getStringCellValue());
                    }
                    if (j == 2) {
                        marks.setCollege(cell.getStringCellValue());
                    }
                    if (j == 3) {
                        marks.setDepartment(cell.getStringCellValue());
                    }
                    if (j == 4) {
                        marks.setYear((int) cell.getNumericCellValue());
                    }
                    if (j == 5) {
                        marks.setMark1((int) cell.getNumericCellValue());
                    }
                    if (j == 6) {
                        marks.setMark2((int) cell.getNumericCellValue());
                    }
                    if (j == 7) {
                        marks.setMark3((int) cell.getNumericCellValue());
                    }

                }
                markList.add(marks);
                // data.put(Integer.toString(marks.getId()), new Marks[] { 1, "Amit", "Shukla",
                // 10, 20, 30 });
                // data.put("Integer.toString(marks.getId())", marks);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeExcelFile() {
        // Blank workbook
        workbook = new XSSFWorkbook();

        // Create a blank sheet
        sheet = workbook.createSheet("Results");

        // Create a headerRow
        String[] columns = { "id", "name", "college", "department", "year", "mark1", "mark2", "mark3", "total" };
        Row headerRow = sheet.createRow(0);

        // Create headerRow cells
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // Construct data cells

        int rowNum = 1; double m1=0, m2 = 0,m3 = 0;
        for (Marks var : markList) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(var.getId());
            row.createCell(1).setCellValue(var.getName());
            row.createCell(2).setCellValue(var.getCollege());
            row.createCell(3).setCellValue(var.getDepartment());
            row.createCell(4).setCellValue(var.getYear());
            row.createCell(5).setCellValue(var.getMark1());
            row.createCell(6).setCellValue(var.getMark2());
            row.createCell(7).setCellValue(var.getMark3());

            // Add a new cell as "Total"
            Cell totcell = row.createCell(row.getLastCellNum(), Cell.CELL_TYPE_NUMERIC);
            if (true) {
                m1 = row.getCell(5).getNumericCellValue();
                m2 = row.getCell(6).getNumericCellValue();
                m3 = row.getCell(7).getNumericCellValue();
                totcell.setCellValue(m1 + m2 + m3);
               
            }
            sheet.getRow(0).createCell(9).setCellValue("Result");
            Cell result = row.createCell(row.getLastCellNum(), Cell.CELL_TYPE_STRING);
            if (m1 < 35 || m2 < 35 || m3 < 35)
                {
                    result.setCellValue("Fail");
                }
                else
                {
                    result.setCellValue("Pass");
                }
            
        }

        

        try 
        {
            // Formatting
            cellFormatting();
            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("D:\\Krishnan_Maven\\Excel_POI\\excelsheetobject\\studentResults.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("File written successfully on disk.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void cellFormatting() {
        SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();

        ConditionalFormattingRule rule2 = sheetCF.createConditionalFormattingRule(ComparisonOperator.LT, "40");
        PatternFormatting fill2 = rule2.createPatternFormatting();
        fill2.setFillBackgroundColor(IndexedColors.RED.index);
        fill2.setFillPattern(PatternFormatting.SOLID_FOREGROUND);

        CellRangeAddress[] regions = { CellRangeAddress.valueOf("F1:F11"), CellRangeAddress.valueOf("G1:G11"),
                CellRangeAddress.valueOf("H1:H11") };

        sheetCF.addConditionalFormatting(regions, rule2);


        SheetConditionalFormatting sheetCF1 = sheet.getSheetConditionalFormatting();

        ConditionalFormattingRule rule1 = sheetCF1.createConditionalFormattingRule(ComparisonOperator.GE, "40");
        PatternFormatting fill1 = rule1.createPatternFormatting();
        fill1.setFillBackgroundColor(IndexedColors.GREEN.index);
        fill1.setFillPattern(PatternFormatting.DIAMONDS);

        CellRangeAddress[] regions1 = { CellRangeAddress.valueOf("F2:F11"), CellRangeAddress.valueOf("G2:G11"),
                CellRangeAddress.valueOf("H2:H11") };

        sheetCF.addConditionalFormatting(regions1, rule1);

    }
}


