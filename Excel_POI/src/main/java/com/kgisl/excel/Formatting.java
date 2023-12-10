package com.kgisl.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.hssf.record.cf.PatternFormatting;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Voidformatting
 */
public class Formatting {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Employee datas");
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();
        data.put("1", new Object[] { "ID", "NAME", "LASTNAME", "M1", "M2", "M3" });
        data.put("2", new Object[] { 1, "Amit", "Shukla", 10, 20, 30 });
        data.put("3", new Object[] { 2, "Lokesh", "Gupta", 15, 25, 35 });
        data.put("4", new Object[] { 3, "John", "Adwards", 20, 30, 40 });
        data.put("5", new Object[] { 4, "Brian", "Schultz", 30, 35, 45 });
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
            Cell totcell = row.createCell(row.getLastCellNum(), Cell.CELL_TYPE_NUMERIC);
            if (row.getRowNum() == 0) {
                totcell.setCellValue("Total");
            } else {
                double m1 = row.getCell(3).getNumericCellValue();
                double m2 = row.getCell(4).getNumericCellValue();
                double m3 = row.getCell(5).getNumericCellValue();
                totcell.setCellValue(m1 + m2 + m3);

            }
        }
        try {
            ConditionalFormattingRule rule2 = sheetCF.createConditionalFormattingRule(
                    org.apache.poi.hssf.record.CFRuleRecord.ComparisonOperator.LT, "70");
            org.apache.poi.ss.usermodel.PatternFormatting fill2 = rule2.createPatternFormatting();
            fill2.setFillBackgroundColor(IndexedColors.RED.index);
            fill2.setFillPattern(PatternFormatting.SOLID_FOREGROUND);
            CellRangeAddress[] regions = { CellRangeAddress.valueOf("D1:D5"), CellRangeAddress.valueOf("E1:E5"),
                    CellRangeAddress.valueOf("F1:F5") };
            sheetCF.addConditionalFormatting(regions, rule2);

            FileOutputStream out = new FileOutputStream(new File("formattingexcel.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("File written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
