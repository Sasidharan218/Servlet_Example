package com.kgisl.qs1;

import java.util.*;
import java.sql.*;
import java.util.ArrayList;

public class JDBC_withObject 
{    
   public static void main(String[] args) {
      List <Student> al= new ArrayList<Student>();
       try (
                     // Step 1: Allocate a database 'Connection' object
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");   // For MySQL only
                    //  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root",""); The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
 
                // Step 2: Allocate a 'Statement' object in the Connection
         Statement stmt = conn.createStatement();
      )
      
      {
                     // Step 3: Execute a SQL SELECT query. The query result is returned in a 'ResultSet' object.
         String strSelect = "select id,name,dept,cgpa,phone from student_table";
         System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
 
         ResultSet rset = stmt.executeQuery(strSelect);
 
                 // Step 4: Process the ResultSet by scrolling the cursor forward via next().
                //  For each row, retrieve the contents of the cells with getXxx(columnName).
               //  List <Student> al= new ArrayList<Student>();
         System.out.println("The records selected are:\n");
         int rowCount = 0;
         while(rset.next()) {  
                // Move the cursor to the next row, return false if no more row
            int id =rset.getInt("id");
            String name = rset.getString("name");
            String dept = rset.getString("dept");
            float cgpa =rset.getFloat("cgpa");
            int    phone   = rset.getInt("phone");
            // System.out.println(id+"   "+name + "    " + dept + "      " + phone);
            al.add(new Student(id,name,dept,cgpa, phone));
            ++rowCount;
         }
         System.out.println("\nTotal number of records = " + rowCount);
         System.out.println("To print the array list :\n");
         al.forEach(System.out::println);
 
      } 
      catch(SQLException ex) 
      {
         ex.printStackTrace();
      } 
            // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)
   }
}