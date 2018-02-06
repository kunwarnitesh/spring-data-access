package com.spring.demo;

import com.spring.demo.controller.StudentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config.xml");
        StudentController studentController = applicationContext.getBean(StudentController.class);
        try {
            studentController.getStudentList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
