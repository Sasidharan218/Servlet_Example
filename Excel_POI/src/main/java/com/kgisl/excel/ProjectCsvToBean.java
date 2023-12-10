package com.kgisl.excel;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

public class ProjectCsvToBean {

    public static void main(String[] args) throws IOException
    {
        
    }

    public static Object[] TradecsvtoBean(String path) throws FileNotFoundException
    {   
        CSVReader reader = new CSVReader(new FileReader(path), ',');
        ColumnPositionMappingStrategy<Project_Pojo> beanStrategy = new ColumnPositionMappingStrategy<Project_Pojo>();
        beanStrategy.setType(Project_Pojo.class);
        beanStrategy.setColumnMapping(new String[] { "id" , "UccCode", "TradeDate", "Scrip", "TradeType", "Quantity", "TradePrice" });
        CsvToBean<Project_Pojo> csvToBean = new CsvToBean<Project_Pojo>();
        List<Project_Pojo> emps = csvToBean.parse(beanStrategy, reader);
        System.out.println("CSV to List : Trade");
        System.out.println(emps);
        Object[] obj_arr1 = emps.toArray();
        // System.out.println("Object Array from List: "+Arrays.toString(obj_arr));
        System.out.println("Object Array from List: Trade");
        for (Object var : obj_arr1)
        {
            System.out.println(var);

        }
        return obj_arr1;

    }

    public static Object[] BhavcopycsvtoBean(String path) throws FileNotFoundException {
        CSVReader reader1 = new CSVReader(new FileReader(path), ',');
        ColumnPositionMappingStrategy<Bhav_Pojo> beanStrategy1 = new ColumnPositionMappingStrategy<Bhav_Pojo>();
        beanStrategy1.setType(Bhav_Pojo.class);
        beanStrategy1.setColumnMapping(new String[] { "TradeDate", "Scrip", "ClosingPrice" });
        CsvToBean<Bhav_Pojo> csvToBean = new CsvToBean<Bhav_Pojo>();
        List<Bhav_Pojo> bhav = csvToBean.parse(beanStrategy1, reader1);
        System.out.println("CSV to List : Trade");
        System.out.println(bhav);
        
        Object[] obj_arr2 = bhav.toArray();
        // System.out.println("Object Array from List: "+Arrays.toString(obj_arr));
        System.out.println("Object Array from List:Bhav Copy ");
        for (Object var : obj_arr2)
        {
            System.out.println(var);

        }
        return obj_arr2;

    }

}
