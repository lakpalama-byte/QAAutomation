package com.schoolmgmt.school.controller;

import com.schoolmgmt.school.entity.Admin;
import com.schoolmgmt.school.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/admins")
public class AdminController {


    @Autowired
    AdminService adminService;


    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdminByID(@PathVariable Long id) {

        Optional<Admin> admin = adminService.getAdminById(id);
        if (admin.isPresent()) {
            Admin existingAdmin = admin.get();
            return new ResponseEntity<>(existingAdmin, HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }


    @PostMapping
    public ResponseEntity<Admin> createAdmin(Admin admin) {

        try {
            Admin savedAdmin = adminService.createOrUpdateAdmin(admin);
            return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);


        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}