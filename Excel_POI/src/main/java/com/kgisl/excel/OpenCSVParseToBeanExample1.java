package com.kgisl.excel;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

/**
 * OpenCSVParseToBeanExample1
 */
public class OpenCSVParseToBeanExample1 {
    public static List<Employee> parseCSVWithHeader() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("D://Krishnan_Maven/qs1-master/src/main/java/com/kgisl/qs1/emps1.csv"), ',');
        
        HeaderColumnNameMappingStrategy<Employee> beanStrategy = new HeaderColumnNameMappingStrategy<Employee>();
        beanStrategy.setType(Employee.class);
        
        CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
        List<Employee> emps = csvToBean.parse(beanStrategy, reader);
        
        System.out.println(emps);
        reader.close();
        
        return emps;
    }
    
}