package com.kgisl.qs1;

// Java program to demonstrate the 
// use of listFiles() function 

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

  
public class MoveSpecific {
    public static void main(String args[]) 
    { 
  
        // try-catch block to handle exceptions 
        try { 
  
            // Create a file object 
            File f = new File("D:\\Source\\Java"); 
  
            // Create a FileFilter 
            FileFilter filter = new FileFilter() { 
  
                public boolean accept(File f) 
                { 
                    return f.getName().endsWith("txt"); 
                } 
            }; 
  
            // Get all the names of the files present 
            // in the given directory 
            // which are text files 
            File[] files = f.listFiles(filter); 
  
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i].getName()); 
            } 
            Scanner in = new Scanner(System.in);
            System.out.println("Folder name");
            String temp=in.next();
            String S="D:\\"+temp;
            System.out.println("Created Folder for  specific Extension"+S);
            File target = new File(S);
            target.mkdir();
            System.out.println("Directory created :: " + target);
            
            
            FileSystem fileSys = FileSystems.getDefault();
            Path srcPath = fileSys.getPath("D:\\Source\\Java\\java.xlsx");
            Path destPath = fileSys.getPath(S);
            Files.copy(srcPath,destPath, StandardCopyOption.REPLACE_EXISTING);





        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
    } 
} 