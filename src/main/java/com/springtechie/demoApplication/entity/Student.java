package com.springtechie.demoApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Student {
   @Id
   private  String id;
   private String firstName;
   private  String lastName;
   @Indexed(unique = true)
   private  String email;
   private String gender;
   private String address;
   private List<String> favouriteSubjects;
   private Double totalSpentInBooks;
   private String created;


}
