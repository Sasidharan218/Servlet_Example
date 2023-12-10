package com.kgisl.excel;

import java.io.*;
import java.nio.file.*;
public class File_1toN {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fs = new FileInputStream("C://stock/stockIn.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        for (int i = 0; i < 4; i++)
            br.readLine();
        String s = br.readLine();

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