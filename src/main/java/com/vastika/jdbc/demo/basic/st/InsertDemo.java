package com.vastika.jdbc.demo.basic.st;


import com.vastika.jdbc.demo.basic.util.DbUtil;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {


    public static final String SQL = "insert into user_tbl(user_name, password) values('ram','aa@123')";

    public static void main(String[] args) {

        try(
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            //4. execute the query
            st.executeUpdate(SQL);
            System.out.println("table data inserted.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}