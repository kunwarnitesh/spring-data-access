package com.spring.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {


    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getStudentDataFromDb() throws SQLException {
       Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<String> studentList= new ArrayList<>();
        while (resultSet.next()) {
            studentList.add(resultSet.getString("name"));
//            System.out.println(resultSet.getString("name"));
        }

        return studentList;

        /*String sql = "SELECT COUNT(*) FROM student";
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));*/

    }
}
