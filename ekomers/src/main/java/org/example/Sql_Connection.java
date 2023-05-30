package org.example;

import java.sql.*;

public class Sql_Connection {
    private Connection connection;
    public Sql_Connection() {
        Connection conn = null;
        try {
            this.connection = null;
            String url = "jdbc:sqlite:C:\\Users\\Dayu Shri\\IdeaProjects\\ekomers\\ecommerce.db";

            this.connection = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
}