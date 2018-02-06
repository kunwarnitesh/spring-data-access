package com.spring.demo.service;

import com.spring.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepository studentRepository;

    public List<String> getStudentList() {
        try {
            return studentRepository.getStudentDataFromDb();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
