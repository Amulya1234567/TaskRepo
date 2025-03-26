package com.spring.jdbc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
@Slf4j
public class Dml
{
    public static void main( String[] args )
    {

//        int sid=11;
//        String sname="deepak";
//        int marks=88;
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);

        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
//        Insert operation

//        String query="INSERT INTO Student VALUES(?,?,?)";
//        int count=jdbcTemplate.update(query, sid, sname, marks);
//        if(count >0){
//            System.out.println("insersion success");
//        }else{
//            System.out.println("insersion failed");
//        }


//        update operation

//        int MARKS=67;
//
//        String query="UPDATE Student SET MARKS=? WHERE SID=1";
//        int count=jdbcTemplate.update(query,MARKS);
//        if(count>0){
//            System.out.println("update success");
//        }else{
//            System.out.println("update is not success");
//        }


        int SID=3;
        String query="DELETE FROM Student WHERE SID=?";
        int count=jdbcTemplate.update(query,SID);
        if(count>0){
            log.info("Delete is success");
        }else{
            log.error("Delete is not success");
        }

    }
}
