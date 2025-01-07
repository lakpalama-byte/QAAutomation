package com.schoolmgmt.school.service;

import com.schoolmgmt.school.entity.Permission;
import com.schoolmgmt.school.repository.PermissionRepos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PermissionService {

    @Autowired
    private PermissionRepos permissionRepos;



    public List <Permission> getAllPermissions()    {

        return permissionRepos.findAll();
    }

    public Permission createPermissions(Permission permission) {
        if(permission.getId() != null)   {
            Optional <Permission> existingPermission=permissionRepos.findById(permission.getId());
            if(existingPermission.isPresent()) {
                Permission updatePermission=existingPermission.get();
                updatePermission.setId(permission.getId());
                updatePermission.setName(permission.getName());
                updatePermission.setDescription(permission.getDescription());
                return permissionRepos.save(updatePermission);


            }
        }
        return permissionRepos.save(permission);
    }

}
