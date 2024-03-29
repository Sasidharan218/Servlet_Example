package com.kgisl.excel;

//import com.kgisl.qs1.Developer;

import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CVSUtilExample {

    public static void main(String[] args) throws Exception {

        String csvFile = "D://Krishnan_Maven/qs1-master/src/main/java/com/kgisl/qs1/create.csv";
        FileWriter writer = new FileWriter(csvFile);

        List<Developer> developers = Arrays.asList(
                new Developer("Krishnan", new BigDecimal(120500), 32),
                new Developer("Harish", new BigDecimal(150099), 5),
                new Developer("Amirtha Varshini", new BigDecimal(99999), 99));

        //for header
        CSVUtils.writeLine(writer, Arrays.asList("Name", "Salary", "Age"));
		
        for (Developer d : developers) {

            List<String> list = new ArrayList<>();
            list.add(d.getName());
            list.add(d.getSalary().toString());
            list.add(String.valueOf(d.getAge()));

            CSVUtils.writeLine(writer, list);

			//try custom separator and quote. 
			//CSVUtils.writeLine(writer, list, '|', '\"');
        }

        writer.flush();
        writer.close();

    }

}