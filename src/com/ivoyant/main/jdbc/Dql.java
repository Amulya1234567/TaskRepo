package com.ivoyant.main.jdbc;

import java.sql.*;

public class Dql {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/STUDENTS";
        String uname="root";
        String pass="tiger";
        String query="SELECT * FROM STUDENT";
        try {
//            Loading and regestering the driverclass
//            the implementattion class given by
//            database servers or venders known as JDBC Drivers
//            forName() is a static method present in class called as Class
//            which throws ClassNotFoundException
//            which takes fully qualified class name as a argument
            Class.forName("com.mysql.cj.jdbc.Driver");

//            getConnection() is used to establish connection between java and database
//            return type of getConnection() is Connection Interface
//            getConnection() is a factory or helper method present in the
//            factory class called DriverManager(only factory class present JDBC API)
            Connection con= DriverManager.getConnection(url,uname,pass);

//            Statement interface which is used to create a platform for executing the query
//            createStatement() is used to create and return reference object of type Statement interface
//            createStatement() is present inside the Connection interface
            Statement st=con.createStatement();

//            normally the result we get from DQL query is known as Result Set
//            these Result Set is stored on cursor or buffer memory
//            to get the data from cursor or buffer memory ,Resultset Interface is used
//            executeQuery method is present in Statement Interface
            ResultSet rs=st.executeQuery(query);
            while (rs.next())
            {
                System.out.print(rs.getInt(1)+ " - ");
                System.out.print(rs.getString(2)+ "-");
                System.out.println(rs.getInt(3));
            }
        } catch (ClassNotFoundException |  SQLException e) {
            e.printStackTrace();
        }
    }

}


