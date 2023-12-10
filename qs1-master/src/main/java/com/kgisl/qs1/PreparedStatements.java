package com.kgisl.qs1;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;


/**
 * CRUD_DB
 */
public class PreparedStatements {
    Connection connection = null;
    // BasicDataSource bdSource = new BasicDataSource();
    MysqlDataSource bdSource = new MysqlDataSource();

    PreparedStatements() {
        // Set dataSource Properties

        // bdSource.setDriverClassName("com.mysql.jdbc.Driver");
        // bdSource.setUrl("jdbc:mysql://localhost:3306/giriprasath");
        // bdSource.setUsername("root");
        // bdSource.setPassword("");

        bdSource.setServerName("localhost");
        bdSource.setPortNumber(3306);
        bdSource.setDatabaseName("student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
        bdSource.setUser("root");
        bdSource.setPassword("");

    }

    public static void main(String[] args) throws SQLException {
       
       display();
        insert();
         display();
    }

    public static void display() throws SQLException {
        PreparedStatements dsExample = new PreparedStatements();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("Name- " + rs.getString("Name") + ", RollNo- " + rs.getInt("RollNo") + ", Dept- "
                    + rs.getString("Course") + ", Address- " + rs.getString("Address"));
        }
        rs.close();
        stmt.close();
        con.close();

    }

    public static void insert() throws SQLException {
    String query = "insert into student (RollNo,Name,Course,Address)" + "values(?,?,?,?)";
    PreparedStatements dsExample = new PreparedStatements();
    Connection con = dsExample.createConnection();
    PreparedStatement prstm=con.prepareStatement(query);
    List<Stu_DB> al = new ArrayList<Stu_DB>();
    al.add(new Stu_DB(11,"AAA","CfgSE","XXdcxsX"));
    al.add(new Stu_DB (12,"AjA","CStgE","XcsXX"));  
    al.add(new Stu_DB (13,"AjhgAA","CfgSE","XccssaXX"));
    al.add(new Stu_DB (14,"bdbAAA","CdfggSE","XXdfsX"));
    al.add(new Stu_DB (15,"dbdb","CSdgfdgE","XXXhh"));
    al.add(new Stu_DB(16,"AAzfbdA","CSsdreE","XXX"));


       int i=1;
    for (Stu_DB var : al) 
    {
       prstm.setInt(1,var.getRollNo());
       prstm.setString(2, var.getName());
       prstm.setString(3, var.getCourse());
       prstm.setString(4, var.getAddress());
       i+=prstm.executeUpdate();
       System.out.println(i);
    }
 
    System.out.println(i);
   }

    

       


    private Connection createConnection() 
    {
        Connection con = null;
        try {

            con = bdSource.getConnection();
        } catch (Exception e) {
            System.out.println("Error Occured " + e.toString());
        }
        return con;
    }
}