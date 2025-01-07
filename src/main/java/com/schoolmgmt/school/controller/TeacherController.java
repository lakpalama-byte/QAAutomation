package com.schoolmgmt.school.controller;


import com.schoolmgmt.school.entity.Teacher;
import com.schoolmgmt.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @GetMapping("/{id}")

    public ResponseEntity<Teacher> getTeacherById(@PathVariable Long id) {

        Optional<Teacher> optionalTeacher = teacherService.getTeacherByID(id);
        if (optionalTeacher.isPresent()) {
            Teacher teacher = optionalTeacher.get();
            return new ResponseEntity<>(teacher, HttpStatus.OK);


        } else {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);


        }
    }

    @PostMapping("/save")
    public ResponseEntity<Teacher> createOrUpdateTeacher(@RequestBody Teacher teacher) {

        Teacher savedorUpdatedTeacher = teacherService.createorupdateTeacher(teacher);
        return ResponseEntity.ok(savedorUpdatedTeacher);


    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity <String> deleteTeacher (@PathVariable Long id)   {

        try {
            teacherService.deleteTeacher(id);
            return ResponseEntity.ok(" Teacher is deleted successfully");

        } catch (IllegalArgumentException e)    {
            return ResponseEntity.status(404).body(e.getMessage());

       }
    }


}

