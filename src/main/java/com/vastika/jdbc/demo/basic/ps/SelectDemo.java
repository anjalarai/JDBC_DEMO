package com.vastika.jdbc.demo.basic.ps;


import com.vastika.jdbc.demo.basic.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {


    //public static final String SQL = "select * from user_tbl";
    public static final String SQL = "select * from user_tbl where user_name = ? and password = ?";

    public static void main(String[] args) {

        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        ) {
            ps.setString(1, "raju");
            ps.setString(2, "hiiiihi");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(" ============ ");
                System.out.println("Id is: "+rs.getInt("id"));
                System.out.println("Name is: "+rs.getString("user_name"));
                System.out.println("Password is: "+rs.getString("password"));
                System.out.println(" ============ ");
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}