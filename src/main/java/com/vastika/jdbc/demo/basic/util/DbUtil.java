package com.vastika.jdbc.demo.basic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    public static final String Driver_Name = "com.mysql.cj.jdbc.Driver";
    public static final String Db_URL = "jdbc:mysql://localhost:3306/jdbc_demo_db";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root1234";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(Driver_Name);
        return DriverManager.getConnection(Db_URL, USER_NAME, PASSWORD);
    }

}