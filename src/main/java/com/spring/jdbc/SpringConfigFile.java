package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

    @Bean
    public DriverManagerDataSource myDataSource(){
            DriverManagerDataSource dataSource=new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/STUDENTS");
            dataSource.setUsername("root");
            dataSource.setPassword("tiger");
            return dataSource;
    }

    @Bean
    public JdbcTemplate myJdbcTemplate(){
          JdbcTemplate jdbcTemplate=new JdbcTemplate();
          jdbcTemplate.setDataSource(myDataSource());
//          we are injecting the datasource bean into jdbcTemplate ,so it knows where to get the connection from

          return jdbcTemplate;
    }
}
