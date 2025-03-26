package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Dql {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbc=context.getBean(JdbcTemplate.class);
//        SELECT OPERATION
         String query="SELECT * FROM Student";
//         the query fetches all the rows from student table
//        for each row spring calls mapRow() to create a student object
         List<Student> lst=jdbc.query(query,new StudentRowMapper());
//         finally list of student objects is returned
         for(Student std:lst){
             System.out.println("SID is "+std.getSid());
             System.out.println("NAME is "+std.getSname());
             System.out.println("Marks is "+std.getMarks());
             System.out.println("-------------------------------------");
         }

    }
}
