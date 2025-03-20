package com.ivoyant.main.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/STUDENTS";
        String uname = "root";
        String pass = "tiger";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        String query="UPDATE STUDENT SET MARKS=? WHERE SNAME='AMULYA'";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,uname,pass);
            PreparedStatement pr=con.prepareStatement(query);
            pr.setInt(1,marks);
            pr.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}


