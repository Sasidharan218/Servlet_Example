package com.kgisl.qs1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSources
{
    Connection connection = null;
    BasicDataSource bdSource = new BasicDataSource();

                public DataSources()
                {
                    // bdSource.setDriverClassName("com.mysql.jdbc.Driver");
                    //bdSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); //updation @ add cj to mysql
                    bdSource.setUrl("jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
                    bdSource.setUsername("root");
                    bdSource.setPassword("");
                }

    public Connection createConnection()
    {
        Connection con = null;
        try
        {
                if (connection != null)
                {
                    System.out.println("Cant create a New Connection");
                }
                else
                {
                    con = bdSource.getConnection();
                    System.out.println("Connection Done successfully");
                }
        }
        catch (Exception e)
        {
            System.out.println("Error Occured " + e.toString());
        }
        return con;
    }

    public static void main(String args[]) throws Exception
    {
                    DataSources dsExample = new DataSources();
                    Connection con = dsExample.createConnection();
                    Statement stmt = con.createStatement();
                    String query = "select id,name,dept,cgpa,phone from student_table";
                    ResultSet rs = stmt.executeQuery(query);
                    System.out.println(query);
                    while (rs.next())
                    {
                        System.out.println(rs.getInt("id")+" "+ rs.getString("name") + " "+ rs.getString("dept") + " "+ rs.getFloat("cgpa") + " " + rs.getInt("phone"));
	}
		con.close();
		stmt.close();
		rs.close();
	}
}