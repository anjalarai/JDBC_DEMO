package com.vastika.jdbc.demo.basic.ps;

import com.vastika.jdbc.demo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

    public static final String SQL = "update user_tbl set user_name = ?, password = ? where id = ?";

    public static void main(String[] args) {

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1,"ramesh");
            ps.setString(2, "heelo123");
            ps.setInt(3, 1);
            ps.executeUpdate();
            System.out.println("table data updated.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}