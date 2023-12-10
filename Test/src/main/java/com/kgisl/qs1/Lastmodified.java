package com.kgisl.qs1;

import java.io.*;
import java.text.SimpleDateFormat;

/**
 * Lastmodified
 */
public class Lastmodified {

    public static void main(String[] args) {
       
            File f1 = new File("D:\\ABC\\Java.xlsx");
          
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("After Format : " + sdf.format(f1.lastModified()));
    }
}