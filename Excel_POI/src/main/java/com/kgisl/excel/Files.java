// package com.kgisl.qs1;
// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.nio.file.Path;
// import java.nio.file.Paths;

// class Files 
// {
//        public static void main(String[] args)
//         {
//               try
//               {
//                      File stockInputFile = new File("D://krishna/New folder/1234/krish.txt");
//                      File StockOutputFile = new File("D://krishna/New folder/1234/krish1.txt");

//                      FileInputStream fis = new FileInputStream(stockInputFile);
//                      FileOutputStream fos = new FileOutputStream(StockOutputFile);
//                      int count;

//                      while ((count = fis.read()) != -1)
//                      {
//                             fos.write(count);
//                      }

//                      fis.close();
//                      fos.close();
//               }
//               catch (FileNotFoundException e)
//               {
//                      System.err.println("Files: " + e);
//               } 
//               catch (IOException e) 
//               {
//                      System.err.println("Files: " + e);
//               }
//        }

// 	public static Paths readAllLines(Path path) {
// 		return null;
// 	}

// 	public static Stream<String> lines(Path path) {
// 		return null;
// 	}
// }

