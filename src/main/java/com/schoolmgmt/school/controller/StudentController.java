// CustomerController.java
package com.schoolmgmt.school.controller;

import com.schoolmgmt.school.entity.Student;
import com.schoolmgmt.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getCustomerById(@PathVariable Long id) {
        Optional<Student> optionalCustomer = studentService.getCustomerById(id);
        if (optionalCustomer.isPresent()) {
            Student student = optionalCustomer.get(); // Extract the Customer object from Optional
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping
    public ResponseEntity<Student> createCustomer(@RequestBody Student student) {
        try {
            Student savedStudent = studentService.createorUpdateCustomer(student);
            return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Other controller methods for CRUD operations
}
