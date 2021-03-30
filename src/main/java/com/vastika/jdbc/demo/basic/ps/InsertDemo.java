package com.vastika.jdbc.demo.basic.ps;


import com.vastika.jdbc.demo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {


    public static final String SQL = "insert into user_tbl(user_name, password) values(?, ?)";

    public static void main(String[] args) {

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "raju");
            ps.setString(2, "hiiiihi");
            //4. execute the query
            ps.executeUpdate();
            System.out.println("table data inserted.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}