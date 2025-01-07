package com.schoolmgmt.school.controller;

import com.schoolmgmt.school.entity.Permission;
import com.schoolmgmt.school.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PermissionController {

    @Autowired
    private PermissionService permissionService;



    @GetMapping
    // use the list if want to retrieve the multiple items
    // use the optional to retrieve single items


    public ResponseEntity<List<Permission> >getAllPermissions()  {
     List   <Permission> permissions=permissionService.getAllPermissions();

        return new ResponseEntity<>(permissions, HttpStatus.OK);



    }

    @PostMapping
     public ResponseEntity <Permission>   createOrUpdatePermission(@RequestBody Permission permission) {
        Permission permissions= permissionService.createPermissions(permission);

        return ResponseEntity.ok(permissions);
    }






}



