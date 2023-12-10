// package com.kgisl.excel;

// /**
//  * ABC
//  */
// public class ABC 
// {


//     public static void writeDataForCustomSeperatorCSV(String filePath) 
//     { 
    
//         // first create file object for file placed at location 
//         // specified by filepath 
//         File file = new File(filePath); 
    
//         try { 
//             // create FileWriter object with file as parameter 
//             FileWriter outputfile = new FileWriter(file); 
    
//             // create CSVWriter with '|' as separator 
//             CSVWriter writer = new CSVWriter(outputfile, '|', 
//                                             CSVWriter.NO_QUOTE_CHARACTER, 
//                                             CSVWriter.DEFAULT_ESCAPE_CHARACTER, 
//                                             CSVWriter.DEFAULT_LINE_END); 
    
//             // create a List which contains String array 
//             List<String[]> data = new ArrayList<String[]>(); 
//             data.add(new String[] { "Name", "Class", "Marks" }); 
//             data.add(new String[] { "Aman", "10", "620" }); 
//             data.add(new String[] { "Suraj", "10", "630" }); 
//             writer.writeAll(data); 
    
//             // closing writer connection 
//             writer.close(); 
//         } 
//         catch (IOException e) { 
//             // TODO Auto-generated catch block 
//             e.printStackTrace(); 
//         } 
//     } 
    
    
// }