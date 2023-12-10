package com.kgisl.ebarter.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.sql.PreparedStatement;

import com.kgisl.ebarter.model.Brokerage;

public final class MysqlConnect {
    public Connection conn;
    private Statement statement;
    public static MysqlConnect db;
    public static Object getDbCon;
    

    private MysqlConnect() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "ebarter";
        // String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            // Class.forName(driver).newInstance();
            this.conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized MysqlConnect getDbCon() {
        if (db == null) {
            db = new MysqlConnect();
        }
        return db;

    }

    /**
     *
     * @param query String The query to be executed
     * @return a ResultSet object containing the results or null if not available
     * @throws SQLException
     */
    public ArrayList<Object> resultSetToArrayList(String query) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet rs = statement.executeQuery(query);

        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();

        ArrayList<Object> list = new ArrayList<Object>();
        while (rs.next()) {

            HashMap<Object, Object> row = new HashMap<>(columns);
            for (int i = 1; i <= columns; ++i) {
                row.put(md.getColumnName(i), rs.getObject(i));
            }
            list.add(row);

        }

        return list;
    }
    public  ResultSet getResultSet(String query) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public static void insertTrades(List<Brokerage> tradeList) throws SQLException
   {
    //    String query = "insert into employee1 (id,name,age,country)" + "values(?,?,?,?)";
       String query ="INSERT INTO trade(Id, Ucccode, Scrip, TradeDate, TradeType, Quantity, TradePrice) " + "values(?,?,?,?,?,?,?)";
       Connection con = db.conn;
       PreparedStatement prstm = con.prepareStatement(query);
           int i=1;
           for (Brokerage    var : tradeList)
           {
           prstm.setInt(1, var.getId());
           prstm.setString(2, var.getUcccode());
           prstm.setString(3, var.getScrip());
           prstm.setString(4, var.getTradedate());
           prstm.setString(5, var.getTradetype());
           prstm.setLong(6, var.getQuantity());
           prstm.setDouble(7, var.getPrice());
           i+=prstm.executeUpdate();
            }

        //    System.out.println(i);
        //    System.out.println(emps);
       }

    public boolean noOfRows(String selectQuery) throws SQLException {
        boolean status = false;
        statement = db.conn.createStatement();

        ResultSet rs = statement.executeQuery(selectQuery);
        int rows = 0;
        rs.last();
        rows = rs.getRow();
        rs.beforeFirst();

        if (rows > 0) {
            status = true;
        } else {
            status = false;
        }
        System.out.println("MysqlConnect status " + status);
        return status;

    }

    /**
     * @desc Method to insert data to a table
     * @param insertQuery String The Insert query
     * @return boolean
     * @throws SQLException
     */
    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        System.out.println("valueof"+result);
        return result;

    }

    public int edit(String editQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(editQuery);
        return result;

    }

    public int delete(String deleteQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(deleteQuery);
        return result;

    }
}