package com.vastika.jdbc.demo.basic.ps;

import com.vastika.jdbc.demo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {

    public static final String SQL = "delete from user_tbl where id = ?";

    public static void main(String[] args) {

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setInt(1,2);
            ps.executeUpdate();
            System.out.println("table data deleted.");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}