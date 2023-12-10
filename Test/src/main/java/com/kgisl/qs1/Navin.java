package com.kgisl.qs1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Navin {
    public static void main(String[] args) throws IOException {
        FileReader file1 = new FileReader("D:\\Krishnan_Maven\\Test\\src\\main\\java\\com\\kgisl\\qs1\\File1.txt");
        FileReader file2 = new FileReader("D:\\Krishnan_Maven\\Test\\src\\main\\java\\com\\kgisl\\qs1\\File2.txt");
        BufferedReader reader1 = new BufferedReader(file1);
        BufferedReader reader2 = new BufferedReader(file2);
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        String record1 = null;
        while ((record1 = reader1.readLine()) != null) {
            String[] read1 = record1.split(" ");
            list1.add(read1[0]);
            list1.add(read1[1]);
            list1.add(read1[2]);
            list1.add(read1[3]);
        }
        String record2 = null;
        while ((record2 = reader2.readLine()) != null) {
            String[] read = record2.split(" ");
            list2.add(read[0]);
            list2.add(read[1]);
            list2.add(read[2]);
            list2.add(read[3]);
            //list2.add(read[4]);
        }
        System.out.println(list1);
       System.out.println(list2);
       String[] arr = list1.toArray(new String[0]);
       String[] arr1 = list2.toArray(new String[0]);
        
        for (int i = 0; i < arr.length; i++) 
      
            if (arr[i]==arr1[i])
            {
                System.out.println(arr[i]);
            }
            else
            {
                System.out.println(" Not "+arr1[i]);
            }
        
        }
            }
