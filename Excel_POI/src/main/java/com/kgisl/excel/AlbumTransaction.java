package com.kgisl.excel;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * AlbumTransaction
 */
public class AlbumTransaction {

    // ArrayList<Album> albumList = new ArrayList<Album>();
    public static void main(String[] args) throws SQLException {
        insert();
        display();
        edit();
        display();
        delete();
        display(); 

    }

    public static <Album> void display() throws SQLException {
        String query = "SELECT * FROM album";
        
        List<Object> list = MysqlConnect.getDbCon().resultSetToArrayList(query);
        // list.forEach(System.out::println);

        // List<CustomClass> list = (List<CustomClass>)(List<?>)getObjects();
        List<Album> albumList = (List<Album>) (List<?>) list;
        albumList.forEach(System.out::println);

    }

    public static void insert() {
        // INSERT INTO `album`(`id`, `title`, `author`, `price`, `qty`, `releasedate`)
        // VALUES (5,"title5", "author5", 500, 50, "2017-05-26");

        // 5,"title5", "author5", 500, 50, "2017-05-26"

        int id = 6;
        String title = "title6";
        String author = "author6";
        float price = 600;
        int qty = 60;
        LocalDate releasedate;
        releasedate = LocalDate.of(2015, 06, 26);

        String query = "INSERT INTO album (id, title, author,price,qty,releasedate) VALUES (" + id + ",'" + title + "','"+author+"',"+ price+","+ qty+",'"+releasedate+"')";
        System.out.println(query);
        try {
            int rs = MysqlConnect.getDbCon().insert(query);
            System.out.println("the no of rows inserted   " + rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void edit()
    {

        String query = "update album set author='Krishnan U' where id=6";
        System.out.println(query);
        try {
            int rs = MysqlConnect.getDbCon().insert(query);
            System.out.println("the no of rows edited   " + rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

    }
    public static void delete() throws SQLException {
        String query = "delete from album where id =4";
        System.out.println(query);
        try {
            int rs = MysqlConnect.getDbCon().insert(query);
            System.out.println("the no of rows deleted   " + rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    






}




