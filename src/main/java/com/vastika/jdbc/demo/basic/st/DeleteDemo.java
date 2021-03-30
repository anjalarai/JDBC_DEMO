package com.vastika.jdbc.demo.basic.st;

import com.vastika.jdbc.demo.basic.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

    public static final String SQL = "delete from user_tbl where id = 2";

    public static void main(String[] args) {

        try(
                Statement st = DbUtil.getConnection().createStatement();
        ) {
            //4. execute the query
            st.executeUpdate(SQL);
            System.out.println("table data deleted.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}