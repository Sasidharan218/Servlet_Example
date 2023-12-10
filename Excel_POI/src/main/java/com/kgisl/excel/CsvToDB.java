// package com.kgisl.excel;

// import java.util.*;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;

// import com.opencsv.CSVReader;
// import com.mysql.cj.jdbc.MysqlDataSource;

// /**
//  * CRUD_DB
//  */
// public class CsvToDB 
// {
//     Connection connection = null;
//     // BasicDataSource bdSource = new BasicDataSource();
//     MysqlDataSource bdSource = new MysqlDataSource();

//     CsvToDB() 
//     {
//         // Set dataSource Properties

//         // bdSource.setDriverClassName("com.mysql.jdbc.Driver");
//         // bdSource.setUrl("jdbc:mysql://localhost:3306/giriprasath");
//         // bdSource.setUsername("root");
//         // bdSource.setPassword("");

//         bdSource.setServerName("localhost");
//         bdSource.setPortNumber(3306);
//         bdSource.setDatabaseName("student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
//         bdSource.setUser("root");
//         bdSource.setPassword("");

//     }

//     public static void main(String[] args) throws SQLException, IOException 
//     {

//        display();
//         insert();
//         System.out.println("after insertion :");
//         display();

//     }

//     public static void display() throws SQLException
//      {
//         CsvToDB dsExample = new CsvToDB();
//         Connection con = dsExample.createConnection();
//         Statement stmt = con.createStatement();
//         String query = "SELECT * FROM employee1";
//         ResultSet rs = stmt.executeQuery(query);
//         while (rs.next()) 
//         {
//             System.out.println( "RollNo- " + rs.getInt("id") + ", Name- " + rs.getString("name") +", Age- "
//                     + rs.getString("age") + ", Country- " + rs.getString("country"));
//         }
//         rs.close();
//         stmt.close();
//         con.close();

//     }

//     public static void insert() throws SQLException, FileNotFoundException 
//     {
//         String query = "insert into employee1 (id,name,age,country)" + "values(?,?,?,?)";
//         CsvToDB dsExample = new CsvToDB();
//         Connection con = dsExample.createConnection();
//         PreparedStatement prstm = con.prepareStatement(query);

        
// 		CSVReader reader = new CSVReader(new FileReader("D:\\krishna\\New folder\\1234\\emps.csv"), ',');
        
//         List<Employee> emps = new ArrayList<Employee>();
// 		//read line by line
// 		String[] record = null;

//         try {
//             while ((record = reader.readNext()) != null) {
//                 Employee emp = new Employee();
//                 emp.setId(record[0]);
//                 emp.setName(record[1]);
//                 emp.setAge(record[2]);
//                 emp.setCountry(record[3]);
//                 emps.add(emp);
//             }
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//             int i=1;
//             for (Employee    var : emps)
//             {   
//             prstm.setString(1, var.getId());
//             prstm.setString(2, var.getName());
//             prstm.setString(3, var.getAge());
//             prstm.setString(4, var.getCountry());
//             i+=prstm.executeUpdate();
// 		    }
         
//             System.out.println(i);
//             System.out.println(emps);
		
//             try {
//             reader.close();
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
      
//         } 
        

	
//         private Connection createConnection()
//         {
//             Connection con = null;
//             try
//             {
    
//                 con = bdSource.getConnection();
//             } 
//             catch (Exception e) 
//             {
//                 System.out.println("Error Occured " + e.toString());
//             }
//             return con;
       
//     }
// }
  