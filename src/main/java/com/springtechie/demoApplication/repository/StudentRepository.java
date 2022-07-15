package com.springtechie.demoApplication.repository;


import com.springtechie.demoApplication.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
