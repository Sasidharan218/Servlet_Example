package com.kgisl.excel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

class A
{  
    // private void cube(String n)
    // {
    //     System.out.println(n);
    // }  


    public static Object[] cube(String path) throws FileNotFoundException
    {   
        CSVReader reader = new CSVReader(new FileReader(path), ',');
        ColumnPositionMappingStrategy<Project_Pojo> beanStrategy = new ColumnPositionMappingStrategy<Project_Pojo>();
        beanStrategy.setType(Project_Pojo.class);
        beanStrategy.setColumnMapping(new String[] { "id" , "UccCode", "TradeDate", "Scrip", "TradeType", "Quantity", "TradePrice" });
        CsvToBean<Project_Pojo> csvToBean = new CsvToBean<Project_Pojo>();
        List<Project_Pojo> emps = csvToBean.parse(beanStrategy, reader);
        System.out.println("CSV to List : Trade");
       // System.out.println(emps);
        Object[] obj_arr1 = emps.toArray();
        // System.out.println("Object Array from List: "+Arrays.toString(obj_arr));
        System.out.println("Object Array from List: Trade");
        for (Object var : obj_arr1)
        {
            System.out.println(var);

        }
        return obj_arr1;

    }



}  