package com.ivoyant.main.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ps {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/STUDENTS";
        String uname = "root";
        String pass = "tiger";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter Student id");
            int sid = sc.nextInt();
            System.out.println("Enter student name");
            String sname = sc.next();
            System.out.println("Enter the Student marks");
            int marks = sc.nextInt();
//        ?-> represents the placeholder holds single data
            String query = "INSERT INTO STUDENT VALUES(?,?,?)";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, uname, pass);
//            PreparedStatement is an interface which extends Statement Interface
                PreparedStatement pr = con.prepareStatement(query);
                pr.setInt(1, sid);
                pr.setString(2, sname);
                pr.setInt(3, marks);
                pr.executeUpdate();
                con.close();
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
