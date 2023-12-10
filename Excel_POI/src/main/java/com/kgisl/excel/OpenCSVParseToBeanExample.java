
package com.kgisl.excel;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

public class OpenCSVParseToBeanExample {

	public static void main(String[] args) throws IOException {
		
		CSVReader reader = new CSVReader(new FileReader("D:\\Krishnan_Maven\\Excel_POI\\src\\main\\java\\com\\kgisl\\excel\\emps.csv"), ',');
		
		ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
		beanStrategy.setType(Employee.class);
		beanStrategy.setColumnMapping(new String[] {"UccCode", "TradeDate", "Scrip"," TradeType", "Quantity", "TradePrice"});
		
		CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
		
		List<Employee> emps = csvToBean.parse(beanStrategy, reader);
		
		System.out.println(emps);
		
	}

	public static List<Employee> parseCSVWithHeader() {
		return null;
	}
}
