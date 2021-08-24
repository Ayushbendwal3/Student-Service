package com.restapi.sampleApp.service;

import com.restapi.sampleApp.model.Student;
import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    List<Student> studentList = new ArrayList<>(List.of(
            new Student("1000", "John", "XIth"),
            new Student("1001", "Jane", "Xth"),
            new Student("1002", "Dave", "XIIth")));

    public List<Student> getStudents() {
        return studentList;
    }

    public Student addStudent(Student student) {
        studentList.add(student);
        return student;
    }

    public Student getStudent(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
