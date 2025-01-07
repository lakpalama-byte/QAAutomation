package com.schoolmgmt.school.repository;

import com.schoolmgmt.school.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepos extends JpaRepository<Permission, Long> {
}
