//package com.ourairlines.airlines.dataBaseConnection;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//@Configuration
//public class DataBaseConfiguration {
//
//
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:oracle:thin:@//localhost:1521/orcl3");
//        dataSource.setUsername("sys as sysdba");
//        dataSource.setPassword("Newpassword123");
//        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
//        return dataSource;
//    }
//
//
//
//}
