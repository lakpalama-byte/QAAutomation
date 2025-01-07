package com.schoolmgmt.school.service;

import com.schoolmgmt.school.entity.Admin;
import com.schoolmgmt.school.repository.AdminRepos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AdminService {

    @Autowired
   private AdminRepos adminRepos;

    public Optional<Admin> getAdminById (Long id)   {

        return adminRepos.findById(id);



    }

    public Admin createOrUpdateAdmin(Admin admin) {
        if (admin.getId() != null  || admin.getEmail() == null || admin.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null for the admin");

        }
        return adminRepos.save(admin);
    }
    }


