// package com.kgisl.excel;
// import java.io.IOException;
// import java.io.StringWriter;
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;
// import com.opencsv.CSVWriter;
// public class OpenCSVWriterExample
// {

// 	public static void main(String[] args) throws IOException {
// 		StringWriter writer = new StringWriter();
		
// 		//using custom delimiter and quote character
// 		CSVWriter csvWriter = new CSVWriter(writer, '#', '\'');

// 		List<Employee> emps = OpenCSVParseToBeanExample.parseCSVWithHeader();

// 		List<String[]> data = toStringArray(emps);

// 		csvWriter.writeAll(data);

// 		csvWriter.close();
		
// 		System.out.println(writer);

// 	}

// 	private static List<String[]> toStringArray(List<Employee> emps) {
// 		List<String[]> records = new ArrayList<String[]>();

// 		// adding header record
// 		records.add(new String[] { "ID", "Name", "Age", "Country" });

// 		Iterator<Employee> it = emps.iterator();
// 		while (it.hasNext()) {
// 			Employee emp = it.next();
// 			records.add(new String[] { emp.getId(), emp.getName(), emp.getAge(), emp.getCountry() });
// 		}
// 		return records;
// 	}

// }






















// // package com.kgisl.qs1;

// // import java.io.FileReader;
// // import java.io.IOException;
// // import java.io.StringWriter;
// // import java.util.ArrayList;
// // import java.util.Iterator;
// // import java.util.List;

// // import com.kgisl.qs1.Employee;
// // import com.opencsv.CSVReader;
// // import com.opencsv.CSVWriter;
// // import com.opencsv.bean.CsvToBean;
// // import com.opencsv.bean.HeaderColumnNameMappingStrategy;

// // public class OpenCSVWriterExample {

// // 	public static void main(String[] args) throws IOException {
// // 		StringWriter writer = new StringWriter();
		
// // 		//using custom delimiter and quote character
// // 		CSVWriter csvWriter = new CSVWriter(writer, '#', '\'');

// // 		List<Employee> emps = OpenCSVParseToBeanExample.parseCSVWithHeader();

// // 		List<String[]> data = toStringArray(emps);

// // 		csvWriter.writeAll(data);

// // 		csvWriter.close();
		
// // 		System.out.println(writer);

// // 	}

// // 	private static List<String[]> toStringArray(List<Employee> emps) {
// // 		List<String[]> records = new ArrayList<String[]>();

// // 		// adding header record
// // 		records.add(new String[] { "ID", "Name", "Age", "Country" });

// // 		Iterator<Employee> it = emps.iterator();
// // 		while (it.hasNext()) {
// // 			Employee emp = it.next();
// // 			records.add(new String[] { emp.getId(), emp.getName(), emp.getAge(), emp.getCountry() });
// // 		}
// // 		return records;
// // 	}


// // //-------------------------------------------------
// // public static List<Employee> parseCSVWithHeader() throws IOException {
// // 	CSVReader reader = new CSVReader(new FileReader("D://Krishnan_Maven/qs1-master/src/main/java/com/kgisl/qs1/emps1.csv"), ',');
	
// // 	HeaderColumnNameMappingStrategy<Employee> beanStrategy = new HeaderColumnNameMappingStrategy<Employee>();
// // 	beanStrategy.setType(Employee.class);
	
// // 	CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
// // 	List<Employee> emps = csvToBean.parse(beanStrategy, reader);
	
// // 	System.out.println(emps);
// // 	reader.close();
	
// // 	return emps;
// // }
// // }