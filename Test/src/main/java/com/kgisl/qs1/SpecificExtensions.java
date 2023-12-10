package com.kgisl.qs1;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Scanner;

public class SpecificExtensions {
    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter extension which is to be sorted");
        final String s=in.next();

        System.out.println("Source Folder Reading .....");
        String path="D:\\Source\\Java";
        
        File fin = new File(path);
        
        String[] list = fin.list(new FilenameFilter() 
        {  
             @Override  
            public boolean accept(File dir, String name)   
            {
                if (name.toLowerCase().endsWith(s))
                {
                    return true;
                } 
                else 
                {
                    return false;
                }
            }
            
        });

        for (String s1 : list) 
        {
            System.out.println(s1);
        }
        System.out.println("Only above files "+s+" is in this folder : "+path);

        System.out.println("Folder name");
        String temp=in.next();
        String S="D:\\"+temp;
        System.out.println("Created Folder for  specific Extension"+S);
        File target = new File(S);
        target.mkdir();
        System.out.println("Directory created :: " + target);


       
      
    }
}
