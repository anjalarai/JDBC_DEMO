package com.vastika.jdbc.demo.basic.st;


import com.vastika.jdbc.demo.basic.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name = 'ramesh', password = 'tt@*3123' where id = 4";

    public static void main(String[] args) {

        try(
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            //4. execute the query
            st.executeUpdate(SQL);
            System.out.println("table data updated.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}