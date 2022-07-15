package com.springtechie.demoApplication.service;

import com.springtechie.demoApplication.entity.Student;
import com.springtechie.demoApplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    public Student saveStudent(Student student){
        return repository.save(student);
    }
    public List<Student> saveStudent(List<Student> students){
        return repository.saveAll(students);
    }
    public List<Student> getStudents(){
        return repository.findAll();
    }
    public Student getStudentById(String id){
        return repository.findById(id).orElse(null);
    }
    public String deleteStudent(String id){
        repository.deleteById(id);
        return "Student removed || "+ id;
    }
    public Student updateStudent(Student student){
        Student existingStudent=repository.findById(student.getId()).orElse(null);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setGender(student.getGender());
        existingStudent.setAddress(student.getAddress());
        existingStudent.setFavouriteSubjects(student.getFavouriteSubjects());
        existingStudent.setTotalSpentInBooks(student.getTotalSpentInBooks());
        existingStudent.setCreated(student.getCreated());
        return repository.save(existingStudent);
    }
}
