
package com.vastika.jdbc.demo.basic.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

    public static final String Driver_Name = "com.mysql.cj.jdbc.Driver";
    public static final String Db_URL = "jdbc:mysql://localhost:3306/jdbc_demo_db";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root1234";
    public static final String SQL = "create table user_tbl(id int not null auto_increment, user_name varchar(45), password varchar(45), primary key(id))";

    public static void main(String[] args) {

        try(
                Connection con = DriverManager.getConnection(Db_URL, USER_NAME, PASSWORD);
                Statement st = con.createStatement();
        ) {

            //4. execute the query
            st.executeUpdate(SQL);
            System.out.println("table created.");
        } catch ( SQLException e) {
            e.printStackTrace();
        }
    }
}