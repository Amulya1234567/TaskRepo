package com.ivoyant.main.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/STUDENTS";
        String uname="root";
        String pass="tiger";
        String query="INSERT INTO STUDENT VALUES(4,'ABHI',89)";
        try {
//            loading and registering the driverclass
            Class.forName("com.mysql.cj.jdbc.Driver");
//            establishing the connection between java and database
            Connection con= DriverManager.getConnection(url,uname,pass);
//            create a platform to execute the query
            Statement st=con.createStatement();
//            executing a query
            int res=st.executeUpdate(query);
//            generating the result
            System.out.println(res);
//            closing all costly resource
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


