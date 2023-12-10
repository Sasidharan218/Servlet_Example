package com.kgisl.qs1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;

public class Folder {
    public static void main(String[] args) throws IOException {
        File source = new File("D:\\Source\\Java");
        File target = new File("D:\\Target");
        copyFolder(source, target);
    }

    private static void copyFolder(File source, File target) throws IOException {

        if (source.isDirectory()) {
            if (!target.exists()) {
                target.mkdir();
                System.out.println("Directory created :: " + target);
            }

            String files[] = source.list();

            for (String s : files)
            {
            File srcFile = new File(source, s);
            File destFile = new File(target, s);
            copyFolder(srcFile, destFile);
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println(srcFile+" "+srcFile.lastModified());
            }
            // for (String var : files) {

            //     String path="D:\\Source\\Java\\"+var;
   
                
            //     File file = new File(path);

            //     //System.out.println("Before Format : " + file.lastModified());

            //     SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            //     System.out.println(path+"is created at " + sdf.format(file.lastModified()));

            // }
        } else {
            Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied :: " + target);
        }
    }
}