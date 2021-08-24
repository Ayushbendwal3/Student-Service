package com.restapi.sampleApp.controller;

import com.restapi.sampleApp.model.Student;
import com.restapi.sampleApp.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("getStudent/{id}")
    public Student getStudent(@PathVariable String id) throws Exception {
        return studentService.getStudent(id);
    }
}
