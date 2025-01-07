package com.schoolmgmt.school.repository;

import com.schoolmgmt.school.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepos  extends JpaRepository <Admin, Long> {
}
