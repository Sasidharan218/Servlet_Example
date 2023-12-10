// package com.kgisl.excel;

// import java.util.*;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.time.LocalDate;

// import com.mysql.cj.jdbc.MysqlDataSource;

// /**
//  * CRUD_DB
//  */
// public class DateInsert {
//     Connection connection = null;
//     // BasicDataSource bdSource = new BasicDataSource();
//     MysqlDataSource bdSource = new MysqlDataSource();

//     DateInsert() {
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

//     public static void main(String[] args) throws SQLException {
       
//         display();
//         insert();
//         display();
//     }

//     public static void display() throws SQLException {
//         DateInsert dsExample = new DateInsert();
//         Connection con = dsExample.createConnection();
//         Statement stmt = con.createStatement();
//         String query = "SELECT * FROM student";
//         ResultSet rs = stmt.executeQuery(query);
//         while (rs.next()) {
//             System.out.println("Name- " + rs.getString("Name") + ", RollNo- " + rs.getInt("RollNo") + ", Dept- "
//                     + rs.getString("Course") + ", Address- " + rs.getString("Address"));
//         }
//         rs.close();
//         stmt.close();
//         con.close();

//     }

//     public static void insert() throws SQLException {
//         String query = "insert into student (RollNo,Name,Course,Address,Date)" + "values(?,?,?,?,?)";
//         DateInsert dsExample = new DateInsert();
//         Connection con = dsExample.createConnection();
//         PreparedStatement prstm = con.prepareStatement(query);
       
//         List<DatePojo> al = new ArrayList<DatePojo>();
//         al.add(new DatePojo(11, "AAA", "CfgSE", "XXdcxsX", ));
//         System.out.println(al);

//         // int i = 1;
//         // for (DatePojo var : al) {
//         //     prstm.setInt(1, var.getRollNo());
//         //     prstm.setString(2, var.getName());
//         //     prstm.setString(3, var.getCourse());
//         //     prstm.setString(4, var.getAddress());

//         //     i += prstm.executeUpdate();
//         //     System.out.println(i);
//         // }

//     }

//     private Connection createConnection() {
//         Connection con = null;
//         try {

//             con = bdSource.getConnection();
//         } catch (Exception e) {
//             System.out.println("Error Occured " + e.toString());
//         }
//         return con;
//     }
// }