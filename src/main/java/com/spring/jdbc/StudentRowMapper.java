package com.spring.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

//    RowMapper is an interface provided by SpringJDBC
//    RowMapper is used to convert each row of ResultSet (from a sql query) into a java object(Student)
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

//        mapRow() is an overridden method which takes database
//        resultset and converts into Student object
//        throws SQL Exception
        Student std=new Student();
//        creates student object where retrieved database values will be stored
        std.setSid(rs.getInt("SID"));
        std.setSname(rs.getString("SNAME"));
        std.setMarks(rs.getInt("MARKS"));
        return std;
    }
}
