// package com.kgisl.excel;
// import java.io.IOException;
// import java.io.Reader;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.*;
// import java.util.Scanner;
// import com.opencsv.bean.ColumnPositionMappingStrategy;
// import com.opencsv.bean.CsvToBean;
// import com.opencsv.bean.CsvToBeanBuilder;

// public class demo115 {

//     public static void main(String[] args) throws IOException {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Type Trade or Bhav which is to be created:");
//         String s = in.next();
//         switch (s) {
//         case "Trade":
//             TradecsvtoBean(dir);
//             break;
//         case "Bhav":
//             BhavcopycsvtoBean("D:\\Krishnan_Maven\\Excel_POI\\src\\main\\java\\com\\kgisl\\excel\\Bhavcopy.csv");
//             break;
//         default:
//             break;
//         }

//     }

//     public static Object[] TradecsvtoBean(String path) throws IOException {
//         try (Reader reader = Files.newBufferedReader(Paths.get(path));) {
//             ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
//             strategy.setType(Project_Pojo.class);
//             String[] emps = { "id", "UccCode", "TradeDate", "Scrip", "TradeType", "Quantity", "TradePrice" };
//             strategy.setColumnMapping(emps);
//             CsvToBean<Project_Pojo> csvToBean = new CsvToBeanBuilder(reader).withMappingStrategy(strategy)
//             .withSkipLines(1).build();
//             List<Project_Pojo> al = csvToBean.parse(strategy, reader);
//             Object[] obj_arr1 = al.toArray();
//             System.out.println("Object Array from List: Trade");
//             for (Object var : obj_arr1) {
//                 System.out.println(var);

//             }
//             return obj_arr1;

//         }
//     }

//     public static Object[] BhavcopycsvtoBean(String path) throws IOException {
//         try (Reader reader = Files.newBufferedReader(Paths.get(path));) {
//             ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
//             strategy.setType(Bhav_Pojo.class);
//             String[] emps = { "TradeDate", "Scrip", "ClosingPrice" };
//             strategy.setColumnMapping(emps);
//             CsvToBean<Bhav_Pojo> csvToBean = new CsvToBeanBuilder(reader).withMappingStrategy(strategy).withSkipLines(0)
//             .withIgnoreLeadingWhiteSpace(true).build();
//             List<Bhav_Pojo> al = csvToBean.parse(strategy, reader);
//             Object[] obj_arr1 = al.toArray();
//             System.out.println("Object Array from List: Trade");
//             for (Object var : obj_arr1) {
//                 System.out.println(var);

//             }
//             return obj_arr1;

//         }
//     }
// }
