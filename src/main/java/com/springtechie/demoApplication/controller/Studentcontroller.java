package com.springtechie.demoApplication.controller;

import com.springtechie.demoApplication.entity.Student;
import com.springtechie.demoApplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Studentcontroller {
    @Autowired
    private StudentService service;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudent(students);
    }
    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }
    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable String id){
        return service.getStudentById(id);
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable String id){
        return service.deleteStudent(id);
    }
}
