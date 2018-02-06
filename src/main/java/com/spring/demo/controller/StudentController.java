package com.spring.demo.controller;


import com.spring.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/nitesh")
    @ResponseBody
    String applicationStarting() {
        return "Hello Spring";
    }

    @RequestMapping("/login")
    ModelAndView getLoginForm() {
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;

    }

    @RequestMapping("/studentDataFromDB")
    ModelAndView getStudentName() {
        List<String> list=studentService.getStudentList();
        ModelAndView modelAndView = new ModelAndView(list.get(0)+"");
        return modelAndView;

    }

    @Autowired
    StudentService studentService;

    public void getStudentList() {
        studentService.getStudentList();
    }
}
