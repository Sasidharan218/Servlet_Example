package com.kgisl.excel;

import java.io.*;

public class File_Read_Using_Buffer {
   public static void main(String[] args) throws Exception {
       File f = new File("C://stock/stockIn.txt");
       BufferedReader br = new BufferedReader(new FileReader(f));
       String s;
       

       while ((s = br.readLine()) != null) {
           System.out.println(s);
       }

       String str = "File writing here";
       FileWriter fw = new FileWriter("C://stock/StockOut.txt");
       for (int i = 0; i < str.length(); i++) {
           fw.write(str);
           System.out.println("Successfully written..");
           fw.close();
       }
   }
}