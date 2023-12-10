package com.kgisl.excel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;


/**
 * CRUD_DB
 */
public class CRUD_DB {
    Connection connection = null;
    // BasicDataSource bdSource = new BasicDataSource();
    MysqlDataSource bdSource = new MysqlDataSource();

    CRUD_DB() {
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
        delete();
        display();
        insert();
        display();
        update();
        display();
    }

    public static void display() throws SQLException {
        CRUD_DB dsExample = new CRUD_DB();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) 
        {
            System.out.println("Name- " + rs.getString("Name") + ", RollNo- " + rs.getInt("RollNo") + ", Dept- "
                    + rs.getString("Course") + ", Address- " + rs.getString("Address"));
        }
        rs.close();
        stmt.close();
        con.close();

    }

    public static void insert() throws SQLException {
        String query = "insert into student values (106,'KALA','EIE','ERODE')";
        System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
        CRUD_DB dsExample = new CRUD_DB();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        int countInserted = stmt.executeUpdate(query);
        System.out.println(countInserted + " records inserted.\n");

        stmt.close();
        con.close();
    }

    public static void delete() throws SQLException {
        String query = "delete from student where RollNo =104";
        System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
        CRUD_DB dsExample = new CRUD_DB();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        int countDeleted = stmt.executeUpdate(query);
        System.out.println(countDeleted + " records deleted.\n");

        stmt.close();

    }

    public static void update() throws SQLException {
        String query = "update student set Name='Krishnan U' where RollNo =101";
        System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
        CRUD_DB dsExample = new CRUD_DB();
        Connection con = dsExample.createConnection();
        Statement stmt = con.createStatement();
        int countDeleted = stmt.executeUpdate(query);
        System.out.println(countDeleted + " records updated.\n");

        stmt.close();

    }

    private Connection createConnection() {
        Connection con = null;
        try {

            con = bdSource.getConnection();
        } catch (Exception e) {
            System.out.println("Error Occured " + e.toString());
        }
        return con;
    }
}